package pies;
import java.util.Arrays;
import java.util.Scanner;

public class PieCounter {//CCC junior problem 5 2015 (Doesn't work btw)
		
	public static int[] createFinalWay(int n, int k) {//create final way array - final way has each element with n/k pies except the last n%k people who have 1 extra.
		
		int r = n%k;
		int q = n/k;
		
		int[] f = new int[k];//0 -> k-1
		
		Arrays.fill(f, q);
		
		for(int i = 0; i < r; i++) {// add 1 to the first r numbers (as everything is done backwards)
			
			f[i]++;
				
		}
			
		return f;
	}

	
	public static void countWays(int[] p, int n, int k, int ways, int i) {
		
		boolean finishedCounting = true;
		int[] f = createFinalWay(n, k);
		
		boolean way = true;
		
		
		do{//remove 1 from an element
			
			if(p[i] != 1) {

				p[i]--;
				
				for(int i1 = i + 1; i1 < k; i1++) {//add one to one other element
					
					way = true;
					p[i1]++;
					
					for(int i2 = 0; i2 < k - 1; i2++) { //check if this is a valid way
					
						if(p[i2] < p[i2 + 1]) {
							
							way = false;
							
						}
					}
					
					if(way) {//when valid way, add a way, and break so we can recurse.
						
						ways++;
						i = k - 2;
						break;
						
					}else {//if not a way, reset the value changed
						
						p[i1]--;
						
					}
				}
				if (way == false) {
					
					p[i]++;//if not a way, reset the value changed
					i--;
					
					if (i == k - 1) {//don't touch the last value
					
						break;
					
					}
				}
			}else {
				
				i--;
				
			}
			
		}while(way == false); 
		
		
		for(int i3 = 0; i3 < k - 1; i3++) { 
			
			if(p[i3] != f[i3]) {
				
				finishedCounting = false;
			}
		}
		
		if(finishedCounting) {//break from recurse
			
			System.out.println(ways);

		}else {
			
			countWays(p, n, k, ways, i);
		
		}
		
		return;
		
	}
	
	public static void distributePies(int[] p, int n, int k) {
		
		
		Arrays.fill(p, 1);
		
		p[0] = n - k + 1;
		
		if (n == k || k == 1) {//If there is only one person or the same amount of people as pies, there is one way
		
			System.out.println(1);
			
		}else if(n < k) {//If there are more people than there are pies, it is impossible to give one pie to each person
			
			System.out.println(0);
			
		}else {
			int i =  k - 2;
			int ways = 1;
			countWays(p, n, k, ways, i);
		}
		return;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n; //pie pieces
		int k; //people
		n = input.nextInt();
		k = input.nextInt();
		int[] p = new int[k];
		distributePies(p, n, k);
		input.close();
		

	}

}
