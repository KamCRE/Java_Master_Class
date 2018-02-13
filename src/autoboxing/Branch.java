/**
 * 
 */
package autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

import aRRays.Contacts;

/**
 * @author lancre
 *
 */
public class Branch {
	private String branchName; 
	private static  ArrayList<Customers> customerList;
	private static Scanner scanner = new Scanner(System.in);
	
	
	
	public Branch(String branchName) {
		super();
		this.branchName = branchName;
		this.customerList = new ArrayList<Customers>();
	}

	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customers> getCustomerList() {
		return customerList;
	}
	public Branch createBranch(String name) {
		return new Branch(name);
	}
	
	
	public boolean addNewCustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.customerList.add(new Customers(customerName, initialAmount));
			return true;
		}
		
		return false;
		
	}

	
	private Customers findCustomer(String customerName) {
		for(int i=0; i<this.customerList.size(); i++) {
			Customers customer = this.customerList.get(i);
			if(customer.getCustomerName().equals(customerName)) {
				return customer;	
			}
			
		}
		return null;
	}
	private int findCustomer(Customers customer) {
		return this.customerList.indexOf(customer);
	}
	public boolean addCustomerTransaction(String name,double myValue) {
		Customers customerName = findCustomer(name);
		if(customerName !=null) {
			customerName.addTransaction(myValue); 
			return true;
		}
		return false;
			
		
		
		
		
		
	}



	
	
	

}
