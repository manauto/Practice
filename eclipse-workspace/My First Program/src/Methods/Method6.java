
package Methods;

public class Method6 {

	//Non static method calling from same class
	
	public static void main(String [] args) {

		Method6 Test= new Method6();
		//We need to create first object of the class
		//After creating the object copy  of all the non staic methods will be stored the object
		
		Test.m1();
		Test.m2();
		Test.m3();
		
		System.out.println("Main method started");
		
		//Question
		// Can i access static methods by using object reference?--Yes or No
		//Ans-Yes..we can access static methods but it will throw warning message
		//Message-The static method m3()from the type Method6 should be accessed in a static way
	}
	public void m1() {
		System.out.println("Nonstatic regular method calling from same class--m1");
	}
	public void m2() {
		
	System.out.println("Non staic regular method calling from same class--m2");
	}
	public static void m3() {
		
		System.out.println("static method");
	}
}
	