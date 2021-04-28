package code;

import java.util.Scanner;

public class Error_Trap {

	public static void main(String[] args)throws Exception {
		
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter a number from 1-10: ");
			
			try {// <- this command may fail; if it fails, an exception report will be created
				number = input.nextInt();
			}
			
			catch(Exception e){
				
				String garbage = input.next();//put exception value in garbage and delete after.
				
			}
			
			
		}while(number < 1 || number > 10);
		
		System.out.println("The number you inputted was: " + number);
		input.close();

	}

}
