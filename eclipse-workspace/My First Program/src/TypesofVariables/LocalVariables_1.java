package TypesofVariables;

public class LocalVariables_1 {
	
	public static void main(String [] args ) {
		
		
		LocalVariables_1.m1();
		LocalVariables_1.m2();
	}

	public static void m1() {
		int rollno=20;
		String name="Anushree";


		//int static name=20;---->we cannot declare static variable inside the main method body or any kind of method of the class.
		
		
		System.out.println(rollno);
		System.out.println(name);
		
		//System.out.println(Abc);
		
	}
	
	public static void m2() {
		
		int Abc=20;
		String name="Shrisha";
		
		System.out.println(Abc);
		System.out.println(name);
		
		
		
	}
}


