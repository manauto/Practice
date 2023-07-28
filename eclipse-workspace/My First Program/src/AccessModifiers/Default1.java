package AccessModifiers;

public class Default1 {
	
	
	//default AM can be access within the same package.
	int number =20;
	
	public static void main(String [] args) {
	
		Default1 D =new Default1();
		D.m1();
		D.m2();
	}

	void m1() {
	
	System.out.println("Default method 1");
    }
	
	void m2() {
	System.out.println("Default method 2");
	}
    }