public class HanoiskiStolpi {
    public static void main(String[] args) {
        System.out.println("Rešitev Hanoiskih stolpov");
        premik(9,"začetni","končni","sredinski");
    }
    public static void premik(int n,String a,String c,String b)
    {
        if (n==1)
         System.out.println("Premakni obroč iz "+a+" na "+c);
        else
        {
            premik(n-1,a,b,c);
            System.out.println("Premakni obroč iz "+a+" na "+c);
            premik(n-1,b,c,a);

        }

    }
}
