public class Nogomet {
    public static void main(String[] args) {
        Liga a=new Liga();
        a.inicializacija();  
        a.izpišiTurnir();
        a.obdelajrezultat(1);
        //uredi tabelo za izpis od najbolšega do najslabšega
        // moštva
        a.bubbleEkipe(a.urejeni);
        a.izpis();
    }
}
