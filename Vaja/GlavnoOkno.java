
import java.awt.*;

public class GlavnoOkno extends javax.swing.JFrame {
PanelZaRisanje a;
    /**
     * Creates new form GlavnoOkno
     */
    public GlavnoOkno() {
      
        setSize(400,400);
        a=new PanelZaRisanje();
    }
public void paint(Graphics g)
{
a.Riši(g);
}
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new GlavnoOkno().setVisible(true);
        }
    });
}
}