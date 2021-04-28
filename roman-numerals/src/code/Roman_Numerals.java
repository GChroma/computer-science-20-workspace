package code;
import java.util.Scanner;

public class Roman_Numerals {

	public static void main(String[] args) {//this code sucks I hate it
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int d1 = n%10;
		n = n/10;
		int d2 = n%10;
		n = n/10;
		int d3 = n%10;
		n = n/10;
		int d4 = n%10;
		
		if(d4 != 0) {
			for(int i = 0; i < d4; i++) {
				System.out.print("M");
			}
		}
		
		if(d3 != 0) {
			if(d3 == 4) {
				System.out.print("CD");
			}else if(d3 == 9) {
				System.out.print("CM");
			}else if(d3 < 4) {
				for(int i = 0; i < d3; i++) {
					System.out.print("C");
				}
			}else if(d3 > 5) {
				System.out.print("D");
				for(int i = 0; i < d3 - 5; i++) {
					System.out.print("C");
				}
			}else if(d3 == 5) {
				System.out.print("D");
			}
		}
		
		if(d2 != 0) {
			if(d2 == 4) {
				System.out.print("XL");
			}else if(d2 == 9) {
				System.out.print("XC");
			}else if(d2 < 4) {
				for(int i = 0; i < d2; i++) {
					System.out.print("X");
				}
			}else if(d2 > 5) {
				System.out.print("L");
				for(int i = 0; i < d2 - 5; i++) {
					System.out.print("X");
				}
			}else if(d2 == 5) {
				System.out.print("L");
			}
		}

		if(d1 != 0) {
			if(d1 == 4) {
				System.out.print("IV");
			}else if(d1 == 9) {
				System.out.print("IX");
			}else if(d1 < 4) {
				for(int i = 0; i < d1; i++) {
					System.out.print("I");
				}
			}else if(d1 > 5) {
				System.out.print("V");
				for(int i = 0; i < d1 - 5; i++) {
					System.out.print("I");
				}
			}else if(d1 == 5) {
				System.out.print("V");
			}
		}
	}

}
