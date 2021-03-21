public abstract class DelavecSuper {
    protected int id;
    protected String ime;
    protected double brutoPlača;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public abstract double getBrutoPlača();
    public abstract void izpis(); 
}
