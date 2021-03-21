public class Student
{
  protected String ime;//atribut -- dodamo lastnost-->enkapsulacije/ograjevanje
  protected double povprečnaOcena;
  @Override
  public String toString() {   
      return "Sem študent "+ime+"\nMoje povprečje je "+
      povprečnaOcena;
  }
  public Student() {
      ime="";
      povprečnaOcena=0;
      System.out.println("Konstruktor študenta brez parametrov");
  }
  public Student(String i) {
      ime=i;
      povprečnaOcena=0;
      System.out.println("Konstruktro študenta s parametri");
    
    }
  //get in set metoda za ime
  public String getIme()
  {
    return ime;
  }
  public void setIme(String i)
  {
    if (i.length()<=20)
    ime=i;
    else
    ime="";
  }

  public double getPovprečnaOcena() {
    //izračunaj povprečno ocena
      return povprečnaOcena;
  }

  

}