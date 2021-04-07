import java.util.*;
public class SprehodPoHisi {
    SobaZVrati dnevnaSoba;
    Soba jedilnica;
    SobaZVrati kuhinja;
    ZunanjiZVrati zadnjeDvorišče;
    ZunanjiZVrati sprednjeDvorišče;
    Zunanji vrt;
    Lokacija trenutnaLokacija;
    public static void main(String[] args) {
        SprehodPoHisi s=new SprehodPoHisi();
        Scanner sc=new Scanner(System.in);
        s.ustvariHišo();   
        // s.trenutnaLokacija=s.dnevnaSoba;
        // System.out.println(s.trenutnaLokacija.getOpis());
         s.premakniSe(s.dnevnaSoba); 
         String nova="";
         while (true){
         System.out.println("Kam naj grem?"); 
         nova=sc.nextLine();//ali številka 0,1,2, ali I ali K
         if (nova.equalsIgnoreCase("K"))
         {
             System.out.println("Lep sprehod");
             break;
         }       
         if (nova.equalsIgnoreCase("I"))
         {
            IZunanjaVrata novaLokacija=(IZunanjaVrata)s.trenutnaLokacija;
            s.premakniSe(novaLokacija.lokacijaVrat());
         }
         else
         {
             int n=Integer.parseInt(nova);
             s.premakniSe(s.trenutnaLokacija.izhodi[n]);
         }
        }
    }
    public void premakniSe(Lokacija nova)
    {
        trenutnaLokacija=nova;
        System.out.println(trenutnaLokacija.getOpis());
        if (trenutnaLokacija instanceof IZunanjaVrata)
        {
            System.out.println("I - pojdi skozi vrata");
        }

    }
    public void ustvariHišo()
    {
    dnevnaSoba=new SobaZVrati("dnevna soba",1,"luster","hrastova vrata");
    jedilnica=new Soba("jedilnica",2,"miza");
    kuhinja=new SobaZVrati("kuhinja",1,"inox nož","navadna vrata");
    zadnjeDvorišče=new ZunanjiZVrati("Zadnje dvorišče",1,true,"navadna vrata");
    sprednjeDvorišče=new ZunanjiZVrati("Sprednje dvorišče",1,false,"hrastova vrata");
    vrt=new Zunanji("vrt",2,false);
    
    dnevnaSoba.izhodi[0]=jedilnica;
    jedilnica.izhodi[0]=dnevnaSoba;
    jedilnica.izhodi[1]=kuhinja;
    kuhinja.izhodi[0]=jedilnica;
    sprednjeDvorišče.izhodi[0]=vrt;
    zadnjeDvorišče.izhodi[0]=vrt;
    vrt.izhodi[0]=sprednjeDvorišče;
    vrt.izhodi[1]=zadnjeDvorišče;
    
    dnevnaSoba.lv=sprednjeDvorišče;
    sprednjeDvorišče.lv=dnevnaSoba;
    
    kuhinja.lv=zadnjeDvorišče;
    zadnjeDvorišče.lv=kuhinja;
    
    }
}
