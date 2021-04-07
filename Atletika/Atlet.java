public abstract class Atlet
{
    int startnaSt;
    String priimek;
    String ime;
    String klub;
    public Atlet(int s, String p, String i, String k) {
        startnaSt=s;priimek=p;ime=i;klub=k;
    }
    public abstract void vnesiRezultat();
    public String toString()
    {
        return "Štartna številka "+startnaSt+
        "\nAtlet "+priimek+" "+ime+
        "\nKlub  "+klub;
    }
    //dodaj razred Metalec, ki deduje od atleta, dodatno ima tabelo
    //6 elementov, kjer bomo vnašali dolžine metov - 65,00 do 90, 
    //imediscipline
    //sprogramiraj vnos rezultata in metodi toString 
    //dodaj izpis vseh metov
    //dodaj razred tekac, ki deduje od atleta, dodan ima rezultat teka
    //v urah, minutah, sekundah, stotinkah, dolžina teka
    //sprogramiraj vnos rezultata in metodi toString 
    //dodaj izpis doseženega časa
    //dodaj razred z metodo main
    //1, Primož Kozmus, Kladivar, met kladiva, 77.45, 89.36,0,0,0,0
    //2, Matic Osovnikar, Slovan,100m, 0:0: 9:88 
}