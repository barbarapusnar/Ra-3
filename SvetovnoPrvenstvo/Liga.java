import java.util.Scanner;

public class Liga {
    Ekipa[] prvenstvo=new Ekipa[10];
    Ekipa[] urejeni=new Ekipa[10];
    int x=0;
    int y=1;
    int[] gor={2,3,4,5};
    int[] dol={9,8,7,6};
    int[][] pari=new int[10][10];
    public void napolnipare(int kolo)
    {
        pari[x][y]=kolo;
        for (int k=0;k<4;k++)
        {
            pari[gor[k]][dol[k]]=kolo;
        }
        //zavrti
        int temp=y;
        y=dol[0];
        dol[0]=dol[1];
        dol[1]=dol[2];
        dol[2]=dol[3];
        dol[3]=gor[3];
        gor[3]=gor[2];
        gor[2]=gor[1];
        gor[1]=gor[0];
        gor[0]=temp;
    }
    public void napolnipare()
    {
        for (int kolo=1;kolo<=9;kolo++)
        {
            napolnipare(kolo);
        }

    }
    public void izpišiTurnir()
    {
        napolnipare();
        for (int kolo=1;kolo<=9;kolo++)
        {
            System.out.println("---------------------------");
            System.out.println("Pari "+kolo+". kola");
            System.out.println("---------------------------");
            //izpiši pare tega kola
            for (int k=0;k<10;k++)
            {
                for (int j=0;j<10;j++)
                {
                    if (pari[k][j]==kolo)
                    {
                       System.out.println(prvenstvo[k].ime+":"+prvenstvo[j].ime); 
                    }
                }

            }

        }

    }
    public void inicializacija()
    {
        prvenstvo[0]=new Ekipa("Italija");
        prvenstvo[1]=new Ekipa("Škotska");
        prvenstvo[2]=new Ekipa("Irska  ");
        prvenstvo[3]=new Ekipa("Španija");
        prvenstvo[4]=new Ekipa("Nemčija");
        prvenstvo[5]=new Ekipa("Anglija");
        prvenstvo[6]=new Ekipa("Poljska");
        prvenstvo[7]=new Ekipa("Češka  ");
        prvenstvo[8]=new Ekipa("Finska ");
        prvenstvo[9]=new Ekipa("Belgija");      
    }
    public void izpis()
    {
        System.out.println("Ekipa\t\tŠt.točk\tŠt.tekem");
        System.out.println("----------------------------------");
        for (int k=0;k<10;k++)
        {
            urejeni[k].izpis();
        }

    }
    public void obdelajrezultat(int kolo)
    {
        Scanner sc=new Scanner(System.in);
        for (int k=0;k<10;k++)
        {
            for(int j=0;j<10;j++)
            {
                if (pari[k][j]==kolo)
                {
                    System.out.print(prvenstvo[k].ime+":"+prvenstvo[j].ime+" ");
                    String rezultat=sc.nextLine(); //2:3
                    int poz=rezultat.indexOf(":");
                    int a=Integer.parseInt(rezultat.substring(0,poz));
                    int b=Integer.parseInt(rezultat.substring(poz+1));
                    prvenstvo[k].vnesiRezultat(a, b);
                    prvenstvo[j].vnesiRezultat(b, a);
                }
            }
        }

    }
    public  void bubbleEkipe(Ekipa[] a)
    {
        for (int k=0;k<10;k++)
        {
            a[k]=prvenstvo[k];
        }
        for (int j=0;j<a.length-1;j++)
        {
            for (int i=0;i<a.length-1;i++)
            {
                if (!a[i].boljšaEkipa(a[i+1]))
                {
                    Ekipa temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
           
        }

    }
}
