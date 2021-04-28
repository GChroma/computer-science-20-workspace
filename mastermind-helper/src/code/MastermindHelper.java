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
			boolean isPossible = false;

			do {// loop to check if the number is possible.

				number = ((int)(Math.random() * 8) + 1)*1000 + ((int)(Math.random() * 8) + 1)*100 + ((int)(Math.random() * 8) + 1)*10 + ((int)(Math.random() * 8) + 1);

				for (int x = 0; x < 4096; x++) {
					int solution = 1000 * solutions[x][0] + 100 * solutions[x][1] + 10 * solutions[x][2]
							+ solutions[x][3];

					if (number == solution) {
						if (possible[x] == true) {
							possible[x] = false;
							isPossible = true;
						}
					}
				}

			} while (!isPossible);

			System.out.println("Please enter the colours that correspond to this number: " + number);

			System.out.println(
					"Please enter the resulting pegs, with 1 for red and 2 for white and 0 for no peg in the order that is displayed one at a time (top left, top right, bottom left, bottom right)");

			int[] pegs = new int[4];

			for (int i = 0; i < 4; i++) {// take in pegs.
				pegs[i] = input.nextInt();
			}
			
			int[] guess = toIntArray(number);// turn the guess into an int array for easier comparison

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

	public static int[] toIntArray(int number) {// turn an integer into an array full of its digits (also in int form).

		String stringNum = String.valueOf(number);// if this is done using modulus and division the digits are spat out
													// backwards and have to be reversed with a stack.
		char[] digits = stringNum.toCharArray();
		int[] intArray = new int[4];
		for (int i = 0; i < 4; i++) {
			intArray[i] = Character.getNumericValue(digits[i]);
		}

		return intArray;

	}

	public static void main(String[] args) {
		int[][] solutions = new int[4096][4];
		boolean[] possible = new boolean[4096];
		populate(solutions, possible);
		Scanner input = new Scanner(System.in);
		helper(solutions, possible, input);
	}
}