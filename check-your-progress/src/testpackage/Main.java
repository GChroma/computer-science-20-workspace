package testpackage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double i = 101;//each integer
		double total = 0;//sum of integers
		int n = 0;//amount of integers
		int lowestInt = 101;
		int greatestInt = -101;
		while(i != -1) {
			
			if(i != 101) {
				total += i;
				n++;
				if(lowestInt > i) {
					lowestInt = (int)i;
				}
				
				if(greatestInt < i) {
					greatestInt = (int) i;
				}
			}
				i = input.nextInt();
			
			
		}
		
		double average = total/n;
		
		System.out.println((int)total);
		System.out.println(average);
		System.out.println(greatestInt);
		System.out.println(lowestInt);
	}

}
