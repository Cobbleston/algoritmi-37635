public interface BankAccount {
	/**
	 * Deposit money on the bank account
   * 
	 * @param amount amount to deposit on the bank account  
	 * 
	 * @return true on successful transaction
	 */
	public boolean deposit(double amount);
	
	/**
	 * Withdraw money from the bank account
	 *
   * @param amount amount to withdraw from the bank account  
	 *
	 * @return true on successful transaction
   */
	public boolean withdraw(double amount);

}
