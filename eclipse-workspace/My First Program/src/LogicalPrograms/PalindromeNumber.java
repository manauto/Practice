package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String [] args )  {
		
		int originalnumber,sum,rem;
		
		// e.g.121
		
		System.out.println("Enter a number");
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();      
		
		originalnumber=num;
		//121
		for(sum=0;num>0;num=num/10) {  //sum-0,121>0,121=121/10=12    true      /-means quotient
			//12>0,12=12/10=1  //true
			//1>0,1=1/10=0   /// true   
			//0>0         //false
			rem=num%10;       //121%10=1   12%10=2   1%10=1       modulus means remainder
			sum=sum*10+rem;	  //0=0*10+1=1
			                  //1=1*10+2=12
			                  //12=12*10+1=121
		}
		if (sum==originalnumber)  {
			//121=121
			System.out.println(originalnumber+" is a palindrome");
			//System.out.println("originalnumber is a palindrome");
		}
		else  {
			System.out.println(originalnumber+"->is not a palindrome");
			}	
       }
       }
