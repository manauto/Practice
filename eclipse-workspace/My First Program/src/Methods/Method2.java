package Methods;

public class Method2 {
	public static void main (String [] args) {
		
		System.out.println("Main Method Started");
		
		//Direct calling by method name
	
		staticmethod1();
		staticmethod2();
		
		System.out.println("Main method ended");
		
		//calling by class name
		
		Method2.staticmethod1();
		Method2.staticmethod2();
		
		
	}
	public static void staticmethod1() {
		
	int i=10;
	int j=20;
	int k=i+j;  //10+20=30
	
	System.out.println("Addition of two numbers is=="+k);
	}
	
	public static void staticmethod2() {
		
		System.out.println("static method calling from same class");
		
	}
		
		
	
}
