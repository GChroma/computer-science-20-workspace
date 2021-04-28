package code;
import java.util.Scanner;

public class Middle_Number_Finder {

	public static int middle(int n1, int n2, int n3) {
		
		if(n1 < n2 && n1 < n3) {
			
		}else if(n1 > n2 && n1 > n3) {
			
		}else if(n1 == n2 || n1 == n3) {
			return n1;
		}else {
			return n1;
		}
		
		if(n2 < n1 && n2 < n3) {
			
		}else if(n2 > n1 && n2 > n3) {
			
		}else if(n1 == n2 || n2 == n3) {
			return n2;
		}else {
			return n2;
		}
		
		
		return n3;
		
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		input.close();
		
		System.out.println(middle(n1, n2, n3));

	}

}
