package StarPattern;

public class RightAndInvertedTriangle2 {

	 public static void main(String args [] )  {
		 
	 
	// This Code is for Upper Triangle
			for (int i=1;i<=5;i++) {
				for (int j=4;j>=i;j--) {
					System.out.print(" ");
				} // This for loop is to print spaces
				for (int k=1;k<=i;k++) {
					System.out.print("*");
				} // This for loop is to print *
				System.out.println();
			} 
		// This Code is for Lower Triangle
			for (int i=1;i<=4;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print(" ");
				} // This for loop is to print spaces
				for (int k=4;k>=i;k--) {
					System.out.print("*");
				} // This for loop is to print *
			   System.out.println();
			}
			
//	Output:-
//
//	    *
//	   **
//	  ***
//	 ****
//	*****
//	 ****
//	  ***
//	   **
//	    *

}
}

