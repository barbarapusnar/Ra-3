public class PrimeriNizev {
   
    public static void main(String[] args) {
        String s1="Java, Java, Java";
        String s=new String("Sokrates ki je filozof");
        System.out.println(s.length());
        //izpis posameznega znaka v nizu
        char a=s.charAt(0);
        System.out.println(a);
        a=s.charAt(s.length()-1);
        System.out.println(a);
        for (int k=0;k<s.length();k++)
         System.out.println(s.charAt(k));
        //iskanje znaka v nizu
        int pozicija=s.indexOf('u'); //če znaka ni v nizu, vrne -1
        System.out.println(pozicija);
        //poišči vse k-je
        for (int k=0;k<s.length();k++)
        {
            if (s.charAt(k)=='k')
            System.out.println(k+",");

        }
        int p1=s.indexOf("k",2);
        //druga možnost za poiskat vse k-je
        int p2=s.indexOf('k');
        while (p2!=-1)
        {
            System.out.println(p2);
            p2=s.indexOf('k', p2+1);
        }
        //poišči krates
        int p3=s.indexOf("kates",3);
        System.out.println("Iskanje dela niza "+p3);
        
    }
}
