public class Coppia<T /*extends Comparable<T>*/> {

	private T primo;
	private T secondo;

	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}

	public T getPrimo() {
		return primo;
	}

	public T getSecondo() {
		return secondo;
	}
	
	public void inverti(){
		T tmp = this.primo;
		this.primo = this.secondo;
		this.secondo = tmp;
	}

	/*
	// T deve implementare comparable
	public T minore(){
		if (primo.compareTo(secondo) <= 0)
			return primo;
		else
			return secondo;
	}
	*/
	
	@Override
	public String toString() {
		return "Coppia [primo=" + primo + ", secondo=" + secondo + "]";
	}
		

}
