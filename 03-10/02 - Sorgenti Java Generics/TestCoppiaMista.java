import colori.Colore;

public class TestCoppiaMista {

	public static void main(String[] args) {
		
		CoppiaMista<Integer, String> cm = new CoppiaMista<Integer, String>(13, "hello");
		
		System.out.println("Omogenei in cm? " + cm.checkOmogenei());
				
		Rettangolo r1 = new Rettangolo(10, 20);
		Rettangolo r2 = new Rettangolo(30, 30);
		
		CoppiaMistaColorabile<Rettangolo, Rettangolo> 
		ccol = new CoppiaMistaColorabile<Rettangolo, Rettangolo>(r1, r2, Colore.VERDE);
		
		System.out.println("Omogenei in ccol? " + ccol.checkOmogenei());

		System.out.println("Colore r1: " + r1.getColor());
		
		ccol.coloraTutti(Colore.ROSSO);
		
		System.out.println("Colore r1: " + r1.getColor());
	}


}
