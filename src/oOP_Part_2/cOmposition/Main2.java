/**
 * 
 */
package oOP_Part_2.cOmposition;

/**
 * @author lancre
 *
 */
public class Main2 {

	public static void main(String[] args) {
		
		Lighting lighting = new Lighting(2, false);
		Roomsize roomSize = new Roomsize(4,3.5);
		My_Room my_room = new My_Room(lighting, 1, roomSize);
		my_room.getRoomsize().roomArea();
		System.out.println(my_room.getLighting().isOpenLight());
		
	}
}
