/**
 * 
 */
package oOP_Part_2.cOmposition;

/**
 * @author lancre
 *
 */
public class My_Room {
	private Lighting lighting;
	private int door;
	private Roomsize roomsize;
	
	public My_Room(Lighting lighting, int door, Roomsize roomsize) {
		super();
		this.lighting = lighting;
		this.door = door;
		this.roomsize = roomsize;
	}

	public Lighting getLighting() {
		return lighting;
	}

	public int getDoor() {
		return door;
	}

	public Roomsize getRoomsize() {
		return roomsize;
	}
	
	
	

	
	

}
