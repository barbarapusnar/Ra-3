import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIMinolovec extends JFrame implements ActionListener{
    JButton[][] gumbi=new JButton[10+2][10+2];
    LogikaIgre m=new LogikaIgre();
    JPanel flp=new JPanel();
    public GUIMinolovec()
    {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.nastaviMine();
        m.izračunaj();
        for (int k=1;k<=10;k++)
        {
            for (int j=1;j<=10;j++)
            {
                gumbi[k][j]=new JButton();
                gumbi[k][j].setSize(50,50);
                gumbi[k][j].setLocation((k-1)*50,(j-1)*50);
                if (m.mine[k][j])
                  gumbi[k][j].setText("*");
                else
                 gumbi[k][j].setText(m.rešitve[k][j]+"");
                gumbi[k][j].setBackground(Color.gray);
                gumbi[k][j].setForeground(Color.gray);
                gumbi[k][j].addActionListener(this);
                flp.add(gumbi[k][j]);
            }
        }
        this.getContentPane().add(flp);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMinolovec().setVisible(true);
            }
        });
    }

  
    public void actionPerformed(ActionEvent e) {
       JButton b=(JButton)e.getSource();
       b.setForeground(Color.black);
       if (b.getText().equals("*"))
        {
            JOptionPane.showMessageDialog(this,"KONEC!!");
        }
    }
}
