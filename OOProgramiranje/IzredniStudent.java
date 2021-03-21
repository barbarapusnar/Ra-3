public class IzredniStudent extends Student{
    private double šolnina;
    public IzredniStudent() {
        
        povprečnaOcena=5;
        System.out.println("Konstruktor izrednega brez parametri");
    }
    public IzredniStudent(String i) {
        super(i);
        System.out.println("Konstruktor izrednega s parametri");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nSem izredni študent";
    }
}
