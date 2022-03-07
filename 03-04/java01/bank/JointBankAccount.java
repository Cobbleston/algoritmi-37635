package bank;

public class JointBankAccount extends BankAccount {

	private String jointName;
	
	public JointBankAccount(int accountNumber, String ownerName, String jointOwner, double initialBalance) {
		super(accountNumber, ownerName, initialBalance);
		this.jointName = jointOwner;
	}
	
	public String getJointName() {
		return jointName;
	}	
	
	public String toString() {
		return "JointBankAccount ["  + this.getNumber() + ", " + this.getName()
				+ ", " + jointName + ", " + this.getBalance() + "$ ]";
	}
}
