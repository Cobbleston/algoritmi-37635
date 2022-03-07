public class TestContoCorrente {
	public static void main(String[] args) {
		try {
			ContoCorrente c1 = new ContoCorrente();
			ContoCorrente c2 = new ContoCorrente(100);
			ContoCorrenteInternazionale c3 = new ContoCorrenteInternazionale();
			ContoCorrenteInternazionale c4 = new ContoCorrenteInternazionale(90,Currency.DOLLAR);
			ContoCorrenteInternazionale c5 = new ContoCorrenteInternazionale(900,Currency.POUND);

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);

			c1.deposit(-100);
			c2.withdraw(50);

			c4.deposit(600);
	
			System.out.println(c1);
	    System.out.println(c2);
			System.out.println(c4);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);	
		}

		System.out.println("Fine Test!");
	} 
}
