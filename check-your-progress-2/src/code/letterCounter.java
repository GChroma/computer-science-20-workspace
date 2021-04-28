package code;
import java.util.Scanner;

public class letterCounter {

	public static void main(String[] args) {//Allan
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Planet P Word Counter!");
		
		String x;
	
		int a = 0, e = 0, i = 0, o = 0, u = 0, p = 0, other = 0;
		
		do {
			System.out.print("\nPlease enter a letter: ");
			
			x = input.nextLine();
			
			if(x.equals("x") == false) {
				x = x.toUpperCase();//turn every input uppercase (not x)
			//(easier to use this than askii)
			}
			
			if(x.equals("A")) {//count letters
				a++;
			}else if(x.equals("E")) {
				e++;
			}else if(x.equals("I")) {
				i++;
			}else if(x.equals("O")) {
				o++;
			}else if(x.equals("U")) {
				u++;
			}else if(x.equals("P")) {
				p++;
			}else if(x.equals("X") == false) {
				other++;
			}
			
		}while(x.equals("X") == false);//input numbers until the input is X
		
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