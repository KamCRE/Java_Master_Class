/**
 * 
 */
package aBstraction;

/**
 * @author lancre
 *
 */
public abstract class Bird extends Animal implements CanFly{

	@Override
	public void fly() {
		System.out.println(getName() + " is flapping its wings");
		
	}

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+ " is pecking");
		
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " Breathe in, breathe out, repeat");
		
	}
	
	

}
