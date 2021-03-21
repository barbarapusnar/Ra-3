
import java.util.*;
public class Urejanje
{
    static int[] a;
    public static void main(String[] args) {      
        // a=new int[5000000];
        // polni(a);
        // Calendar c=new GregorianCalendar();
        // Date d=c.getTime();
        // long ms=d.getTime();
        // quickSort(0, a.length-1);
        // Calendar c1=new GregorianCalendar();
        // Date d1=c1.getTime();
        // long ms1=d1.getTime();
        // System.out.println("Quick "+(ms1-ms)+" milisekund");
        String[] nizi={"zvezda","astro","matematika","meja",
        "beno"};
        bubbleStringi(nizi);
        for (int k=0;k<5;k++)
         System.out.println(nizi[k]);
    }
    public static int pivot(int zač, int konec)
    {
        //razdeli tabelo na dva dela, glede na pivotni element
        int p=a[zač];
        int m=zač;
        int n=konec+1;
        //poišči z m prvega, ki je večji od pivota
        do {m=m+1;}while(a[m]<=p && m<konec);
        //poišči prvega z n, ki je manjši od pivota
        do {n=n-1;}while(a[n]>p);
        while (m<n)
        {
            int temp=a[m];
            a[m]=a[n];
            a[n]=temp;
            //poišči z m prvega, ki je večji od pivota
            do {m=m+1;}while(a[m]<=p);
            //poišči prvega z n, ki je manjši od pivota
            do {n=n-1;}while(a[n]>p);
        }
        //postavi še pivotni element na mesto n
        int temp2=a[n];
        a[n]=a[zač];
        a[zač]=temp2;
       
        return n;
    }
    public static void quickSort(int zač, int konec)
    {
        if (zač>=konec)return;
        int zaDelitev=pivot(zač,konec);
        quickSort(zač, zaDelitev-1);
        quickSort(zaDelitev+1, konec);
    }
    public static void polni(int[] a)
    {
        for (int k=0;k<a.length;k++)
        {
            a[k]=(int)(Math.random()*50000);

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
    public static void vstavljanje(int[] a)
    {
        for (int k=1;k<a.length;k++)
        {
            //pogreznik k-ti elemnt tako, da bodo elementi od 0 do k urejeni
            int j=k;int temp=a[k];
            while (j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
            }
            //dobila sem mesto za elemnt, ki ga vstavljam
            a[j]=temp;
           // izpis(a);
        }

    }
    public static void bubble(int[] a)
    {
        for (int j=0;j<a.length-1;j++)
        {
            for (int i=0;i<a.length-1;i++)
            {
                if (a[i]>a[i+1])
                {
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
           // izpis(a);
        }

    }
    public static void izpis(int[] a)
    {
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+"\t");
        }
        System.out.println();
    }
    public static void bubbleStringi(String[] a)
    {
        for (int j=0;j<a.length-1;j++)
        {
            for (int i=0;i<a.length-1;i++)
            {
                if (a[i].compareTo(a[i+1])>0)
                {
                    String temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
           // izpis(a);
        }

    }
}