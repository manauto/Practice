package ControlStatements;

public class IfElseIfLeapYear {
	
	public static void main(String[] args) {
		
		int year=2023;
		
		
		if (year % 400 ==0) {    
			
			System.out.println("The year is a leap year");
		}
			else if (year % 100 ==0) {
				
				System.out.println("This is not a leap year");
			}
			else if (year % 4==0) {
					
				System.out.println("This is a leap year");
				}
			else {
				System.out.println("This is not a leap year");
					
			}
		
		
	}
}		
