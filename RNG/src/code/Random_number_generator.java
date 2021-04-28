package code;

public class Random_number_generator {

	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		int number = (int)(Math.random()*(max-min+1)+min);
		
		
		System.out.println(number);

	}

}

