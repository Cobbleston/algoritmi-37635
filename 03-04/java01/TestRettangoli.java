package java01;

import java01.rettangoli.Rettangolo;
import java01.rettangoli.Rettangolo2;

public class TestRettangoli {

	public static void main(String[] args) {
	
		Rettangolo r1 = new Rettangolo(20, 50);
		
		Rettangolo2 r2 = new Rettangolo2(80, 10);
		
		System.out.println("Area di r1: " + r1.getArea());
		
		System.out.println("Perimetro di r2: " + r2.getPerimetro());

	}

}
