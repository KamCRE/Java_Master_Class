package Control_Flow;

public class While_do_While {
	public static void main(String[] args) {
//		int count = 0;
//		while(count != 5) {
//			System.out.println("Count value is "+count);
//			count+=1;
//		}
		 
		int count = 1;
		do {
			System.out.println("Count value is "+ count);
			count++;
			
		}while(count !=6 );
		
		int myCount = 0; 
		int number = 5;
		int finishNumber = 20;
		while(number <= finishNumber) {
			if(!isEvenNumber(number)) {
				number++;
				continue;
			}
			myCount++;
			if(myCount > 5) {
				break;
			}
			
			System.out.println("Even number " + number);
			number++;
			
		}
		
	}
	public static boolean isEvenNumber(int n) {
		if(n % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
