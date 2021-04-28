package code;
import java.util.Scanner;

public class ManipulateArray {//Going to make it so that these methods would work on other int arrays as well, not just 100 elements.
	
	public static int[] randomPopulation(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random()*(array.length-1+1)+1);
			
		}
		
		return array;
		
	}
	

	public static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {//only works up to an array with a maximum value of 999
			
			if(array[i] > 99 && array[i] < 1000){
				System.out.print(array[i] + " ");
			}else if(array[i] < 100 && array[i] > 9) {
				System.out.print(array[i] + "  ");
			}else if(array[i] < 10) {
				System.out.print(array[i] + "   ");
			}
			
			if((i + 1)%10 == 0) {
				System.out.println(" ");
			}
		}
	
	}
	
	public static int[] sequentialPopulation(int[] array) {//the populating and shuffling methods don't really need to return anything but I think it's better if they do for general use.
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		return array;//return not needed because the method is taking a pointer to the array anyway.
		
	}
	
	public static int[] shuffleArray(int[] array) {
		
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			int n = (int)(Math.random()*((array.length - 1)-0+1)+0);//length is 100 so subtract one as index start from 0. (0 - 99)
			temp = array[n];
			array[n] = array[i];
			array[i] = temp;
			
		}
		
		return array;
	}
	
	public static int findInt(int[] array, int n) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(n == array[i]) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}

	public static boolean ascending(int[] array) {

		for(int i = 1; i < array.length; i++) {
			
			if(array[i - 1] > array[i]) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static boolean shuffleSort(int[] array) {
		
		for(int t = 0; t < 10000; t++) {//10k tries
			
			if(ascending(array)) {
				return true;
			}
			
			shuffleArray(array);
		}
		
		return false;
	}
	
	public static int lowestValue(int[] array) {
		
		int n = array.length + 1;//largest value from population is = to array length
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < n) {
				n = array[i];
			}
			
		}
		
		return n;
	}
	
	public static int highestValue(int[] array) {
			
			int n = -1;//smallest possible value is 0 (when unfilled)
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] > n) {
					n = array[i];
				}
				
			}
			
			return n;
		}
	
	public static int countOccurences(int[] array, int n) {
		
		int occurences = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == n) {
				
				occurences++;
				
			}
			
		}
		
		return occurences;
	}
	
	public static int[] replaceInt(int[] array, int n, int m) {//replace all n with m
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == n) {
				array[i] = m;
			}
			
		}
		
		return array;
	}
	
	public static int greatestSumOfTen(int[] array) {
		
		int greatestSum = -1;
		int index = -1;
		
		for(int i = 0; i < array.length - 9; i++) {
			
			int sum = 0;
			
			for(int i2 = 0; i2 < 10; i2++) {
				
				sum += array[i + i2];
				
			}
			
			if(sum > greatestSum) {
				greatestSum = sum;
				index = i;
			}
			
		}
		
		return index;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int command = 0;
		
		do {
			
			System.out.println("0. Exit the program.\n");//list of choices
			System.out.println("1. Populate the array randomly. \n ");
			System.out.println("2. Populate the array sequentially from 1 to 100. \n");
			System.out.println("3. Display the Array.\n");
			System.out.println("4. Shuffle the Array. \n");
			System.out.println("5. Find the index of first occurence of an integer. (input another number) \n");
			System.out.println("6. Check if the array is currently ascending. \n");
			System.out.println("7. Attempt to shuffle sort to ascending order. \n");
			System.out.println("8. Find the lowest value in the array. \n");
			System.out.println("9. Find the highest value in the array. \n");
			System.out.println("10. Find the number of occurences of an integer (input another number) \n");
			System.out.println("11. Replace all instances of one integer with another. (input two more numbers, first number is replaced by second number.) \n");
			System.out.println("12. Find the first index where the 10 consecutive values have the greatest sum. \n");
			command = input.nextInt();
			
			
			if(command == 1) {//run each method based on the number entered.
				randomPopulation(array);
			}else if(command == 2) {
				sequentialPopulation(array);
			}else if(command == 3) {
				printArray(array);
			}else if(command == 4) {
				shuffleArray(array);
			}else if(command == 5) {
				System.out.println(findInt(array, input.nextInt()));
			}else if(command == 6) {
				if(ascending(array)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}else if(command == 7) {
				if(shuffleSort(array)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}else if(command == 8) {
				System.out.println(lowestValue(array));
			}else if(command == 9) {
				System.out.println(highestValue(array));
			}else if(command == 10) {
				System.out.println(countOccurences(array, input.nextInt()));
			}else if(command == 11) {
				
				System.out.println("First Integer: ");
				int n = input.nextInt();
				System.out.println("Second Integer: ");
				int m = input.nextInt();
				
				replaceInt(array, n, m);
			}else if(command == 12 ) {
				System.out.println(greatestSumOfTen(array));
			}
			
		}while(command != 0);
			input.close();
			
	}

}
