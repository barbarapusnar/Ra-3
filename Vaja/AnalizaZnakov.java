public class AnalizaZnakov {
    public static void main(String[] args) {
       String s="oTo knjigo uporabljamo od leta 2008/09 dalje.";
       char prvi=s.charAt(0);
       switch(prvi)
       {
        case 'N':
        case 'n':
         //napiši kodo- ne spremeni stringa
         break;
        case 'O':
        case 'o':
        //napiši kodo
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse().toString());
        for (int k=s.length()-1;k>=0;k--)
        {
            System.out.print(s.charAt(k));
        }
        System.out.println();
        break;
        case 'P':
        case 'p':
        //napiši kodo -  vzame naslednji zank , če je črka ali števka
        //naslednika Character.isLetterOrDigit
        break;
        case 'Z':
        case 'z':
        //napiši kodo
        break;
       }
    }

    public static int številoVelikih(String s)
    {
        int dolžina=s.length();
        int števec=0;
        for (int k=0;k<dolžina;k++)
        {
            char znak=s.charAt(k);
            if (Character.isUpperCase(znak))
            {števec++;}
        }
        return števec;
    }
}
