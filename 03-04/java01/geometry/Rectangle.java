package geometry;

public class Rectangle extends Shape implements IShape, IColorable {
	double s1;
	double s2;
	Color c;
	
	public Rectangle(double s1, double s2) {
		this.s1 = s1;
		this.s2 = s2;
		this.c = Color.BLACK;
	}

	@Override
	public double getArea() {
		return s1 * s2;
	}

	@Override
	public double getPerimeter() {
		
		return (s1 + s2) * 2;
	}

	@Override
	public Color getColor() {
		return this.c;
	}

	@Override
	public void setColor(Color c) {
		this.c = c;	
	}

	@Override
	public String toString() {
		return "Rectangle [s1=" + s1 + ", s2=" + s2 + ", color=" + c + "]";
	}

}
