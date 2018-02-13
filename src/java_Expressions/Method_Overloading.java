package java_Expressions;

public class Method_Overloading {
	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		caculateScore();
		
		
		double ans = calcFeetAndInchesToCentimeters(-10);
		System.out.println(ans);
 	}


	public static int calculateScore(String playerName, int score) {

		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {

		System.out.println(" Unnamed Player scored " + score + " points");
		return score * 1000;
	}
	public static int caculateScore() {
		// TODO Auto-generated method stub
		System.out.println("No Player name, no player score");
		return 0;
		
	}
	
	/// Challenge   
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet>=0 && (inches >=0 && inches <=12)) {
			//  1 inch = 2.54cm and 1 foot = 12 inches
			double myInches = (feet * 12) + inches;
			double myCentimeters = myInches * 2.54;
			
			return myCentimeters;
			
		}else {
			System.out.println("Innvalid foot or inches parameters");
			return -1;
		} 
		
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches >=0) {
			double myFeet = (int) inches / 12, myInches = (int) inches % 12 ;
			return calcFeetAndInchesToCentimeters(myFeet,myInches);
		}
		
		   
		
		return -1;
		
	}

}
