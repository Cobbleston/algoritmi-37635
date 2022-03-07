package geometry;

import java.util.Random;

public class GeometryDemoInterface {

	private static void colorWhite(IColorable s){
		s.setColor(Color.WHITE);
	}
	
	private static void colorRed(IColorable s){
		s.setColor(Color.RED);
	}
	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(2, 3);
		Circle circle1 = new Circle(5);
		
		colorWhite(rect1);
		System.out.println(rect1);
		
		colorRed(rect1);
		System.out.println(rect1);
		
		//colorRed(circle1);
		//System.out.println(rect1);

	}

}
