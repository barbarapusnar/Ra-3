public class Soba extends Lokacija {
    String dekoracija;
    public Soba(String i,int n,String d)
    {
    super(i,n);
    dekoracija=d;
    }
    public String getOpis()
    {
    return super.getOpis()+"\nVidiš "+dekoracija;
    }
}
