/**
 * 
 */
package assignment.main;

/**
 * @author Lenovo
 *
 */
public class Parallelogram extends Quadrilateral {
	private Integer bs;
	private Integer he;
	Parallelogram(int b, int h) {
		super(b, h);
		bs = b;
		he = h;
	}
	@Override
	public void area() {
		System.out.println("Area of Parallelogram is:"+ bs * he);
	}
}
