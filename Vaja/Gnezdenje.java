public class Gnezdenje
{
public static void main(String[] args) {
    
// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999
    for (int k=1;k<=3;k++)
    {
    //izpiši eno vrstico
    for (int j=0;j<=9;j++)
    {
        for (int z=0;z<3;z++)
        {System.out.print(j);}
    }
    System.out.println();
    }
// 9999888877776666555544443333222211110000
// 9999888877776666555544443333222211110000
// 9999888877776666555544443333222211110000
// 9999888877776666555544443333222211110000
  //pascalov trikotnik
  for(int n=0;n<=12;n++)
  {
      //izpiši tab za vsako vrstico
   for (int k=0;k<12-n;k++)
   {
       System.out.print(" ");
   }
   for (int k=0;k<=n;k++)
   {
   //izračunaj in izpiši (n nad k)
    int izračun=fakulteta(n)/(fakulteta(k)*fakulteta(n-k));
    System.out.printf("%3d  ",izračun);
   }//konec for k
   System.out.println();
  }//konec for j
}//konec main
public static int fakulteta(int x)
{
//x!=x*(x-1)*(x-2)*.....*1
int produkt=1;
for (int j=x;j>=1;j--)
{
produkt=produkt*j;
}
return produkt;
}

}