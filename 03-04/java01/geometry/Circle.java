package geometry;

public final class Circle extends Shape implements IShape {

	double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		return  r * r * 3.14;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * r;
	}
	
}
