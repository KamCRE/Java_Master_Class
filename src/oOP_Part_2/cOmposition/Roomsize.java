/**
 * 
 */
package oOP_Part_2.cOmposition;

/**
 * @author lancre
 *
 */
public class Roomsize {
	private double length;
	private double width;
	
	
	
	public Roomsize(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}



	public void roomArea() {
		System.out.println("The Room Area is :" + this.length * this.width);
	}



	public double getLength() {
		return length;
	}



	public double getWidth() {
		return width;
	}
	


}
