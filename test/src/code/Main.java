import java.util.Scanner;

public class Main {

	public static String firstS;
	
	public static void checkShifts(char[] T, char[] S) {
		
		int sLength = S.length;
		int tLength = T.length;
		
		for(int i = 0; i < tLength - sLength + 1; i++) {
			
			
			boolean match = true;
			
			for(int i2 = 0; i2 < sLength; i2++) {
				if(S[i2] != T[i + i2]) {
					match = false;
				}
			}
			
			if(match == true) {
				System.out.println("yes");
				System.exit(0);
			}
			
		}
		char firstChar = S[0];
		
		for(int i = 0; i < sLength; i++) {
			
			
			if(i == sLength - 1) {
				
				S[i] =firstChar;
			}else {
			
				S[i] = S[i+1];
			
			}
		}
		
		if(String.valueOf(S).equals(firstS)) {
			
			System.out.println("no");
			System.exit(0);
		}else {
			
			checkShifts(T, S);
		}
	}
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String T = input.nextLine();
		String S = input.nextLine();
		char[] Sarray = S.toCharArray();
		char[] Tarray = T.toCharArray();
		firstS = S;
		checkShifts(Tarray, Sarray);
		input.close();

	}
	
}