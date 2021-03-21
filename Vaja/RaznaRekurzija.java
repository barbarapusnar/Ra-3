public class RaznaRekurzija {
    public static void main(String[] args) {
        mystery(5);
    }
    public static void mystery(int n)
   {
     System.out.println(n+" ");
     if (n<=5)
       mystery(n-1);
   }
}
