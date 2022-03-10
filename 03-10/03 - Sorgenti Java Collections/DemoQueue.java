import java.util.ArrayDeque;
import java.util.LinkedList;

public class DemoQueue {

	public static void main(String[] args) {

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		// come addLast() - FIFO
		queue.add(1);
		queue.add(4);	
		queue.add(6);
		queue.add(3);
		// come removeFirst() - FIFO
		queue.remove();
			
		System.out.println(queue);
		
		LinkedList<Integer> listqueue = new LinkedList<Integer>();
			
		listqueue.addFirst(1);
		listqueue.addFirst(4);	
		listqueue.addLast(6);
		listqueue.addFirst(3);
		listqueue.removeFirst();
			
		System.out.println(listqueue);
		
	}

}
