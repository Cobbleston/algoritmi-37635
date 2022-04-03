import java.time.LocalDate;

public class Persona {
    protected String nome;
    protected LocalDate dataNascita;

    public Persona(String nome, int day, int month, int year) {
        this.nome = nome;
        this.dataNascita = LocalDate.of(year, month, day);
    }

    public void set(String nome) {
        this.nome = nome;
    }

    public void set(String nome, int day, int month, int year) {
        this.nome = nome;
        this.dataNascita = LocalDate.of(year, month, day);
    }

    public String get() {
        return "Nome: " + this.nome + "\nData di Nascita:" + this.dataNascita;
    }
}
