public class VajaTabele {
    public static void main(String[] args) {
        Dijak[] vsi=new Dijak[180];
        int nad80=0;
        for (int k=0;k<vsi.length;k++)
        {
            int p1=(int)(Math.random()*57);
            int p2=(int)(Math.random()*37);
            vsi[k]=new Dijak(k+"",p1,p2);
            if (vsi[k].pola1+vsi[k].pola2>(56+36)*0.8)
             nad80++;
        }
        System.out.println("Nad 80% je "+nad80);
        // int[][] a=new int[5][3];
        // System.out.println("Število vrstic "+a.length);
        // System.out.println("Število stolpcev "+a[0].length);
        // for (int k=0;k<a.length;k++)
        // {
        //     for (int j=0;j<a[0].length;j++)
        //     {

        //         a[k][j]=(int)(Math.random()*20);
        //         System.out.print(a[k][j]+"\t");
        //     }
        //     System.out.println();
        // }
        // double[][][] b=new double[10][12][10];
        // for (int leto=0;leto<b.length;leto++)
        // {
        //     for (int k=0;k<b[0].length;k++)
        //     {
        //         for (int j=0;j<b[0][0].length;j++)
        //         {

        //             b[leto][k][j]=Math.random()*10;
        //             System.out.printf("%5.2f",b[leto][k][j]);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    }
}
