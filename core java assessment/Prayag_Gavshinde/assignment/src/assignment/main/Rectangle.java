package assignment.main;

public class Rectangle extends Quadrilateral {
	private Integer bs;
	private Integer he;
	Rectangle(int b, int h) {
		super(b, h);
		bs = b;
		he = h;
	}
	@Override
	public void area() {
		System.out.println("Area of Rectangle is:"+ bs * he);
	}
}
