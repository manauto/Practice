package LogicalPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String [] args ) {
	//Armstrong number is a number that is equal to the sum of cubes of its digits.
		//e.g.153= 1^3=1,5^3=125,3^3=27
		//3+125+27=153
		//so 153 is an armstrong number
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int Rem;
		int Sum;
		
		int P=num;  //P=153
		//sum==0;153>0; true
		//153=153/10=15
		//15>0--true
		//15/10=1
		//1>0-true
		//1/10-0
		//0>0-false
		
		for ( Sum=0;num>0;num=num/10)  {
			Rem=num%10;  //153%10=3
			//15%10=5
			//1%10=1
			Sum=Sum+Rem*Rem*Rem;
			//27 =0+3*3*3
			//152=27+5*5*5
			//153=152+1*1*1
		}
		if (Sum == P) {  //153==153
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an armstrong number");
		}
	}
			
			
			
			
}



