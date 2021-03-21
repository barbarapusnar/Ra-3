import java.awt.*;
import javax.swing.*;
public class GlavnoOkno extends JFrame
{
 PanelZaRisanje a;
 public GlavnoOkno() {
     setSize(1000,1000);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     a=new PanelZaRisanje();
 }
 public void paint(Graphics g)
 {
 a.riši4(g);
 }
 public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new GlavnoOkno().setVisible(true);
        }
    });
}
}