
public class Lokacija {
    protected String ime;
    protected Lokacija[] izhodi;
    public Lokacija(String i,int n) //n je število izhodov
    {
     ime=i;
     izhodi=new Lokacija[n];
    }
    public String getOpis()
    {
    String r="Trenutno si v "+ime+"\nOd tu lahko greš";
    for (int k=0;k<izhodi.length;k++)
    {
     r+=" "+k+"- "+izhodi[k].ime+", "; //od tu lahko greš 0-kuhnja,1-dnevna soba
    }
    return r;
    }
}
