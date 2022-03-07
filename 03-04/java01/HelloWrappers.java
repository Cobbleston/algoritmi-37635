package java01;
public class HelloWrappers {

	public static void main(String[] args) {	

		System.out.println("Min Integer:" + Integer.MIN_VALUE);
		System.out.println("Max Float:"  + Float.MAX_VALUE);
		
		Integer a = 8;	// boxing		
		
		// Deprecated: use the alternative on next line
		int     b = new Integer(2); // unboxing
		//int     b = Integer.valueOf(2);
		
		Integer c = Integer.parseInt("-10");
		
		Double  d = Double.parseDouble("3.14");
		
		Double sum = a + b + c + d;
		
		System.out.println(sum);
				
		if (a.compareTo(b) > 0)
			System.out.println("a > b");
		else if (a.compareTo(b) < 0)
			System.out.println("b > a");
		else
			System.out.println("a = b");
		
		
	}

}
