import javax.swing.*;
import java.awt.*;
public class KarteB extends JFrame {
    String[] barve={"d","k","s","b"};
    String[] vrednosti={"1","2","3","4","5","6","7","f","k","kr"};
    ImageIcon[] slike=new ImageIcon[40];
    JButton[] kup=new JButton[40];
    String pot="E:\\Barbara\\RAC3\\KarteZaBriskulo\\";
    public KarteB()
    {
        setSize(900,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel karte=new JPanel();
        nastaviSlike();
        for (int k=0;k<40;k++)
        {
            kup[k]=new JButton();
            kup[k].setIcon(slike[k]);
            karte.add(kup[k]); //dodaj gumb na panel
        }
        //dodaj panel na formo
        this.getContentPane().add("Center",karte);
    }
    public void nastaviSlike()
    {
       for (int k=0;k<barve.length;k++)
       {
           for (int j=0;j<vrednosti.length;j++)
           {
               String celaPot=pot+vrednosti[j]+barve[k]+".jpg";
               slike[k*vrednosti.length+j]=new ImageIcon(celaPot);
           }
       } 
       for (int k=0;k<40;k++)
       {
         int r=k+(int)(Math.random()*(40-k));
         ImageIcon temp=slike[k];
         slike[k]=slike[r];
         slike[r]=temp;
       }

    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KarteB().setVisible(true);
            }
        });
    }
}
