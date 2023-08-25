package Demo;

public class MaximumNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number [] [] = {{3,1,4}, {7,8,9}, {5,2,6}};
		int maximum = number[0][0];
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if (number[i][j] > maximum) {
					maximum = number[i][j];
				}
			}
		}
		System.out.println("Maximum number in the array is: " +maximum);
	}
}
