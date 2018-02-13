/**
 * 
 */
package inTerfaces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class Main {
	
	public static void main(String[] args) {
		/*ITelephone itelephone;
		itelephone = new DeskPhone(1234567);
		itelephone.powerOn();
		itelephone.callPhone(1234567);
		itelephone.answer();*/
		/*ArrayList<String> arrayList = readValues();
		SaveToMedium savetomedium;
		savetomedium = new MyClass();*/
		//arrayList = savetomedium.saveValues(arrayList);
		//savetomedium.populateValues(arrayList);
		MyClass myClass = new MyClass("Play");
		System.out.println(myClass.toString());
		
		saveObject(myClass);
		myClass.setGameState("Pause");
		System.out.println(myClass);
		saveObject(myClass);


		loadObject(myClass);
		System.out.println(myClass);
		
		
		
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values =  new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" + 
				"1 to enter a string\n" + 
				"0 to quit");
		
		while(!quit) {
			System.out.println("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter a string: ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
			}
			
		}
		return values;
		
		
	}
	public static void saveObject(SaveToMedium savetomedium) {
		for(int i = 0; i<savetomedium.saveValues().size(); i++) {
			System.out.println("Saving "+ savetomedium.saveValues().get(i)+" to storage device");
		}
		
	}
	
	public static void loadObject(SaveToMedium savetomedium) {
		ArrayList<String> values = readValues();
		savetomedium.populateValues(values);
	}
}
