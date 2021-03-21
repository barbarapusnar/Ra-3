class KupKart
{
    public static void main(String[] args) {
        String[] barve={"denari","kopa","spada","bastoni"};
        String[] vrednosti={"1","2","3","4","5","6","7","fant","kaval","kralj"};
        String[] kup=new String[barve.length*vrednosti.length];
        for (int k=0;k<barve.length;k++)
        {
            for (int j=0;j<vrednosti.length;j++)
            {
                kup[vrednosti.length*k+j]=vrednosti[j]+" "+barve[k];
                System.out.print( kup[vrednosti.length*k+j]+", ");
            }
            System.out.println();
        }
        //zmešaj karte - za vsako mesto k (od 0 do 39)
        // vzemi naključno karto od k do konca, zamenjaj jo s karto na mesu k
        
    }
}