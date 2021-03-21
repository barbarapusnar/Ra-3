public class Vaja1 {
    static byte[] izpit=new byte[10];
    static byte[] vaje=new byte[10]; 
    static double[] povOc=new double[2];
    static int[] maxOcena=new int[3];
    //pri 0=izpiti,1 vaje,2 skupna
    static double std[]=new double[2];
    public static void main(String[] args) {
        napolniTabelo();
        analizaOcen();
        izpišiRezultate();
    }  
    public static void napolniTabelo()
    {
        for(int k=0;k<10;k++)
        {
            izpit[k]=(byte)(Math.random()*11);
            if (izpit[k]<=5) vaje[k]=0;
            else
            vaje[k]=(byte)(Math.random()*5+6);

        }
    }
    public static void analizaOcen()
    {
        int vi=0; int vv=0;int šti=0;int štv=0;
        int maxi=0; int maxv=0;int maxs=0;
        int ii=0; int iv=0;int is=0;
        double sti=0; double stv=0;
        //povprečja, index max ocene
        for (int k=0;k<10;k++)
        {
            if (izpit[k]>5)
            {
                vi+=izpit[k];šti++;
                if (izpit[k]>maxi)
                {
                    maxi=izpit[k];
                    ii=k;
                }
            }
            if (vaje[k]>5)
            {
                vv+=vaje[k];štv++;
                if (vaje[k]>maxv)
                {
                    maxv=vaje[k];
                    iv=k;
                }
            }
            if (vaje[k]+izpit[k]>maxs)
            {
                maxs=vaje[k]+izpit[k];
                is=k;
            }
        }
        maxOcena[0]=ii;
        maxOcena[1]=iv;
        maxOcena[2]=is;
        if (šti!=0)
        povOc[0]=(double)vi/šti;
        if (štv!=0)
        povOc[1]=(double)vv/štv;
        //standardne deviacije
        for (int k=0;k<10;k++)
        {
            if (izpit[k]>=5)
            {
                sti+=(izpit[k]-povOc[0])*(izpit[k]-povOc[0]);
            }
            if (vaje[k]>=5)
            {
                stv+=(vaje[k]-povOc[1])*(vaje[k]-povOc[1]);
            }
        }
        std[0]=Math.sqrt(sti/(ii-1));
        std[1]=Math.sqrt(stv/(iv-1));
    }
    public static void izpišiRezultate()
    {
        System.out.println("Izpiti");
        for (int k=0;k<10;k++)
        {
            System.out.print(izpit[k]+"\t");
        }
        System.out.println();
        System.out.println("Vaje");
        for (int k=0;k<10;k++)
        {
            System.out.print(vaje[k]+"\t");
        }
        System.out.println();
        System.out.println("Povprečja");
        System.out.println(povOc[0]+"\t"+povOc[1]);
        System.out.println("Najvišje ocene");
        System.out.println(maxOcena[0]+"\t"+maxOcena[1]+"\t"+maxOcena[2]);
        System.out.println("Standardne deviacije");
        System.out.println(std[0]+"\t"+std[1]);
    }    
}
