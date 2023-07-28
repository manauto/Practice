package Polymorphism;

public class AutomaticPromotion {
	
	public static void main(String [] args ) {
	
		AutomaticPromotion AO = new AutomaticPromotion();
		AO.Test1('D');
		AO.Test1(333.7d);
		AO.Test1(10);
		AO.Test1(3.14);
		AO.Test1(60);
	}
	
	public void Test1(char c) {
		System.out.println("char i/p parameter method");
	}
	
	public void Test1(int i) {
		System.out.println("int i/p parameter method");
	}
	
	public void Test1 (double d) {
		System.out.println("double i/p parameter method");
	}
	public void Test1 (float f) {
		System.out.println("float i/p parameter method");
	}
	public void Test1(long l) {
		System.out.println("long i/p parameter method");
	}
	

}
