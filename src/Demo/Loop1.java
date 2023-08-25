package Demo;

public class Loop1 {
	public static void main (String[] args) {
		int k=1;
		for (int i=0; i<4;i++) {   // outer loop
			//System.out.println("Outer loop started.");
			for (int j=1; j<=4-i; j++) {  // inner loop
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");			
		}		
	}
}
