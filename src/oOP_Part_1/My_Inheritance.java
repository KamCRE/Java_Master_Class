/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class My_Inheritance {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal",1,1,5,5);
		
		Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
		dog.eat();
		//dog.walk();
		//dog.run();
		
		Cre_Car car = new Cre_Car(30);
		car.steer(45);
		car.accelerate(30);
		car.accelerate(50);
		car.accelerate(-42);
 	}

}
