package testpackage;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int f1 = input.nextInt();
		int f2 = input.nextInt();

		input.close();
		
		if(f1 == 0 || f2 == 0) {
			System.out.println("Error");
			System.exit(0);
		}
		
		for(int i = 1; i < m + 1; i++) {
			
			if(i%f1 == 0 && i%f2 == 0) {
				
				System.out.println(i);
			}
	
		}
		
	}

}