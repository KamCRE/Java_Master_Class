/**
 * 
 */
package innerClasses;
import java.util.ArrayList;

/**
 * @author lancre
 *
 */
public class Gearbox {
	
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;
	
	
	public Gearbox(int maxGears) {
		super();
		this.gears = new ArrayList<>();
		this.maxGears = maxGears;
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
	}
	
	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
		
	}
	public void addGear(int number, double ratio) {
		if((number > 0) && (number <= maxGears)) {
			this.gears.add(new Gear(number, ratio));
		}
		
	}
	public void changeGear(int newGear) {
		if((newGear>=0) && (newGear < this.gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear "+ newGear + " selected.");
		}else {
			System.out.println("Grind!");
			this.currentGear = 0;
		}
		
		
		
	}
	
	public double wheelSpeed(int revs) {
		
		if(clutchIsIn) {
			System.out.println("Scream!!!!");
			return 0.0;
		}
		return revs* gears.get(currentGear).getRatio();
	}
	
	
	private class Gear{
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber, double ratio) {
			super();
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double getRatio() {
			// TODO Auto-generated method stub
			return this.ratio;
		}

		public double driveSpeed(int revs) {
			return revs*(this.ratio);
		}
	
		
		
	}
	
	

}
