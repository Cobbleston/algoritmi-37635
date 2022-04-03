public class Stagista extends Impiegato {
    protected int numeroPresenze;
    protected int numeroIdentificativoStage;

    public Stagista(String nome, int day, int month, int year, double stipendio, int numeroPresenze, int numeroIdentificativoStage) {
        super(nome, day, month, year, stipendio);
        this.numeroPresenze = numeroPresenze;
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }

    public void set(String nome, int day, int month, int year, double stipendio, int numeroPresenze, int numeroIdentificativoStage) {
        super.set(nome, day, month, year, stipendio);
        this.numeroPresenze = numeroPresenze;
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }

    public String get() {
        return super.get() + "\nNumero presenze: " + this.numeroPresenze + "\nNumero identificativo stage: " + this.numeroIdentificativoStage;
    }
}
