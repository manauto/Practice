package ControlStatements;

public class NestedIf1 {
	
	public static void main(String[] args) {
		// creating 2 variables for age and weight
		
		int age = 15;
		int weight = 40;
		
		//applying conditions on age and weight
		
		if (age>=18) {
			if (weight>=50) {
		}
			System.out.println("You are eligible to donate blood");
			
			}
		else {
			System.out.println("You are not eligible to donated blood");
		}
		
	}

}