public class Delavec {
    protected int id;
    protected String ime;
    protected double urnaPostavka;
    protected int štUr;
    protected double brutoPlača;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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

    public double getBrutoPlača() {
        brutoPlača=štUr*urnaPostavka;
        return brutoPlača;
    }
    public void izpis()
    {
     System.out.println("*******DELAVEC**********");
     System.out.println("Id          "+id);
     System.out.println("Ime         "+ime);
     System.out.println("Št. ur      "+štUr);
     System.out.println("Urna pos    "+urnaPostavka);
     System.out.println("Bruto plača "+getBrutoPlača());
     System.out.println("**************************");
    }

   
}
