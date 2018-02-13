/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class Bank {
	private int account;
	private double balance;
	private String customer;
	private String email;
	private int phone;
	
	public Bank() {
		this(2345222, 0.0, "Default name", "Default Address", 002323);
		System.out.println("Empty construtor called!!");
	}

	
	/**
	 * @param customer
	 * @param email
	 * @param phone
	 */
	public Bank(String customer, String email, int phone) {
		this(999999,100.95,customer, email, phone);
		/*this.customer = customer;
		this.email = email;
		this.phone = phone;*/
	}


	public Bank(int account, double balance, String customer, String email,
			int phone) {
		this.account = account;
		this.balance = balance;
		this.customer = customer;
		this.email = email;
		this.phone = phone;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getAccount() {
		return this.account;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setPhone(int phone) {
		this.email = email;
	}

	public int getPhone() {
		return this.phone;
	}

	public void depositFunds(double deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successfull");
	}
	
	public void withdrawFunds(double deduct) {
		if(deduct > this.balance) {
			System.out.println("Insufficient Funds!!!");
		}else {
			this.balance -= deduct;
			System.out.println("Withdrawal Successfull!!!");
		}
	}

}
