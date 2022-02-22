/**
 * 
 */
package assignment.main;

/**
 * @author Lenovo
 *
 */
public class Square extends Quadrilateral {
	private Integer bs;
	private Integer he;
	Square(int b, int h) {
		super(b, h);
		bs = b;
		he = h;
	}
	@Override
	public void area() {
		System.out.println(bs * he);
	}

}
