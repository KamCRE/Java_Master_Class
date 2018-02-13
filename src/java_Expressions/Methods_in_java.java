package java_Expressions;

public class Methods_in_java {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		
		
		int highScore = calculateScore(gameOver, score,levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		
		calculateScore(true, 10000, 8, 200);
		
		int highScorePostion = calculateHighScorePosition(1000);
		displayHighScorePosition("Tim", highScorePostion);
		
		highScorePostion = calculateHighScorePosition(500);
		displayHighScorePosition("Bob", highScorePostion);
		
		highScorePostion = calculateHighScorePosition(400);
		displayHighScorePosition("Percy", highScorePostion);
		
		highScorePostion = calculateHighScorePosition(50);
		displayHighScorePosition("Elbert", highScorePostion);
		
	
	}
	public static int calculateScore(boolean gameOver,int score ,int levelCompleted, int bonus) {
		
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
		
	} 
	public static void displayHighScorePosition(String playersName,int highScorePosition) {
		System.out.println(playersName + " managed to get into position " + highScorePosition +
				" on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		int score;
		if(playerScore >= 1000) {
			score = 1;
		}else if(playerScore >= 500) {
			score = 2;

		}else if(playerScore >= 100 ) {
			score = 3;
		}else {
			 score = 4;
		}
		return score;
		
		
		
	}

}
