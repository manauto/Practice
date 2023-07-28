package LoopStatement;

public class WhileLoop {
	
public static void main(String [] args ) {
	
	//WAP to add the sum of first 15 numbers 
	
	//syntax
			//initialization
			//while(condition){
			//code
			//inc/dec
		//}
			//starting point-1
			//ending point-5
	
	
	int i = 1; 
	int sum = 0;
	
	while (i<=15) {
		
		sum=sum+i;
		i++;
	}
	System.out.println("Sum of first 15 numbers:" +sum);
	}
	
		
	}



