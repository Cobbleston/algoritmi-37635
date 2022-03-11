import codaArray.CodaArrayCircolare;
import codaArray.EccezioneArrayPieno;
import asdlab.libreria.Eccezioni.EccezioneStrutturaVuota;
import asdlab.libreria.StruttureElem.Coda;
import asdlab.libreria.StruttureElem.PilaArray;

public class DemoStruttureElementari {

	public static void main(String[] args) {

		/*
		 * Pila
		 */
		PilaArray stack = new PilaArray();

		try {
			stack.push("a");
			
			System.out.println(stack.top());
			System.out.println(stack.pop());

			System.out.println(stack.top());
			
		} catch (EccezioneStrutturaVuota e) {
			System.out.println(e.getMessage());
		}

		/*
		 * Coda
		 */
		try {

			Coda codaInteri = new CodaArrayCircolare(8);

			/*** 
			 * Esempio dalle slide
			 */
			codaInteri.enqueue(0);
			codaInteri.enqueue(3);
			codaInteri.enqueue(6);
			codaInteri.enqueue(54);
			codaInteri.enqueue(43);

			System.out.println(codaInteri);

			codaInteri.enqueue(12);
			codaInteri.dequeue();
			codaInteri.enqueue(15);
			codaInteri.enqueue(17);
			codaInteri.enqueue(33);

			System.out.println(codaInteri);

		} catch (EccezioneStrutturaVuota e) {
			System.out.println(e.getMessage());
		}catch (EccezioneArrayPieno e) {
			System.out.println(e.getMessage());
		}
	}

}
