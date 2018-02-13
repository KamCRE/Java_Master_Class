/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class Classes_Part_1 {
	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera"); 
		
		System.out.println("Model is " + porsche.getModel());
		
		//Bank myBank = new Bank(); //12345678,0.0,"Lan CRE", "lancre@email.com", 00045);

		Bank newBank = new Bank("CRE CRE","cre@email.com",12345);
		System.out.println(newBank.getAccount() +"   "+ newBank.getCustomer());
		/*System.out.println(myBank.getAccount());
		System.out.println(myBank.getBalance());

		System.out.println(myBank.getEmail());
		System.out.println(myBank.getCustomer());
		System.out.println(myBank.getPhone());

		myBank.depositFunds(100000);
		System.out.println("Account Balance is "+myBank.getBalance());
		myBank.withdrawFunds(500000);
		System.out.println("Account Balance is "+myBank.getBalance());*/
		
	}
	
	
	

}


