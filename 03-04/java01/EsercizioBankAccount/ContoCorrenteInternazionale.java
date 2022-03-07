public class ContoCorrenteInternazionale extends ContoCorrente {
	private final Currency valuta;

	public ContoCorrenteInternazionale(double saldo, Currency valuta) {
		super(saldo);
		this.valuta = valuta;
  }

	public ContoCorrenteInternazionale(double saldo) {
  	super(saldo);
		valuta = Currency.EURO;
	}

	public ContoCorrenteInternazionale() {
		super();
		valuta = Currency.EURO;
	}	

	@Override
	public String toString() {
		return "Saldo: " + saldo + ". Valuta: " + valuta;
	}
}
