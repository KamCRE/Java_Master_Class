/**
 * 
 */
package aRRays;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author lancre
 *
 */
public class MyArrays {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntArray = {1,2,3,4,5,6,7,8,9};
		myIntArray[5] = 50;
		//double[] myDoubleArray = new double[10];
		//System.out.println(myIntArray[5]);
		
		int[] myArray = new int[2];
		printArray(myArray);
		
		int[] myIntegers =  getIntegers(5);
		for(int i = 0; i<myIntegers.length; i++) {
			System.out.println("Element "+ i + ", typed value was "+ myIntegers[i]);
		}
		
		myIntegers = sortMyArray(myIntegers);
		
		for(int i = 0; i<myIntegers.length; i++) {
			System.out.println("Element "+ i + ", typed value was "+ myIntegers[i]);
		}
	
		//System.out.println("The average is " + getAverage(myIntegers));
		
		
		
	
		
	}
	
	

	private static int[] sortMyArray(int[] myIntegers) {
		int[] myNewArray = new int[myIntegers.length];
		java.util.Arrays.sort(myIntegers);
		int x = 0;
		int j = myIntegers.length - 1;
		for(int i = j; i >= 0; i--) {
			myNewArray[x] = myIntegers[i];
			//System.out.println(myNewArray[x]);
			x++;
		}
		
		return myNewArray;
	}



	private static int[] getIntegers(int number) {
		System.out.println("Enter "+ number + " integer values.\r");
		
		int[] values = new int[number];
		
		for(int i = 0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static void printArray(int[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			myArray[i] = i * 10;
			
		}
		for(int i=0; i < myArray.length; i++) {
			System.out.println("Element "+ i + ", value is "+ myArray[i]);
		}
		
	}
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return (double)sum / (double)array.length; 
	}
	
	

}
