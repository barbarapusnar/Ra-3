import java.util.*;
public class Zank2 {
    
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.println("Vnesi x");
     double x=sc.nextDouble(); //računam za znani x
     double vsota=1;
     double člen=1;
    //  for (int k=1;k<=10;k++)
    //  {
    //     člen=člen*x/k;
    //     vsota=vsota+člen;
    //  }
     int k=1;
     while(Math.abs(vsota-Math.exp(x))>=0.000001){
               člen=člen*x/k;
               k++;
               vsota=vsota+člen;
     }
    // do  {
    //             člen=člen*x/k;
    //             k++;
    //             vsota=vsota+člen;
    //   }
    //   while(Math.abs(vsota-Math.exp(x))>=0.000001);
     System.out.println("Izračunan rezultat je "+vsota);
     System.out.println("Rač ima               "+Math.exp(x));
     System.out.println("k= "+k);

    }
}
