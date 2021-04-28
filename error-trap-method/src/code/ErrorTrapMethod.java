package code;
import java.util.Scanner;

public class ErrorTrapMethod {
	
	
	public static int errorTrap(int num1, int num2) {
		
		int min, max;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		
		System.out.println("Please enter a number from " + min + " to " + max + ": ");
		Scanner input = new Scanner(System.in);
		int n = min - 1;
		do {
			
			try {
				n = input.nextInt();
			}
			
			catch(Exception e){
				
				@SuppressWarnings("unused")
				String garbage = input.next();
				
			}
		
			if(n < min || n > max) {
				System.out.println("That is not a valid input.");
			}
			
		}while(n < min || n > max);
		
		input.close();
		
		return n;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Your value was: " + errorTrap(10, 0));
		

	}

}
