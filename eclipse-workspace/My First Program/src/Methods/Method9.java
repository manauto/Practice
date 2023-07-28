package Methods;

public class Method9 {

	public static void main (String[]  args) {
	
		//1.Method without parameter//zero parameter
	    Method9 M9 = new Method9(); //write the correct name of the class
		M9.addition();
		M9.addition1();
		M9.addition2();
		
		//2.calling by class name
		Method9.addition1();	
	}
	public void addition() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Addition of two no is--"+c);
	}
	
	public static void addition1() {
	
	int a=10;
	int b=50;
	int c=a+b;
	
	System.out.println("addition of two no is---"+c);
	}
	
	public void addition2() {
	
	int a =50;
	int b=75;
	int c=a+b;
	
	System.out.println("Addition of two no is--"+c);
	
	}
	
	}
	
