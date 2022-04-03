public class Impiegato extends Persona {
    protected double stipendio;

    public Impiegato(String nome, int day, int month, int year, double stipendio) {
        super(nome, day, month, year);
        this.stipendio = stipendio;
    }

    public void set(String nome, int day, int month, int year, double stipendio) {
        super.set(nome, day, month, year);
        this.stipendio = stipendio;
    }

    public String get() {
        return super.get() + "\nStipendio: " + this.stipendio;
    }
}
