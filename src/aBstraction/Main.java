/**
 * 
 */
package aBstraction;

/**
 * @author lancre
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
	}

}
