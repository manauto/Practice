package StarPattern;

public class RightTraingle1 {
	
	public static void main(String [] args ) {
	
		//this for loop is for row increment
	for (int i=1;i<=5;i++) {
		
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		} // This for loop is to print spaces
		
	
		for (int k=1;k<=i;k++) {
			System.out.print("*");
		} // This for loop is to print *
		System.out.println();
	}

//Output:-
//    *
//   **
//  ***
// ****
//*****

	
}

}