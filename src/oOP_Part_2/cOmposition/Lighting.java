/**
 * 
 */
package oOP_Part_2.cOmposition;

/**
 * @author lancre
 *
 */
public class Lighting {
	private int bulbs;
	private boolean openLight;
	
	
	public Lighting(int bulbs, boolean openLight) {
		super();
		this.bulbs = bulbs;
		this.openLight = openLight;
	}
	public void lightOn() {
		if(!openLight) {
			openLight = true;
			System.out.println("The light is ON!!!");
		}
	}
	public void lightOff() {
		if(openLight) {
			openLight = false;
			System.out.println("The light is OFF!!!");
		}
	}

	public int getBulbs() {
		return bulbs;
	}


	public boolean isOpenLight() {
		return openLight;
	}
	
	

}
