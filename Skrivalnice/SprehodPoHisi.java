
import java.util.*;
public class SprehodPoHisi {
    SobaZVrati dnevnaSoba;
    Soba jedilnica;
    SobaZVrati kuhinja;
    ZunanjiZVrati zadnjeDvorišče;
    ZunanjiZVrati sprednjeDvorišče;
    Zunanji vrt;
    static Lokacija trenutnaLokacija;
    public static void main(String[] args) {
                
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
