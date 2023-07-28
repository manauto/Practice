package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String [] args )  {
	
		//Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2
		//Prime number-PN is number that is greater than 1 and divided by 1 itself only.
		
		//example-2,3,5,7,9,11,13,17
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);  //scanner is a class used to enter a value in console
		
		int num = sc.nextInt();
		int i;
		for (i=2;i<num;i++)    //i=2  true          i=2
			                   //2<11   true        2<158
			                   //2++               2++
			
				if(num%i==0)    //11%2 not equal to 0  false       11%2=1
					//158%2==0 true
				break;
				
				if(i==num)     // 2==11      2==158
					
					System.out.println("Prime Number");
				else 
				
					System.out.println("Not a prime Number");
}		
}
