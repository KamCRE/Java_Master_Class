/**
 * 
 */
package oOP_Part_2.pOlymorphism;

/**
 * @author lancre
 *
 */
class My_Car {
	
	private String carName;
	private boolean engine;
	private int wheels;
	private int cylinders;
	public My_Car(String carName, int cylinders) {
		this.carName = carName;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
		
	}
	public String getCarName() {
		return carName;
	
	}
	public int getCylinders() {
		return cylinders;
	
	}
	public void startEngine(){
		System.out.println("Engine has started");
		
	}
	
	public void accelerate() {
		System.out.println("Accelerate!!!!!!!!!");
		
	}
	
	public void brake() {
		System.out.println("Brake !!!!!!");
		
	}
}

class Subaru extends My_Car{

	public Subaru(String carName, int cylinders) {
		super(carName, cylinders);
		
	}

	@Override
	public void accelerate() {
		System.out.println("Subaru Accelerating!!!!!!!!!");
	}	
	
}
class Benz extends My_Car{

	
	public Benz(String carName, int cylinders) {
		super(carName, cylinders);
		
	}

	@Override
	public void accelerate() {
		System.out.println("Benz is Accelerating!!!!!!!");

	}
	
	
}

class Ford extends My_Car{

	public Ford(String carName, int cylinders) {
		super(carName, cylinders);

	}

	@Override
	public void accelerate() {
		System.out.println("Ford is Accelerating!!!!!!!!!");
	}
	
	
}

public class Car {
	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			My_Car car = randomCar();
			System.out.println(car.getCarName());
			car.accelerate();
		}
	
	}
	
	public static My_Car randomCar() {
		int randomNumber = (int)(Math.random()*5) + 1;
		System.out.println("Random number generated was: "+ randomNumber);
		switch(randomNumber) {
		case 1:
			return new Ford("Ford", 5);
		case 2:
			return new Benz("Benz", 4);
		case 3:
			return new Subaru("Subaru", 7);
		
		default:
			return null;

		}
		
	}
	
}




