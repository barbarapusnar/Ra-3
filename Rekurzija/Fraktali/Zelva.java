

public class Zelva {
    double x;
    double y; //pozicija želve
    int kot; //kot glede na os x
    public Zelva(double x1,double y1, int kot1) {
       x=x1;y=y1;kot=kot1;
    }
    public void obratLevo(int alfa)
    {
        kot=kot+alfa;
    }
    public void pomik(double d)
    {
    //PREMAKNI SE V DANI SMERI za razdaljo d
    double x0=x;double y0=y;
    x=x0+d*Math.cos(Math.toRadians(kot));
    y=y0+d*Math.sin(Math.toRadians(kot));
    StdDraw.line(x0,y0,x,y);
    }
}
