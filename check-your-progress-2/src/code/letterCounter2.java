package code;
import java.util.Scanner;

public class letterCounter2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Planet P Word Counter!");
		
		String x;
		char y;
	
		int a = 0, e = 0, i = 0, o = 0, u = 0, p = 0, other = 0;
		
		do {
			System.out.print("\nPlease enter a letter: ");
			x = input.nextLine();
			y = x.charAt(0);
			
			y = Character.toUpperCase(y);//turn every input uppercase 
			//(easier to use this than askii)
		
			if(y == 'A') {//count letters
				a++;
			}else if(y == 'E') {
				e++;
			}else if(y == 'I') {
				i++;
			}else if(y == 'O') {
				o++;
			}else if(y == 'U') {
				u++;
			}else if(y == 'P') {
				p++;
			}else if(y == 'X') {
				other++;
			}
			
		}while(y != 'X');//input numbers until the input is x or X
		
		input.close();
		System.out.println("\nREPORT:");
		System.out.println("\n=======\n");
		
		System.out.println("A's: " + a + "\n");
		System.out.println("E's: " + e + "\n");
		System.out.println("I's: " + i + "\n");
		System.out.println("O's: " + o + "\n");
		System.out.println("U's: " + u + "\n");
		System.out.println("P's: " + p + "\n");
		System.out.println("Other Letters: " + other);
		
		System.out.println("\n\n\nThank you for using the letter counter!");
		
		
	}
}
