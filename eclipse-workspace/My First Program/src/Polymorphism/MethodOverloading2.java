package Polymorphism;

public class MethodOverloading2 {

	public static void main(String [] args ) {
		
		MethodOverloading2.Demo1();
		MethodOverloading2.Demo1(1589,1469);
		
		MethodOverloading2 MO = new MethodOverloading2();
		MO.Subtraction(1589,1469);
		MO.addition(1589,1469);	
	}
	
	public static void Demo1() {
		System.out.println("No argument method");
	}
	
	public static void Demo1(int i,int j) {
		System.out.println("two argument method");
	}
	
	public void Subtraction(int i,int j) {
		int subtraction=i-j;
		System.out.println(subtraction);
	}
	public void addition(int i, int j) {
		int addition=i+j;
		System.out.println(addition);
	}
    }

