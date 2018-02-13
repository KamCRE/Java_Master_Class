/**
 * 
 */
package aRRays;

/**
 * @author lancre
 *
 */
public class Contacts {
	private String name ;
	private String phone;
	
	
	public Contacts(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}
	
	public static Contacts createContact(String name, String phoneNumber) {
		return new Contacts(name, phoneNumber);	
	}
	
	

}
