public class UrniDelavec extends DelavecSuper {
    protected double urnaPostavka;
    protected int štUr;
   
    public double getBrutoPlača() {
        brutoPlača=štUr*urnaPostavka;
        return brutoPlača;
    }

   
    public void izpis() {
       
        System.out.println("*******DELAVEC**********");
        System.out.println("Id          "+id);
        System.out.println("Ime         "+ime);
        System.out.println("Št. ur      "+štUr);
        System.out.println("Urna pos    "+urnaPostavka);
        System.out.println("Bruto plača "+getBrutoPlača());
        System.out.println("**************************");
    }

    public double getUrnaPostavka() {
        return urnaPostavka;
    }

    public void setUrnaPostavka(double urnaPostavka) {
        this.urnaPostavka = urnaPostavka;
    }

    public int getŠtUr() {
        return štUr;
    }

    public void setŠtUr(int štUr) {
        this.štUr = štUr;
    }
    
}
