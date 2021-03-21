public class Ekipa
{
    String ime;
    int daniGoli;
    int prejetiGoli;
    int štTekem;
    int štZmag;
    int štNeodločenih;
    int štPorazov;
    public Ekipa(String i) 
    {
        ime=i;
        daniGoli=0;prejetiGoli=0;štTekem=0; štZmag=0;
        štNeodločenih=0;štPorazov=0;
    }
    public void vnesiRezultat(int d,int p) //ekipa je dala d golov
    {
        daniGoli+=d;
        prejetiGoli+=p;
        štTekem++;
        if (d>p)
          štZmag++;
        if (d<p)
          štPorazov++;
        if (d==p)
         štNeodločenih++;
    }
    public int golRazlika()
    {
        return daniGoli-prejetiGoli;
    }
    public int štTočk()
    {
        return 3*štZmag+1*štNeodločenih;
    }
    public void izpis()
    {
        System.out.println(ime+"\t\t"+štTočk()+"\t"+štTekem+"\t");
    }
    public boolean boljšaEkipa(Ekipa x)
    {
        if (this.štTočk()>x.štTočk())
         return true;
        if (this.štTočk()==x.štTočk()&&this.golRazlika()>x.golRazlika())
         return true;
        if (this.štTočk()==x.štTočk()&&this.golRazlika()==x.golRazlika()
             &&this.daniGoli>x.daniGoli)
          return true;
        return false;
          
    }
}