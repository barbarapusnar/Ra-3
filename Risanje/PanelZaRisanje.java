import java.awt.*;

import javax.swing.colorchooser.ColorChooserComponentFactory;
public class PanelZaRisanje {
    public void riši(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 40, 40);
        g.fillOval(150, 50, 40, 40);
        g.setColor(Color.RED);
        g.fillRect(80, 65, 80, 80);
    }
    public void riši1(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 40, 40);
        g.fillOval(150, 50, 40, 40);
        g.setColor(Color.RED);
        g.fillRect(80, 65, 80, 80);
    }
    public void riši2(Graphics g)
    {
        g.setColor(Color.BLACK);
        for (int k=0;k<=9;k++)
        {
            g.drawRect(50+k*20, 50+k*20, 150-2*20*k, 150-2*20*k);

        }

    }
    public void riši3(Graphics g,int x,int y,int širina,int višina)
    {
        g.setColor(Color.GREEN);
        g.drawRect(x, y, širina, višina);
        //+ na koncu
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, širina, višina);
        g.setColor(Color.BLACK);
        for (int k=0;k<10;k++)
        {
            g.drawOval(x+k*5, y+k*5, širina-2*5*k, višina-2*5*k);

        }
        g.setColor(Color.GREEN);
        g.drawLine(x+širina/2, y, x+širina/2, y+višina);
        g.drawLine(x, y+višina/2, x+širina, y+višina/2);
    }
    public void riši4(Graphics g)
    {
        riši3(g,50,50,100,100);
        

    }
}
