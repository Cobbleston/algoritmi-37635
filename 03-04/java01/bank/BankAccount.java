package bank;

public class BankAccount {
	
	private int number;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber, String ownerName, double initialBalance) {
		this.number = accountNumber;
		this.name = ownerName;
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		// Withdraw from negative balance too
		this.balance -= amount;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String toString() {
		return "BankAccount ["  + this.number + ", " + this.name
				+ ", " + this.balance + "$ ]";
	}
	
}
