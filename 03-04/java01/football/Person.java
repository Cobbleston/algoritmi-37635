package football;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return "Mi chiamo " + this.name + '.';
	}
}
