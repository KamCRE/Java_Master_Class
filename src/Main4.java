
public class Main4 {
	public static void main(String[] args) {
		
		// byte short int long float double char boolean
		
		  
		String myString = "This is a string";
		System.out.println("mystring is equal to " + myString);
		myString = myString + ", and this is more";
		System.out.println("myString is equal to "+ myString);
		myString = myString + " \u00AE";
		System.out.println("myString is equal to "+ myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.55";
		System.out.println("The Result is "+ numberString);
		
		String lastString = "14";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to "+ lastString);
		

	}

}
