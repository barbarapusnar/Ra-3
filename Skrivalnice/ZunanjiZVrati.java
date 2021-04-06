public class ZunanjiZVrati extends Zunanji implements IZunanjaVrata {
    String opVrat;
    Lokacija lv;
    public ZunanjiZVrati(String i,int n,boolean d,String ov)
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
