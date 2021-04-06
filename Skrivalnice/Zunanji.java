


public class Zunanji extends Lokacija{
    boolean jeVroče;
    public Zunanji(String i,int n,boolean v)
    {
    super(i,n);
    jeVroče=v;
    }
    public String getOpis()
    {
     if (jeVroče)
         return super.getOpis()+"\nTukaj je vroče";
     else
          return super.getOpis()+"\nTukaj ni vroče";
    }
}
