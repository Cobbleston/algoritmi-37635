public class TestCoppia {

	public static void main(String[] args) {
		
		Coppia<Integer> ci = new Coppia<Integer>(12, 30);
		Coppia<String> cs  = new Coppia<String>("abc", "def");
		
		System.out.println(ci);
		
		ci.inverti();		
		cs.inverti();
		
		System.out.println(ci);
		System.out.println(cs);

	}
}
