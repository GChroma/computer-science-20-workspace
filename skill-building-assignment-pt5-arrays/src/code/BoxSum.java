package code;

public class BoxSum {

	public static void randomPopulate(int[][] array) {
		
		for(int x = 0; x < 20; x++) {
			for(int y = 0; y < 20; y++) {
				array[x][y] = (int)(Math.random()*(100-1+1)+1);
			}
		}
	}
	
	public static void printArray(int[][] array) {
		
		for(int x = 0; x < 20; x++) {
			for(int y = 0; y < 20; y++) {
				if(array[x][y] < 10) {
				System.out.print(array[x][y] + "   ");
				}else if(array[x][y] >= 10 && array[x][y] < 100) {
					System.out.print(array[x][y] + "  ");
				}else {
					System.out.print(array[x][y] + " ");
				}
			}
			
			System.out.println("\n");
		}
	}
	
	public static void boxSum(int[][] array) {
		
		int xIndice = 0;
		int yIndice = 0;
		int largestSum = 0;
		
		for(int x = 0; x < 18; x++) {//down rows 
			for(int y = 0; y < 18; y++) {//across columns
				
				int currentBoxSum = 0;
				//use another two loops to create and add the 3x3 area.
				
				//add each number in the 3x3 area.
				for(int x1 = 0; x1 < 3; x1++) {//the 3x3 area: down rows
					for(int y1 = 0; y1 < 3; y1++) {//across columns
						currentBoxSum += array[x + x1][y + y1];
					}
				}
				
				if(currentBoxSum > largestSum) {
					largestSum = currentBoxSum;
					yIndice = y;
					xIndice = x;
					
				}
			
			}
			
		}
		
		System.out.println("The greatest sum is " + largestSum);
		System.out.println("The indices of the top left corner are " + xIndice + " and " + yIndice + " (row, column)");
	
	}
	
	
	public static void main(String[] args) {
		
		int[][] array = new int[20][20];
		randomPopulate(array);
		printArray(array);
		boxSum(array);
	}

}
