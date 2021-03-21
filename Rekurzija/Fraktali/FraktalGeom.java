

import java.awt.Color;

public class FraktalGeom {
    public static void main(String[] args) {
      double xc=-0.5;
      double yc=0;
      Kompleksno c=new Kompleksno(xc,yc);
      double velikost=2;
      int n=512;
      Picture pic=new Picture(n,n);
      Color barva;
      for (int i=0;i<n;i++)
      {
        for (int j=0;j<n;j++)
        {
            double x0=xc-velikost/2+velikost*i/n; //preslikava med ravnino slike in kompleksno
            double y0=yc-velikost/2+velikost*j/n;
            Kompleksno z0=new Kompleksno(x0,y0);
            int t=mandelbrot(z0,255);
            if (t==255)
             barva=new Color(t,0,0);
            else
              barva=new Color(255-t,255-t,255-t);
            pic.set(i,n-1-j,barva);
        }
      }
      pic.show();
    }
    public static int mandelbrot(Kompleksno z0,int max)
    {
        //računa zaporedje z(i+1)=z(i)*z(i)+z0, dokler ni absolutna vrednost z(i) več od 2
        //ali smo naredili že več kot max korakov
        Kompleksno z=z0;
        for (int t=0;t<max;t++)
        {
            if (z.absolutna()>2) return t;
            z=z.krat(z).plus(z0);
        }
        return max;
    }






    public static void sierpinski(int n,double x1,double y1,double x2,double y2,
    double x3,double y3)
    {
     if (n==0)
     {
        StdDraw.line(x1,y1,x2,y2); //vodoravna AB
        StdDraw.line(x2,y2,x3,y3);//BC
        StdDraw.line(x1,y1,x3,y3);//AC

     }
     else
     {
        double x12=(x1+x2)/2; //a'
        double y12=(y1+y2)/2;
        double x23=(x2+x3)/2;//b'
        double y23=(y2+y3)/2;
        double x13=(x1+x3)/2;//c'
        double y13=(y1+y3)/2;
        //a,a',c'
        sierpinski(n-1,x1,y1,x12,y12,x13,y13);
        //a',b,b'
        sierpinski(n-1,x12,y12,x2,y2,x23,y23);
        //c',b',c
        sierpinski(n-1,x13,y13,x23,y23,x3,y3);
     }

    }
    public static void drevo(int n,Zelva z,double korak)
    {
        StdDraw.setPenRadius(0.001*Math.pow(n,1.2));
        Color c=new Color(0,255,0); //R=0,G=0,B=0
        StdDraw.setPenColor(c);
        z.pomik(korak);
        if (n==0)
        {return;}
        Zelva leva=new Zelva(z.x,z.y,z.kot+10+35);
        Zelva desna=new Zelva(z.x,z.y, z.kot+10-35);
        Zelva srednja=new Zelva(z.x,z.y,z.kot+20);
        drevo(n-1,leva,korak*0.8);
        drevo(n-1,desna,korak*0.8);
        drevo(n-1,srednja,korak*(1-0.8));

    }
    public static void koch(int n,double korak,Zelva z)
    {
        if (n==0)
        {
            z.pomik(korak);
            return;
        }
        int x=(int)(Math.random()*255);
        Color c=new Color(255-x,x,x);
        StdDraw.setPenColor(c);
        koch(n-1,korak,z);
        z.obratLevo(60);
        koch(n-1,korak,z);
        z.obratLevo(-120);
        koch(n-1, korak, z);
        z.obratLevo(60);
        koch(n-1, korak, z);

    }
}
