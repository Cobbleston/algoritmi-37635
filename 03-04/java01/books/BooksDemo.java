package books;

import java.util.Arrays;

public class BooksDemo {

	public static void main(String[] args) {
	
		Book[] books = new Book[3];
		
		books[0] = new Book("Harry Potter ...", 1997);
		books[1] = new Book("The Lord of the Rings", 1954);
		books[2] = new Book("Don Quixote", 1605);
		
		Arrays.sort(books);
		
		for (Book b : books) {
			System.out.println(b);
		}	
		
	}
	
}
