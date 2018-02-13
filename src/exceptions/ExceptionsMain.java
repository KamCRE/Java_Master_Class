/**
 * 
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class ExceptionsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 98;
		int y = 0; 
		
		int z = getIntEAFP();
		System.out.println("z  is "+ z);
		//System.out.println(divideLBYL(x,y));
		//System.out.println(divideEAFP(x,y));
	//	System.out.println(divided(x,y));

		
		

	}
	
	private static int getIntEAFP() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer ");
		try {
			return s.nextInt();
			
		}catch(InputMismatchException e) {
			return 0;
		}
		
	}
	private static int getIntLBYL() {
		Scanner s = new Scanner(System.in);
		boolean isValid = true;
		System.out.println("Please enter an integer ");
		String input = s.next();
		for(int i=0; i<input.length();i++) {
			if(!Character.isDigit(input.charAt(i))) {
				isValid = false;
				break;
			}
		}
		if(isValid) {
			return Integer.parseInt(input);
		}
		return 0;
		   
	}
	public static int divideLBYL(int x, int y) {
		if( y!= 0) {
			return x / y;
		}else {
			return 0;
		}
	}
	
	private static int divideEAFP(int x ,int y) {
		try {
			return x / y;
		}catch(ArithmeticException e) {
			return 0;
		}
	}
	private static int divided(int x ,int y) {
		return x / y;
	}

}
