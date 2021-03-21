public class LDelavec extends Delavec {
    public LDelavec() {
        letnaPlača=15000;
    }
    private double letnaPlača;

    public double getLetnaPlača() {
        return letnaPlača;
    }

    public void setLetnaPlača(double letnaPlača) {
        this.letnaPlača = letnaPlača;
    }
    public double getBrutoPlača()
    {
        brutoPlača=letnaPlača/12;
        return brutoPlača;
    }
    public void izpis()
    {
     System.out.println("*******Letni DELAVEC**********");
     System.out.println("Id          "+id);
     System.out.println("Ime         "+ime);
     System.out.println("Letna plača "+letnaPlača);
     System.out.println("Bruto plača "+getBrutoPlača());
     System.out.println("**************************");
    }

}
