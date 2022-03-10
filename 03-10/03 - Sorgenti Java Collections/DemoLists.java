import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DemoLists {
	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<Integer>();
		
		li1.add(1);
		li1.add(4);	
		li1.add(6);
		li1.add(3);

		System.out.println(li1.get(2));		
		System.out.println(li1);
		
		List<String> ls2 = new LinkedList<String>();
		
		ls2.addAll(Arrays.asList("ciao","hello","hallo", "hola"));
		System.out.println(ls2);
	}
}
