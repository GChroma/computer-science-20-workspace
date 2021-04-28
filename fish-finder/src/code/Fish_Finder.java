package code;
import java.util.Scanner;


public class Fish_Finder {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] readings = new int[4];
		for(int i = 0; i < 4; i++) {
			readings[i] = input.nextInt();
			
		}
		input.close();
		
		if(readings[0] < readings[1]) {
			boolean rising = true;
			for(int i = 1; i < 3; i++) {
				if(readings[i] >= readings[i + 1]) {
					rising = false;
				}	
			}
			
			if(rising == true) {
				System.out.println("Fish Rising");
				System.exit(0);
			}
			
		}else if(readings[0] > readings[1]) {
			boolean diving = true;
			for(int i = 1; i < 3; i++) {
				if(readings[i] <= readings[i + 1] ) {
					diving = false;
					
				}
			}
			
			if(diving == true) {
				System.out.println("Fish Diving");
				System.exit(0);
			}
			
		}else if(readings[0] == readings[1]) {
			boolean constant = true;
			for(int i = 1; i < 3; i++) {
				if(readings[i] != readings[i + 1]) {
					constant = false;
				}
			}
			
			if(constant == true) {
				System.out.println("Constant Depth");
				System.exit(0);
			}
		}
		
		System.out.println("No Fish");
		
	}

}
