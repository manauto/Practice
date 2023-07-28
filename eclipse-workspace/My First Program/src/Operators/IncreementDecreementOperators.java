package Operators;

public class IncreementDecreementOperators {
	
	public static void main (String [] args) {
		
		int a =10;
		int c;
		
		c=a ; //Assign operator    //c=a=10
		System.out.println(c);
		
		a++; //Increment by one    //10+1=11
		System.out.println(a); //increment one
		
		c=c+1; //Increment by one  //c=10+1=11
		System.out.println(c); 
		
		c=c+2;                     //c=11+2=13
		System.out.println(c);
		
		c--;                       //c+13-1=12
		System.out.println(c);
		
		c=c-1;                     //c=12-1=11
		System.out.println(c);
		
		c=c-2;                     //c=11-2=9
		System.out.println(c);
	}

}
