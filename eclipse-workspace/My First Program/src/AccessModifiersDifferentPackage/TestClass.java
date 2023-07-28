package AccessModifiersDifferentPackage;

import AccessModifiers.Protected1;
import AccessModifiers.Private1;
import AccessModifiers.Public1;
import AccessModifers.Default1;

public class TestClass extends Protected1 {

	public static void main(String [] args) {
		
		Protected1 P1=new Protected1();
		P1.M1();
		P1.M2();
		
		
		//Private1 P1 = new Private1();
		//P1.test1();
		//P1.test2();
		
		//Default1 D =new Default1();
		//D.m1();
		//D.m2();
		
		Public1 P = new Public1();
		P.Demo1();
		P.Demo2();
		
	}
}
	
