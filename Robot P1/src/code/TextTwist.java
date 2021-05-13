package code;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Scanner;

public class TextTwist {

	static void win(char[] letters) throws Exception {

		String word;
		File inFile = new File("words.txt");
		Scanner input = new Scanner(inFile);
		Robot typer = new Robot();
		do {
			word = input.next();
			char[] wordArray = word.toCharArray();

			if (checkLetters(letters, wordArray)) {
				for (int i = 0; i < wordArray.length; i++) {
					typeLetter(wordArray[i], typer);
				}
				System.out.println("Guessing " + word);
				typer.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(15);
			}

		} while (input.hasNext());
		input.close();
		System.out.println("Done");

	}

	static boolean checkLetters(char[] letters, char[] wordArray) {

		char[] temp = new char[letters.length];

		// a quick checks for efficiency 

		if (wordArray.length > 6 || wordArray.length < 3) {
			return false;
		}

		for (int i = 0; i < letters.length; i++) {// create copy of letters

			temp[i] = letters[i];

		}

		for (int i = 0; i < wordArray.length; i++) {
			boolean matchFound = false;
			for (int j = 0; j < temp.length; j++) {

				if (wordArray[i] == temp[j]) {
					temp[j] = '*';// if find a match, change the character at that spot to an unused one and break
					matchFound = true;
					break;
				}

			}

			if (!matchFound) {// if a letter has been searched for in temp but there's no match, return false

				return false;

			}

		}

		return true;

	}

	static void typeLetter(char letter, Robot typer) {

		if (letter == 'a') {
			typer.keyPress(KeyEvent.VK_A);
		} else if (letter == 'b') {
			typer.keyPress(KeyEvent.VK_B);
		} else if (letter == 'c') {
			typer.keyPress(KeyEvent.VK_C);
		} else if (letter == 'd') {
			typer.keyPress(KeyEvent.VK_D);
		} else if (letter == 'e') {
			typer.keyPress(KeyEvent.VK_E);
		} else if (letter == 'f') {
			typer.keyPress(KeyEvent.VK_F);
		} else if (letter == 'g') {
			typer.keyPress(KeyEvent.VK_G);
		} else if (letter == 'h') {
			typer.keyPress(KeyEvent.VK_H);
		} else if (letter == 'i') {
			typer.keyPress(KeyEvent.VK_I);
		} else if (letter == 'j') {
			typer.keyPress(KeyEvent.VK_J);
		} else if (letter == 'k') {
			typer.keyPress(KeyEvent.VK_K);
		} else if (letter == 'l') {
			typer.keyPress(KeyEvent.VK_L);
		} else if (letter == 'm') {
			typer.keyPress(KeyEvent.VK_M);
		} else if (letter == 'n') {
			typer.keyPress(KeyEvent.VK_N);
		} else if (letter == 'o') {
			typer.keyPress(KeyEvent.VK_O);
		} else if (letter == 'p') {
			typer.keyPress(KeyEvent.VK_P);
		} else if (letter == 'q') {
			typer.keyPress(KeyEvent.VK_Q);
		} else if (letter == 'r') {
			typer.keyPress(KeyEvent.VK_R);
		} else if (letter == 's') {
			typer.keyPress(KeyEvent.VK_S);
		} else if (letter == 't') {
			typer.keyPress(KeyEvent.VK_T);
		} else if (letter == 'u') {
			typer.keyPress(KeyEvent.VK_U);
		} else if (letter == 'v') {
			typer.keyPress(KeyEvent.VK_V);
		} else if (letter == 'w') {
			typer.keyPress(KeyEvent.VK_W);
		} else if (letter == 'x') {
			typer.keyPress(KeyEvent.VK_X);
		} else if (letter == 'y') {
			typer.keyPress(KeyEvent.VK_Y);
		} else if (letter == 'z') {
			typer.keyPress(KeyEvent.VK_Z);
		} else {
			System.out.println("You did not enter an lowercase letter.");
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char[] letters = new char[6];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = input.nextLine().charAt(0);
		}

		Thread.sleep(3000);
		System.out.println("Solving");
		win(letters);
		input.close();
	}

}

