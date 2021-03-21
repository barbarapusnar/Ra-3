public class Klici
{
public static void main(String[] args) {
    int[] a=new int[1000];
    for (int k=0;k<a.length;k++)
    {
      a[k]=(int)(Math.random()*1000+1);
    }
    
    bubble(a);
    System.out.println("Element 17 je na "+išči(a,17)+" mestu");
    System.out.println("Element 17 je na "+binarno(a,17)+" mestu");
 }
 public static int išči(int[] a,int x)
 {
  //v tabeli a, poišči element x
  //vrni njegov index ali -1, če elementa ni v tabeli
  //išči zaporedno
  for (int k=0;k<a.length;k++)
  {
    if (a[k]==x)
      return k;
  }
  return -1;
 }

public static int binarno(int[] a,int x)
{
  int zač=0;
  int konec=a.length-1;
  int sredina=(zač+konec)/2;
  while (!((konec-zač)<=1||a[sredina]==x  ))
  {
     if (a[sredina]<x)
     {
       zač=sredina;
     }
     if (a[sredina]>x)
     {
       konec=sredina;
     }
     sredina=(zač+konec)/2;
  }
  if (a[sredina]==x) return sredina;
  return -1;

}
public static void bubble(int[] a)
    {
        for (int j=0;j<a.length-1;j++)
        {
            for (int i=0;i<a.length-1;i++)
            {
                if (a[i]>a[i+1])
                {
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
          
        }

    }
}