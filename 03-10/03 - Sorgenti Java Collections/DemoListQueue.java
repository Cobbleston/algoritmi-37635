import java.util.ArrayDeque;
import java.util.LinkedList;

public class DemoListQueue {

	public static void main(String[] args) {

		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

		deque.add(5);
		deque.add(3);
		deque.remove();
		deque.add(2);
		deque.add(8);
		deque.remove();
		deque.remove();
		deque.add(4);
		
		System.out.println("deque: " + deque);

		deque.clear();
		
		deque.addFirst(3);
		deque.addLast(8);
		deque.addFirst(2);
		deque.removeLast();
		deque.addLast(7);
		deque.addLast(4);
		deque.removeFirst();
		deque.removeFirst();

		System.out.println("deque: " + deque);
		
		LinkedList<Integer> llist = new LinkedList<Integer>();

		llist.add(5);
    llist.add(3);
    llist.remove();
    llist.add(2);
    llist.add(8);
    llist.remove();
    llist.remove();
    llist.add(4);

    System.out.println("llist: " + llist);
		
		llist.clear();
		
		llist.addFirst(3);
		llist.addLast(8);
		llist.addFirst(2);
		llist.removeLast();
		llist.addLast(7);
		llist.addLast(4);
		llist.removeFirst();
		llist.removeFirst();
			
		System.out.println("llist: " + llist);

	}

}
