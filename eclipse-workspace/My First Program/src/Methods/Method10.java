




package Methods;

public class Method10 {
	//Static regular with parameter
	public static void main (String [] args) {
		
		addition (44,56);
		Method10.addition(10,30);
		subtraction(56,44);
		Method10.addition(30,50);
		subtraction(44,22);
		Method10.subtraction(30,10);
		subtraction(50,30);
		addition(33,44);
		addition1(44,20,10);	
		addition1(89,35,27);
		addition1(96,76,98);
	}
	public static void addition (int a ,int b) {//44,56   30,50//two i/p method
		int c=a+b;//10+30    30+50=80
		System.out.println("addition of two no is---"+c);	
	}
	
	public static void subtraction(int a ,int b) {///two input method
		int c=a-b;//56-44
		System.out.println("subtarction of two no is..."+c);
	}
	
	public static void addition1(int a,int b,int c) {//three input method
		int sum=a+b-c;//44+20-10
		System.out.println("addition / subtraction of 3 no is..."+sum);
	}
}