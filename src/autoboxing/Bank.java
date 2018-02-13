/**
 * 
 */
package autoboxing;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author lancre
 *
 */
public class Bank {
	private String bankName;
	private static ArrayList<Branch> branchList ;

	private static Scanner scanner = new Scanner(System.in);
	
	
	
	public Bank(String bankName) {
		super();
		this.bankName = bankName;
		this.branchList = new ArrayList<Branch>();
	}



	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice :");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				listCustomers(true);
				break;
			case 2:
				addNewBranch();
				break;
			case 3:
				addBranchCustomer();
				break;
			case 4:
				addCustomerTransaction();
				break;
			case 5:
				//printActions();
				//quit = true;
			
				
			}
		}
		
	}
	


	private static void addCustomerTransaction() {
		System.out.println("Enter Branch name");
		String mybranch = scanner.nextLine();
		Branch existingBranchRecord = queryBranch(mybranch);
		if(existingBranchRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter Customer name: ");
		String name = scanner.nextLine();
		System.out.println("Enter transaction value: ");
		double value = scanner.nextDouble();
		if(existingBranchRecord.addCustomerTransaction(name, value)) {
			System.out.println("New transaction added: value =" + value);
			
		}else {
			System.out.println("Cannot add, " + value );
		}
		
	}



	private static void addBranchCustomer() {
		System.out.println("Enter Branch name");
		String mybranch = scanner.nextLine();
		Branch existingBranchRecord = queryBranch(mybranch);
		if(existingBranchRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter Customer name: ");
		String name = scanner.nextLine();
		System.out.println("Enter initial transaction value: ");
		double value = scanner.nextDouble();
		if(existingBranchRecord.addNewCustomer(name, value)){
			System.out.println("New customer added: name =" + name);
		
		}else {
			System.out.println("Cannot add, " + name + "already on file");
		}
		
	}
	public static Branch queryBranch(String aBranch) {
		Branch branch = findBranch(aBranch);
		if(branch!=null) {
			return branch;
		}
		return null;
		
		
		
	}



	private static void addNewBranch() {
		System.out.println("Enter a new branch name: ");
		String name = scanner.nextLine();
		if(addMyNewBranch(name)) {
			System.out.println("New branch added: name = " + name );
		}else {
			System.out.println("Cannot add, " + name + "already on file");
		}
	}



	private static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To Print Instructions");
		System.out.println("\t 1 - To print the list of Customers and their Transactions.");
		System.out.println("\t 2 - To add a new branch.");
		System.out.println("\t 3 - To add a customer to that branch with initial transaction");
		System.out.println("\t 4 - To add a transaction to an existing customer:");
		System.out.println("\t 5 - To Quit.");
		
		
	}



	public static boolean addMyNewBranch(String branchaa) {
		Branch str = null;
		if(str.equals(branchaa)) {
			branchList.add(new Branch(branchaa));
			return true;
		}
		return false;
		
	}



	private static Branch findBranch(String branchName) {
		for(int i=0; i<branchList.size(); i++) {
			Branch myBranch = branchList.get(i);
			if(myBranch.getBranchName().equals(branchName)) {
				return myBranch;	
			}
		}
		Branch str = null;
		return str;

	}
	public static void listCustomers(boolean showTransactions) {
		System.out.println("Enter the Branch: ");
		String branchName = scanner.nextLine();
		
		System.out.println("Customer Transactional List");
		Branch myBranch = findBranch(branchName);
		if(myBranch != null) {
			System.out.println("Customer details for branch " + myBranch.getBranchName());
			ArrayList<Customers> branchCustomers =  myBranch.getCustomerList();
			
			for(int i=0; i<branchCustomers.size(); i++) {
				Customers branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: "+ branchCustomer.getCustomerName() + "[" + (i+1) + "]");
				if(showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactionList();
					for(int j=0; j<transactions.size(); j++) {
						System.out.println("[" + (j+1) + "] Amount" + transactions.get(j)) ;
					}
				}
				
			}
		}else {
			System.out.println("Branch not found!!!!");
		}
	}

	

	

}
