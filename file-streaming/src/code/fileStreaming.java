package code;

import java.io.File;
import java.util.Scanner;

public class fileStreaming {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String word = "";
		File inFile = new File("words.txt");
		Scanner input = new Scanner(inFile);

		do {
			word = input.next();
			System.out.println(word);
		} while (input.hasNext());

	}

}
