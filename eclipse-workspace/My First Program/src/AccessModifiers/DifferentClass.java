package AccessModifiers;

public class DifferentClass {
	
	public static void main (String args[] ) {
	
	Public1 P= new Public1();
	P.Demo1();
	P.Demo2();
	
	System.out.println("P.No");
	
	
	Default1 D =new Default1();
	D.m1();
	D.m2();
	
	System.out.println("D.No");
    

  // Private1 P1 = new Private1();
  // P1.test1();
   //P1.test2();
   
	Protected1 P1=new Protected1();
	P1.M1();
	P1.M2();
	
	System.out.println("P1.No");
	}
    }


