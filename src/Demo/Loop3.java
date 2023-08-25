package Demo;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for ( int i=0; i<=3; i++ ) {
			for (int j=1; j<=i*1; j++ ) {
				k = k+2;
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");	
		}
	}
}