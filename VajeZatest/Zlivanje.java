public class Zlivanje
{
    public static void main(String[] args) {
        int[] a=new int[25];
        int [] b =new int[25];
        int[] c=new int[50];
        polni(a);izbiranje(a);
        polni(b);izbiranje(b);
        int ic=0; int ia=0;int ib=0;
        while (ic<c.length)
        {
           if (ia<a.length && ib<b.length) 
           //prepisuj iz ene ali druge tabele, dokler ne zmanjka
           //elementov v eni izmed obeh tabel
            {
            if ( a[ia]<=b[ib])
            {
                  c[ic]=a[ia];
                  ia++;
             }
            else 
            {               
                    c[ic]=b[ib];
                    ib++;
            }            
            }
            else //prišla sem do konca tabele a ali b, grem vwn iz zanke
            {
                break;
            }
            System.out.println(c[ic]);
            ic++;
           
        }
        if (ic<c.length) //preverim, če sem že prepisala vse elemente
        {
            while (ia<a.length)//sem že vse iz a?,
            // samo ena od teh dveh while se bo izvedla
            //lahko pa nobena
            {
                c[ic]=a[ia];
                System.out.println(c[ic]);
                ia++;
                ic++;
            }
            while (ib<b.length)//sem že vse iz b?
            {
                c[ic]=b[ib];
                System.out.println(c[ic]);
                ib++;
                ic++;
            }
           
        }
    }
    public static void polni(int[] a)
    {
        for (int k=0;k<a.length;k++)
        {
            a[k]=(int)(Math.random()*50+1);

        }
    }
    public static void izbiranje(int[] a)
    {
        for (int k=0;k<a.length-1;k++)
        {
            //poišči najmanjši element od k do konca tabele
            int min=a[k];
            int minindeks=k;
            for (int j=k+1;j<a.length;j++)
            {
                if (a[j]<min)
                {
                    min=a[j];
                    minindeks=j;
                }
            }
            //zamenjaj najmanjšega s prvim preostanka tabele
            int x=a[k];
            a[k]=a[minindeks];
            a[minindeks]=x;
            //izpis(a);
        }
    }
}