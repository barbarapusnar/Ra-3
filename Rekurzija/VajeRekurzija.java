public class VajeRekurzija
{
public static void main(String[] args) {
    VajeRekurzija v=new VajeRekurzija();
    System.out.println("5!="+v.fakultetai(5));
    System.out.println("5!="+v.fakultetar(5));
    System.out.println("2 na 10 "+v.dvanan(10));
    System.out.println("8 fibonaccijevo število je "+v.fib(8));
}
//iterativna metoda, ki izračuna n!
public int fakultetai(int n)
{
    int produkt=1;
    for (int k=1;k<=n;k++)
     produkt *= k;
    return produkt;
}
//rekurzivna metoda, ki izračuna n!
public int fakultetar(int n)
{
     if (n==0) //robni pogoj
      return 1;
    return n*fakultetar(n-1); //rekurzivni klic
}
public int dvanan(int n)
{
 if (n==0)
    return 1;
return 2*dvanan(n-1);
}
//vrni n-ti člen fib zaporedja
public int fib(int n)
{

    if (n==1)
     return 1;
    if (n==2)
     return 1;
     return fib(n-1)+fib(n-2);
}
}