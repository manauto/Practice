package ControlStatements;

public class IfElseIfladderstatement {
 
	public static void main(String [] args) {
		/* if else if ladder 
		syntax
		if(condition1){
		statement1--->execute when condition 1 is true
		}
		else if(condition2){
		statement2--->execute when condition 2 is true
		}
		else if(condition3){
		statement3--->execute when condition3 is true
		else (condition4){
		statement 4--->execute when all conditions are false
		}
		 */
		int marks=85;
		if (marks>=80 && marks<90) {
			System.out.println("Distinction");
		}
		else if (marks>=80 && marks<70) { 
			System.out.println("First class");
	    }
	    else if (marks>=70 && marks<60) { 
		System.out.println("Higher second class");
	    }
	    else if (marks>=60 && marks<50) { 
	    System.out.println("Second class");
        }
	    else if (marks>=50 && marks<40) { 
	    	System.out.println("Passed");
	    }
	    else {
	    	System.out.println("Failed");
	    }
	}
}
