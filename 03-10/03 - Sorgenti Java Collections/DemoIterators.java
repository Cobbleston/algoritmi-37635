import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DemoIterators {

	public static void main(String[] args) {

		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(10);
		integers.add(10);
		integers.add(-2);
		
		int somma = 0;

		Iterator<Integer> integersIterator = integers.iterator();

		while (integersIterator.hasNext()) {
			somma = somma + integersIterator.next();
		}
		System.out.println("Somma: " + somma);

		for (Integer i : integers) {
			System.out.println(i);
		}
		
		Scanner scanner = new Scanner("Ciao a tutti");
		
		while (scanner.hasNext()) {
			String string = (String) scanner.next();
			System.out.println(string);
		}
		
		scanner.close();
	}

}
