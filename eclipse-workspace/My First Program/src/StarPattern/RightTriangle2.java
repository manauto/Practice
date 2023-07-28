package StarPattern;

public class RightTriangle2 {
	
	public static void main(String [] args ) {
	
	// This for  loop is for row increment
		for (int i=1;i<=5;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			} // This for loop is to print spaces
			
			for (int k=5;k>=i;k--) {
				System.out.print("*");
			} // This for loop is to print *
			System.out.println();
		}

//	Output:-
//	 *****
//	  ****
//	   ***
//	    **
//	     * 

}
}