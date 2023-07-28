package Casting;

public class Casting4 extends Casting3 {
	
	public void Demo3() {
		System.out.println("Demo3-method");
	}
	
	public static void main (String [] args) {
		
		Casting4 C4 = new Casting4();    //static binding +CTP+ early bionding
		C4.Demo1();
		C4.Demo2();
		C4.Demo3();
		
		System.out.println();
		//Upcasting
		
		Casting3 C3 = new Casting4();   //upcasting+downcasting +RTP+late binding
		
		C3.Demo1();
		C3.Demo2();
		
		//Downcasting
		
		Casting4 C2 = (Casting4) new Casting3();   //ClassCAstexception
		C2.Demo1();
		C2.Demo2();
		C2.Demo3();
		
		
	}

}
