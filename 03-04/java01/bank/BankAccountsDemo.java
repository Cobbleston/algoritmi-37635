package bank;

import java.util.Iterator;

public class BankAccountsDemo {
	
	public static void main(String[] args) {
		
		BankAccount fred = new BankAccount(123, "Fred", 345.50);
		
		BankAccount fredMary = new JointBankAccount(345, "Fred", "Mary", 450.65);

		System.out.println(fred);
		System.out.println(fredMary);
		
		BankAccount[] accounts = {fred, fredMary};
		
		for (BankAccount b : accounts) {
			System.out.println(b);
		}
		
	}
	

}
