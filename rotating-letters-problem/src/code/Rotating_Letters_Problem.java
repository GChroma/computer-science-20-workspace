package code;
import java.util.Scanner;

public class Rotating_Letters_Problem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sign = input.nextLine();
		input.close();
		char[] letters = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};
		
		for(int i = 0; i < sign.length(); i++) {
			
			boolean goodLetter = false;
			
			for(int i2 = 0; i2 < letters.length; i2++) {
				
				if(letters[i2] == sign.charAt(i)) {
					
					goodLetter = true;
					
				}
			}
			
			if(goodLetter == false) {
				
				System.out.println("NO");
				System.exit(0);
			}
		}
		
		System.out.println("YES");
	}
}
