package exceptions;

public class QuickTestExceptions {

	public static Integer testThrows(Integer[] a){
		
		Integer x = a[a.length];
	
		return x;
	}
	
	public static void main(String[] args) {
	
		Integer[] a = {1, 4, 5, 76};
		
		try {

			// non solleva eccezione
			System.out.println(a[0]);
			
			// solleva eccezione
			System.out.println(a[10]);
			
			//testThrows(a);
			
			throw new BadException();
			
		}
		/*
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Houston, abbiamo un problema.");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Message:" + e.getMessage());
		} 
		catch (BadException e) {
			System.out.println("BadException: " + e.getMessage());
		} 
		*/
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("OK");
	}

}
