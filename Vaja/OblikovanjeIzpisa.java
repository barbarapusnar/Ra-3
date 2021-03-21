import java.util.Scanner;
public class OblikovanjeIzpisa {
    public static void main(String[] args) {
       int kolikokrat=3;
       System.out.println("Dobro jutro "+kolikokrat+" krat"); 
       System.out.printf("Dobro jutro %d krat%n",kolikokrat);
       // %s=nizi, %d cela števila, %f realna števila
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("Kako ti je ime?");
    //    String ime=sc.nextLine();
    //    System.out.printf("Pozdravljen, %s!%n",ime); 
       int x=12345;
       System.out.println("Brez formata :"+x);
       System.out.printf ("S formatom   :%10d%n",x);
       System.out.printf ("S formatom   :%2d%n",x);
       int y=12;
       System.out.printf("Desetiško       :%10d, drugo število %10o%n",y,x);
       System.out.printf("Osmiško         :%10o%n",y);
       System.out.printf("Šestnajstiško   :%10x%n",y);
       double realno=12345.6789;
       System.out.printf("Realno :%10.2f%n",realno);
       // %[zastavica][dolžina].[natančnost]črka zastavica + izpisuj predznak,^ velike črke,0 vodilne ničle
       System.out.printf("Realno :%+10.2f%n",realno);
       System.out.printf("Realno :%010.2f%n",realno);

       
    }
}
