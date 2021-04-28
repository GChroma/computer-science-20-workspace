package code;
import java.util.Scanner;

public class Random_Number_Guessing_Game {

	public static void main(String[] args) throws Exception {
		
		int playAgain;
		int wins = 0;
		int losses = 0;
		Scanner input = new Scanner(System.in);
		do {
			if(wins > 0 || losses > 0) {
				System.out.println("You've won " + wins + " times and lost " + losses + " times.");
			}
			int number;
			int playerGuess = 0;
			
			playAgain = 0;
			int min = 1;
			int max = 0;
			int guesses = 0;
			int difficulty = 1;
			
			do {//take in difficulty
				System.out.println("Please enter the desired difficulty using the number next to the difficulty: \n1: Easy \n2: hard \n3: Literally the lottery");
				try {
					difficulty = input.nextInt();
				}catch(Exception e) {
					@SuppressWarnings("unused")
					String garbage = input.next();
				}
				
			}while(difficulty < 1 || difficulty > 3);
			
			if(difficulty == 1) {
				max = 10;
				guesses = 3;
			}else if(difficulty == 2) {
				max = 15;
				guesses = 3;
			}
			else if(difficulty == 3) {
				max = 100;
				guesses = 1;
			}
			
			boolean won = false;
			
			number = (int)(Math.random()*(max-min+1)+min);
			
			for(int i = guesses ; i > 0; i--) {//start guessing
				
				do {//take in guess
					
					try {
					
						System.out.println("\nGuess a number between " + min + " and " + max + ". You have " + i + " guesses.");
						playerGuess = input.nextInt();
					}catch(Exception e){
					
						@SuppressWarnings("unused")
						String garbage = input.next();
				}
				
					
		
				}while(playerGuess < min || playerGuess > max);
				
				if(playerGuess == number) {
					System.out.println("\nYou win!");
					won = true;
					wins++;
					break;
				}else if (Math.abs(playerGuess - number) > 2) {
					System.out.println("\nCold");
				}else if (Math.abs(playerGuess - number) <= 2) {
					System.out.println("\nHot");
				}
				
				System.out.println("\nYou were wrong.");
				
			}
			if(won == false) {
				System.out.println("\nYou lost, better luck next time! The correct number was: " + number);
				losses++;

			}
			
			do {	
				System.out.println("\nWould you like to play again? Enter 1 to play again or 0 to exit the game.");
				try {
					playAgain = input.nextInt();
					}catch(Exception e){
					
						@SuppressWarnings("unused")
						String garbage = input.next();
					}
			}while(playAgain < 0 || playAgain > 1);
			
			
		}while(playAgain != 0);
		
		input.close();
	}
}
