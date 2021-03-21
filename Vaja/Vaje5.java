public class Vaje5 {
    public static void main(String[] args) {
        System.out.println("Java se v nizu Java,Java,Java pojavi :"
        +iskanje("Java, Java, Java","Java"));
        String x="Java,Java,Java".substring(5); //od vključno 5 znaka naprej
        System.out.println(x);
        x="Java,Java,Java".substring(5,9);//od 5 do vključno 9-1 pozicije
        System.out.println(x);
    }
    public static String iskanje(String s, String ključ) {
        StringBuffer pozicije = new StringBuffer("");
        int index = s.indexOf(ključ,0);
        int št = 0;

        while(index!=-1) {
            pozicije.append(index + ", ");
            št++;
            index++;
            index = s.indexOf(ključ, index);
        }
        return št + ": " + pozicije;
        //return pozicije.toString();
    }
}
