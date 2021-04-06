

public class SobaZVrati extends Soba implements IZunanjaVrata{
    String opVrat;
    Lokacija lv;
    public SobaZVrati(String i,int n,String d,String ov)
    {
    super(i,n,d);
    opVrat=ov;
    }

    @Override
    public String opisVrat() {
       return opVrat;
    }

    @Override
    public Lokacija lokacijaVrat() {
      return lv;
    }
    public String getOpis()
    {
    return super.getOpis()+"\nVidiš "+opVrat+" na "+lv.ime;
    }
    
}
