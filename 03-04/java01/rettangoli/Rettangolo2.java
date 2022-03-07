package java01.rettangoli;

public class Rettangolo2 {	
	private int area;
	private int perimetro;

	public Rettangolo2(int l, int h) {
		this.area = l*h;
		this.perimetro = (l+h)*2;
	}
	
	public int getPerimetro(){
		return this.perimetro;
	}
	
	public int getArea(){
		return this.area;
	}
}

