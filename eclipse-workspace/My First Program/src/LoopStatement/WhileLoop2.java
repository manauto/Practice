package LoopStatement;

public class WhileLoop2 {
	
	public static void main(String [] args ) {
		
		// WAP to print 10 to 20 numbers using while loop
		
		int k=10;
		
		//10<=20 -true
		//11<=20 -true
		//19<=20- true
		//21<=20 -false
		while(k<=20) {
			
			System.out.println(k);  //13 16 19
			
			k++;// 11 14 17 20
			k++; //12 15 18 21
			k++; //13 16 19 22
		}
			System.out.println("Loop completed");
		
	}

}
