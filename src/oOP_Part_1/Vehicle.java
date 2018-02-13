/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class Vehicle {
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirection;
	
	
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentDirection = 0;
		this.currentVelocity = 0;
		
		
	}
	public void steer(int direction) {
		this.currentDirection+= direction;
		System.out.println("Vehicle.steer(): Steering at "+currentDirection +
				"degrees.");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @return the currentVelocity
	 */
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	/**
	 * @return the currentDirection
	 */
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " +currentVelocity 
				+ "in direction "+ currentDirection);
		

	}
	public void stop() {
		this.currentVelocity = 0;
	}
	
	
	

	
	
	
	
	

}
