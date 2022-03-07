package java01;

public class HelloVariables {

	public static void main(String[] args) {		
		final int KINGS_OF_ROME = 7;

		boolean found;

		int a = 8;
		int b = 2;
		int sum;

		short c = 10000; // 100000 ?
		
		sum = a + b + c;		
		
		System.out.println("sum: " + sum);
		
		int n = 5;
		
		int somma = 0;
		
		for (int i = 1; i <= n; i++) {
			somma += i;
		}
		
		System.out.println("Somma: " + somma);
	}

}
