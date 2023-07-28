package AccessModifiers;

public class Private1 {
	
	//Private AM can be accessed within the same class.
	int number = 30;
	
	//Java main() method. public: It is an access specifier.
	//We should use a public keyword before the main() method 
	//so that JVM can identify the execution point of the program. 
	//If we use private, protected, and default before the main() method, 
	//it will not be visible to JVM.
	
	//private static void main(String [] args) {
	public static void main (String [] args) {
		
		Private1 P1 = new Private1();
		P1.test1();
		P1.test2();
    }
	private void test1() {
	
	System.out.println("Private access modifier-P1");
	}
	
	private void test2() {
	System.out.println("Private access modifier-P2");
	}
    }