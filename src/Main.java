/**
 * 
 */

/**
 * @author lancre
 *
 */
public class Main {
	public static void main(String[] args) {
		
		// Integer has a width of 32
		int myValue=10000;
		int myMinValue = -2147483648;
		int myMaxValue = 2147483647;
		int myTotal = (myMinValue/2);
		System.out.println("myTotal = "+ myTotal);
		
		// Byte has a width of 8
		byte myByteValue = -128;
		byte myNewByteValue = (byte)(myByteValue/2);
		System.out.println("myNewByteValue = " + myNewByteValue); 
		
		// Short has a width of 16
		short myShortValue = 32767;
		  
		
		// Long has a width of 64
		long myLongValue = 100L;
		
		byte myNewByte = 10;
		short myNewShort = 20;
		int myNewInt = 50;
		long myNewLong = 50000L + 10L * (myNewByte + myNewShort + myNewInt);
		
		short myShortTotal = (short)(1000 + 10 *(myNewShort + myNewShort + myNewInt));
		System.out.println("LongTotal = " + myNewLong);	
		System.out.println("ShortTotal = " + myShortTotal);
		
		
		
	}

}
