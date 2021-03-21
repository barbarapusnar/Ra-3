public class Obresti {
   public static void main(String[] args) {
      double vsotaZneskov=0;
      double vsotaObresti=0;
      for(int k=0;k<1000000;k++)
      {
        double znesek=(int)(Math.random()*1000000);
        vsotaZneskov=vsotaZneskov+znesek;
        double obresti=znesek*0.0023;
        vsotaObresti+=obresti;
      }
      System.out.println("Zneski * 0,0023 "+(vsotaZneskov*0.023));
      System.out.println("Obresti        "+vsotaObresti);
   }
}
