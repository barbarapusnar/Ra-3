public class DeljenjeNizov {
   public static void main(String[] args) {
   System.out.println("Kaj? To je besedilo! ... In kaj še????");
   System.out.println(odstrani("Kaj? To je besedilo! ... In kaj še????",0));
   System.out.println(odstrani("Kaj? To je besedilo! ... In kaj še????",1));
   } 
   public static String odstrani(String s,int n)
   {
//če je n 1 odstarni na lihih mestih
//če je n 0 odstrani na sodih mestih
    StringBuffer sb=new StringBuffer();
    if (n==0)
    {
        for (int k=0;k<s.length();k++)
        {
            if (!(k%2==0 && s.charAt(k)!=' '))
             sb.append(s.charAt(k));
        }
    }
    else
    {

        for (int k=0;k<s.length();k++)
        {
            if (!(k%2==1 && s.charAt(k)!=' '))
             sb.append(s.charAt(k));
        }
    }
    return sb.toString();
   }
   public static boolean jePalindrom(String s)
   {
     if (s.length()==0||s.length()==1)
      return true;
     char prva=s.charAt(0);
     char zadnja=s.charAt(s.length()-1);
     return prva==zadnja && jePalindrom(s.substring(1,s.length()-1));
   }
   public static StringBuffer naPet(String n)
   {
    StringBuffer sb=new StringBuffer();
    for (int k=0;k<n.length();k++)
    {
        if (n.charAt(k)!=' ')
        {
            sb.append(n.charAt(k));

        }
    }
    StringBuffer rezultat=new StringBuffer();
    for (int k=0;k<sb.length();k++)
    {       
        if (k%5==0&& k!=0)
         rezultat.append(" ");
        rezultat.append(sb.charAt(k));
    }
    return rezultat;
   }  
}
