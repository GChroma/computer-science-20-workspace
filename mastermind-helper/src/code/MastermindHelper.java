package code;

import java.util.Scanner;

public class MastermindHelper {
	public static void display(int[][] solutions, boolean[] possible) {
		for (int x = 0; x < 4096; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.print(solutions[x][y] + " ");
			}
			System.out.println(possible[x]);
			System.out.println();
		}
	}

	public static void populate(int[][] solutions, boolean[] possible) {
		int x = 0;
		for (int a = 1; a < 9; a++)
			for (int b = 1; b < 9; b++)
				for (int c = 1; c < 9; c++)
					for (int d = 1; d < 9; d++) {
						solutions[x][0] = a;
						solutions[x][1] = b;
						solutions[x][2] = c;
						solutions[x][3] = d;
						x++;
					}
		for (x = 0; x < 4096; x++)
			possible[x] = true;
	}

	public static void helper(int[][] solutions, boolean[] possible, Scanner input) {

		do {
			int number;
			boolean allFalse = true;
			
			for(int x = 0; x < 4096; x++) {//check if they're all false
				if(possible[x] == true) {
					allFalse = false;
				}
	
			}

			if(allFalse == true) {
				System.out.println("Looks like an error occurred. This board is impossible to win.");
				System.exit(0);
			}
			
			do {//find random number
				number = (int)(Math.random()*(4095));
			} while (possible[number] == false);
			possible[number] = false;
			
			System.out.println("Please enter the colours that correspond to this number: " + solutions[number][0] + solutions[number][1] + solutions[number][2] + solutions[number][3]);

			System.out.println(
					"Please enter the resulting pegs, with 1 for red and 2 for white and 0 for no peg in the order that is displayed one at a time (top left, top right, bottom left, bottom right)");

			int[] pegs = new int[4];

			for (int i = 0; i < 4; i++) {// take in pegs.
				pegs[i] = input.nextInt();
			}
			
			int[] guess = {solutions[number][0], solutions[number][1], solutions[number][2], solutions[number][3]};// turn the guess into an int array for easier comparison

			for (int x = 0; x < 4096; x++) {// compare other solutions to the current guess to find a match in pegs.

				int[] checkPegs = { 0, 0, 0, 0 };
				int[] tempSolution = new int[4];

				for (int y = 0; y < 4; y++) {// create temporary copy of solution

					tempSolution[y] = solutions[x][y];

				}

				for (int y = 0; y < 4; y++) {// check for red pegs.

					if (guess[y] == tempSolution[y]) {
						tempSolution[y] = 10;

						for (int i = 0; i < 4; i++) {// put in the red peg in starting from the left
							if (checkPegs[i] == 0) {
								checkPegs[i] = 1;
								break;
							}
						}
					}
				}

				for (int i = 0; i < 4; i++) {// check for white pegs
					for (int y = 0; y < 4; y++) {// loop through possible solution
						if(guess[i] == tempSolution[y]) {
							
							tempSolution[y] = 10;
							
							for( int j = 0; j < 4; j++) {//fill in white pegs starting from the left
								if(checkPegs[j] == 0) {
									checkPegs[j] = 2;
									break;
								}
							}	
						}
					}

				}
				
				for (int i = 0; i < 4; i++) {//check if checkPegs is equal to pegs
		
					if(checkPegs[i] != pegs[i]) {
						
						possible[x] = false;
					}
					
				}
		
			}

		} while (true);

	}

	public static void main(String[] args) {
		int[][] solutions = new int[4096][4];
		boolean[] possible = new boolean[4096];
		populate(solutions, possible);
		Scanner input = new Scanner(System.in);
		helper(solutions, possible, input);
	}
}