public class LogikaIgre
{
  boolean[][] mine=new boolean[10+2][10+2];
  int[][] rešitve=new int[12][12];
  public void nastaviMine()
  {
    for (int k=1;k<=10;k++)
    {
        for (int j=1;j<=10;j++)
        {
            mine[k][j]=Math.random()<0.25;
        }
    }   
  }
  public void izračunaj()
  {
    for (int k=1;k<=10;k++)
    {
        for (int j=1;j<=10;j++)
        {
            //izračunaj koliko min je v okolici pozicije k,j
            for (int z=k-1;z<=k+1;z++)
            {
                for (int w=j-1;w<=j+1;w++)
                {
                    if (mine[z][w])
                    rešitve[k][j]++;
                }
            }
        }
    }
    
  }
  public void izpis()
    {
        System.out.println("--------------------------------");
        for (int k=1;k<=10;k++)
        {
            for (int j=1;j<=10;j++)
            {
               
                if (mine[k][j])
                 System.out.print("* ");
                else
                 System.out.print(rešitve[k][j]+" ");
            }
            System.out.println();  
        }   

    }
//   public static void main(String[] args) {
//     LogikaIgre a=new LogikaIgre();
//     a.nastaviMine();
//     a.izračunaj();
  
// }

}