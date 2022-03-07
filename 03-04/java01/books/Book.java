package books;

public class Book implements Comparable {
	
	private String title;
	private Integer pubYear;
	
	public Book(String title, Integer pubYear) {
		super();
		this.title = title;
		this.pubYear = pubYear;
	}

	private String getTitle() {
		return this.title;
	}
	
	private Integer getPubYear() {
		return this.pubYear;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", pubYear=" + pubYear + "]";
	}

	@Override
	public int compareTo(Object o) {
		if ( (o != null) && (o instanceof Book)) {
			Book nb = (Book) o;
			
			
			if (this.pubYear > nb.pubYear)
				return 1;
			else if (this.pubYear < nb.pubYear)
				return -1;
			else
				return 0;
			
			//return (this.pubYear.compareTo(nb.getPubYear()));
			
			//return (this.title.compareTo(nb.getTitle()));
			
		}
		
		return -1; // default nel caso si confronti Book con null o istanze di altre classi
	}
	

	public int compareToNoComparison(Object o) {
		return 0;
	}
	
}
