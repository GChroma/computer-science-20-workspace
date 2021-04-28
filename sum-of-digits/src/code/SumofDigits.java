 package code;
import java.util.Scanner;


public class SumofDigits {

	
	public static int addDigits(String n) {
		
		int sum = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			sum += Character.getNumericValue(n.charAt(i));
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		input.close();
		System.out.println(addDigits(n));
	}
	
}
