import asdlab.libreria.StruttureElem.ArrayOrdinato;
import asdlab.libreria.StruttureElem.StrutturaCollegata;

public class DemoDizionario {

	public static void main(String[] args) {
		
		// Implementazione basata su vettore ordinato
		//ArrayOrdinato dict = new ArrayOrdinato();
		
		// Implementazione basata su struttura collegata
		StrutturaCollegata dict = new StrutturaCollegata();
		
		dict.insert("One", 1);
		dict.insert("Ten", 10);
		System.out.println(dict.search(1));	
		
		dict.delete(1);
		System.out.println(dict.search(1));	

	}

}
