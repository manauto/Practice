package Polymorphism;

public class Testclass {

	public static void main(String args[]) {
		
		Maruti M1=new Maruti();   //static or compile time polymorhism
		M1.Start();
		M1.Stop();
		M1.Refuel();
		M1.Test();
		M1.Theftydafty();
		
		System.out.println();
		
		Car C1 = new Car();     ////static or compile time polymorhism
		C1.Start();
		C1.Stop();
		C1.Refuel();
		C1.Test();
		
		System.out.println();
		
		Car C2= new Maruti();    //dynamic or runtime polymorphismor top casting or up casting
		C2.Start();
		C2.Stop();
		C2.Refuel();
		C2.Test();

		System.out.println();
		
		//Maruti M2 = (Maruti)Car();   //down casting
		//classcastexception
		
		
		
	}

}
