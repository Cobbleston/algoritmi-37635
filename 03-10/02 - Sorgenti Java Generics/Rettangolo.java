import colori.*;

public class Rettangolo implements IColorabile{
 
	private int l;
	private int h;
	private Colore c;
	
	public Rettangolo(int l, int h) {
		this.l = l;
		this.h = h;
	}
	
	public int getArea(){
		return (l*h);
	}

	@Override
	public void setColor(Colore color) {
		this.c = color;
	}

	@Override
	public Colore getColor() {
		return this.c;
	}
	
}
