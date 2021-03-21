

public class Kompleksno {
    double re;
    double im;
    public Kompleksno(double x,double y)
    {
       re=x;im=y;
    }
    public void Izpiši()
    {
        System.out.println(re+"+"+im+"*i");
    }
    public Kompleksno plus(Kompleksno b)
    {
        double r=this.re+b.re;
        double i=this.im+b.im;
        Kompleksno rezultat=new Kompleksno(r,i);
        return rezultat;
    }
    public Kompleksno krat(Kompleksno b )
    {
        double r=re*b.re-im*b.im;
        double i=re*b.im+im*b.re;
        Kompleksno rezultat=new Kompleksno(r,i);
        return rezultat;

    }
    public double absolutna()
    {
     return Math.sqrt(re*re+im*im);
    }
}
