package code;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] manta = new int[3][5];
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				
				manta[x][y] = x + y;
				
			}
		}
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				
				System.out.print(manta[x][y]);
				
			}
			System.out.println(" ");
		}
	}
}
