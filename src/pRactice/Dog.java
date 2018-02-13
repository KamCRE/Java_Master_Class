/**
 * 
 */
package pRactice;

/**
 * @author lancre
 *
 */
public class Dog extends My_Animal {
	
	private String name;
	
	public Dog(int weight, String name) {
		super(weight);
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result;
		result = "Dog: " + name + super.toString() ;
		return result; 
	}


	
	
	
	

}
