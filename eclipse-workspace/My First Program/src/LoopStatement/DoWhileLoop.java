package LoopStatement;

public class DoWhileLoop {

	
	public static void main(String[] args) {
		
		//print 1 to 5 numbers using do while loop
		
		//syntax
		//initialization
		//do {
			//code to be executed
			//inc/dec
		//}
		//while (condition)
		
		 int i = 1;
		 
		 do {
			 System.out.println(i);
			 i++;
		 }
		 while(i<=5);
		 
		 System.out.println("Loop completed");
		
	}
}
