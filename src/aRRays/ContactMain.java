/**
 * 
 */
package aRRays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class ContactMain {

	private static ContactList contactList = new ContactList(null);
	private static Scanner scanner = new Scanner(System.in);

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
				contactList.printContactList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				//printActions();
				//quit = true;
			}
		}

	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contacts existingContactRecord = contactList.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Name: "+ existingContactRecord.getName() + " phone number is " +  existingContactRecord.getPhone());
		
	}
	private static void removeContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contacts existingContactRecord = contactList.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		if(contactList.removeContact(existingContactRecord)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("Error deleting contact");
		}
	}
		
	

	private static void updateContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contacts existingContactRecord = contactList.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new Contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phone number");
		String newNumber = scanner.nextLine();
		Contacts newContact = Contacts.createContact(newName, newNumber);
		if(contactList.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated record");
		}else {
			System.out.println("Error updating record.");
		}
	}

	private static void addContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number");
		String phone = scanner.nextLine();
		Contacts contact = Contacts.createContact(name, phone);
		if(contactList.addNewContact(contact)) {
			System.out.println("New contract added: name =" + name + ", phone = "+ phone);
		}else {
			System.out.println("Cannot add, " + name + "already on file");
		}
	
	}

	private static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To shutdown");
		System.out.println("\t 1 - To print the list of contact items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item in the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To print choice options.");

		
	}

	

	

}
