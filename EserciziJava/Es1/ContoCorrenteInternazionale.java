public class ContoCorrenteInternazionale extends ContoCorrente {

    Valute val;

    public ContoCorrenteInternazionale(double saldo, Valute val) {
        super(saldo);
        this.val = val;
    }

    public ContoCorrenteInternazionale(Valute val) {
        this.val = val;
    }

    public String toString() {
        return "Saldo attuale del conto: " + this.saldo + " " + this.val;
    }
}
