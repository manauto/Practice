package TypesofVariables;

public interface LocalVariables_2 {

	public static void main(String [] args ) {
		
		
		LocalVariables_2.Test1();
		LocalVariables_2.Test2();
	}
	
	
	
	public static void Test1()  {
		
		int number = 300;////non static local variable
		
		System.out.println(number);
	}
	
	public static void Test2()   {
		
		int i = 10;
		int j =20;    // non static local variable
		int k=i+j;
		
		System.out.println(k);
	}
	
}


