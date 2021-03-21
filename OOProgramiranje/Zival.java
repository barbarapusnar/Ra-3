public class Zival {
   protected String vrsta;
   public Zival() {
       System.out.println("Sem v razredu Žival");
   } 
   @Override
   public String toString() {
       return "Sem "+vrsta+" in delam "+((IGovor)this).govor();
   }
  
}
