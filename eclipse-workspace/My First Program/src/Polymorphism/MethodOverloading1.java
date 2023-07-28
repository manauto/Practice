package Polymorphism;

public class MethodOverloading1 {

	public static void main(String [] args) {
		MethodOverloading1 M1 = new MethodOverloading1();
		M1.Demo1();
		M1.Demo1(10);
		M1.Demo1(10,20);
		M1.Demo1(10,20,30);
		M1.Demo1(10,85.86f);
		M1.Demo1("Java");
	}
	public void Demo1() {
		System.out.println("zer0 i/p argument method");
	}
	public void Demo1(int i) {
		System.out.println("one i/p argument method");
	}
    public void Demo1(int i,int j) {
	System.out.println("two i/p argument method");
    }
    public void Demo1(int i,int j,int k) {
    System.out.println("three i/p argument method");
    }
    public void Demo1(int i,float f) {
    System.out.println("two i/p parameter with different data type");
    }
    public void Demo1(String l) {
    System.out.println("String input argument");
    }
    }