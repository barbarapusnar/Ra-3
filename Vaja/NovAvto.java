public class NovAvto {
    public static void main(String[] args) {
        double cenaAvta=20000;
        double cenasKreditom;
        //prva vrstica
        for(int om=8;om<=11;om++)
        {
            System.out.print("\t\t"+om+"\t");
        }
        System.out.println();
        //vse ostale vrstice
        for (int leto=2;leto<=8;leto++)
        {
            System.out.print(leto+"\t");
            for (int om=8;om<=11;om++)
            {
                cenasKreditom=cenaAvta*Math.pow(1+om/(100.0*365),leto*365);
                //System.out.print("\t"+cenasKreditom+"\t");
                System.out.printf("     %8.2f           ",cenasKreditom);
            }
            System.out.println();
        }
    }
}
