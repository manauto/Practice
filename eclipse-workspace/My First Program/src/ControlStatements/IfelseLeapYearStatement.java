package ControlStatements;

public class IfelseLeapYearStatement {
	
	public static void main(String [] args ) {
		
		//condition for leap year
		//year should be divisible by 400 and 4 but not by 100
		
		int Year=2023
				;
		
		if ((Year % 4==0) && (Year % 100 !=0) ||(Year % 400 ==0)) {
			
			System.out.println("Specified Year is a leap year");
		}
		else {
			System.out.println("Specified Year is not a leap year");
		}
		
	}
	

}
