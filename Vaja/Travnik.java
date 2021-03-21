public class Travnik {
    public static void main(String[] args) {
        double trava=100.0;
        int štDni=0;
        // do
        // {
        //     trava=trava-0.02*trava;
        //     štDni++;
        // }while(trava>50.0);
        // System.out.println("Pol travnika propade po "+štDni/7+ " tednih");
         for(;;)
        {
            trava=trava-0.02*trava;
            štDni++;
            if (trava<=50.0) break;
        }
        System.out.println("Pol travnika propade po "+štDni/7+ " tednih");
    }
}
