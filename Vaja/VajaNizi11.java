public class VajaNizi11 {
    public static void main(String[] args) {
        System.out.println("ROZA IN ZORA sta anagrama? "+staAnagrama("ROZA","ZORA"));
        System.out.println(obrni("To je prvotni niz").toString());
        System.out.println(obrni1("To je prvotni niz").toString());
        //izpisati se mora niz prvotni je To
    }
    public static StringBuffer obrni1(String n)
    {
        StringBuffer sb=new StringBuffer();
        int poz=n.indexOf(' ');
        int stara=0;
        String b="";
        while (poz!=-1)
        {
            b=n.substring(stara,poz);
            sb.insert(0,b+" ");
            stara=poz+1;
            poz=n.indexOf(' ',stara);
        }
        b=n.substring(stara);
        sb.insert(0,b+" ");
        return sb;
    }
    public static StringBuffer obrni(String n)
    {
        StringBuffer sb=new StringBuffer();
        String beseda="";
        //poišči besedo
        for (int k=0;k<n.length();k++)
        {   char znak=n.charAt(k);
            if (znak!=' ')
            {
                beseda+=znak;
            }
            else
            {
                sb.insert(0, beseda+" ");
                beseda="";
            }
        }
        sb.insert(0,beseda+" ");
        return sb;
    }
    public static Boolean staAnagrama(String niz1,String niz2)
    {
     if (niz1.length()!=niz2.length())
       return false;
     StringBuffer sb2=new StringBuffer(niz2);
     for (int k=0;k<niz1.length();k++)
     {
        //dobi črko na k-tem mestu
        char črka=niz1.charAt(k);
        //ali se ta črka nahaja v niz2?
        int pozicija=sb2.indexOf(črka+"");
        if (pozicija==-1)
          return false;
        //odstrani to črko iz niza2
        //niz2=niz2.substring(0,pozicija)+niz2.substring(pozicija+1);
        sb2= sb2.deleteCharAt(pozicija);
     }
     if (sb2.length()==0)
        return true;
     else 
      return false;
    }
}
