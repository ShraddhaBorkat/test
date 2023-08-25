package Demo;

public class MininumNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number [] [] = {{5,2,6} , {7,8,9} , {3,1,4}};
		int minimum = number [0][0];
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if (number [i][j] < minimum) {
					minimum = number [i][j];
				}
			}
		}
		System.out.println("Minimum number is: " +minimum);
	}
}
