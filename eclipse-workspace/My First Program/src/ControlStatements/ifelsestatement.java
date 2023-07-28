package ControlStatements;

public class ifelsestatement {

	public static void main(String [] args) {
		int marks = 60;
		int marks1 = 20;
		
		// if (condition){
	 //statement 1 // Executed when condition is true
	 // }
	// else {
	// statement2 //Executed when condition is false}
		// 60>=35---true
		if (marks >=35) {
			
			System.out.println(" Result--Pass");
		}
		else {
			System.out.println("Result--Failed");
		}
		
            System.out.println("Program completed");
            
            if (marks1>=35) {
            	System.out.println("Result--Pass");
            }
            else {
            	System.out.println("Result----Failed");
            }
	}
}