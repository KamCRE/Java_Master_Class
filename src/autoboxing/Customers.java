/**
 * 
 */
package autoboxing;

import java.util.ArrayList;

/**
 * @author lancre
 *
 */
public class Customers {
	private String customerName;
	private static ArrayList<Double> transactionList;
	
	
	public Customers(String customerName, double intialAmount) {
		this.customerName = customerName;
		this.transactionList =  new ArrayList<Double>();
		addTransaction(intialAmount);
	}


	public String getCustomerName() {
		return customerName;
	}


	public ArrayList<Double> getTransactionList() {
		return transactionList;
	}
	
	
	public static void addTransaction( double value) {
		transactionList.add(value);
	}


	
	
	
	
	

}
