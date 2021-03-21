public class Tabele {
    public static void main(String[] args) {
        int[] a=new int[100];
        double[] b={4.5,2.3,12.7};
        System.out.println("Prvi element a "+a[0]);
        System.out.println("Prvi element b "+b[0]);
        //polnjenje tabele z naključnimi vrednostmi
        for (int k=0;k<100;k++)
        {
            a[k]= (int)(Math.random()*100);
        }
        //izpis
        for (int k=0;k<100;k++)
        {
            System.out.println(a[k]);
        }
        for (int k=0;k<b.length;k++)
        {
            System.out.println(b[k]); 
        }
        //izračunaj vsoto vseh elemntov a
        int vsota=0;
        for (int k=0;k<a.length;k++)
        {
            vsota=vsota+a[k];
        }
        System.out.println("Vsota je "+vsota);
        System.out.println("Povprečje je "+vsota/100.0);
        //min element,indeks min elementa
        int min=a[0];
        int minindeks=0;
        for (int k=1;k<100;k++)
        {
            if (a[k]<min)
            {
                min=a[k];
                minindeks=k;
            }

        }
        System.out.println("Najmanjši element je "+min);
        System.out.println("Na mestu "+minindeks);
    }
}
