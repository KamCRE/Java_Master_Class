/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class VipCustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	public VipCustomer() {
		this("My Name", 1000000.30, "vip@customer.com" );
		System.out.println("This is my Empty Constructor");
	}
	
	public VipCustomer(String name,String emailAddress) {
		this(name,1003.30, emailAddress);
		System.out.println("This is a two Parameter Constructor");
	}
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getCreditLimit() {
		return this.creditLimit;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}

}
