package AccessModifiers;

public class Protected1 {
	
	//protected access modifier can be accessed within the package and outside the package with inheritance.
	
	int number = 40;

	public static void main(String [] args) {
		
		Protected1 P1=new Protected1();
		P1.M1();
		P1.M2();
	}

	
	protected void M1() {
		System.out.println("Access modifier is protected");
	}
	
	protected void M2() {
		System.out.println("Access modifier is protected");
	}
    }
