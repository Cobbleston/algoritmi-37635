public class ContoCorrente implements BankAccount {
	protected double saldo;

	public ContoCorrente(double saldo) {
		if(saldo < 0)
			throw new IllegalArgumentException("Initial balance cannot be negative");
		else
			this.saldo = saldo;
	}

	public ContoCorrente() {
		this.saldo = 0;
	}
	
	@Override
	public boolean deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		} else {
			saldo += amount;
			return true;
		}
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		} else {
			saldo -= amount;
			return true;
		}
	}

	@Override
	public String toString() {
		return "Conto: " + super.toString() + " - Saldo attuale: " + saldo;
	}
}
