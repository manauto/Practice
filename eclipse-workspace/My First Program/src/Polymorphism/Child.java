package Polymorphism;

public class Child extends Father{

	
	public void  Bike() {
		System.out.println("Bike-Activa");
	}
	@Override
	public void Home() {
		System.out.println("Home-3BHK");
	}
	@Override
	public void Car() {                      //method declaration
		System.out.println("Car-Swift");      //method definition
	}
	
	public static void main(String [] args ) {
	
      Father F1=new Father();
       F1.Car();  //Maruti
       F1.Home();
       F1.Money();
       
       Child C1=new Child();    //static polymorphism
       C1.Bike();   //Bike
       C1.Home();   //3BHK
       C1.Car();    //Swift
       C1.Money();  //500000
       
       Father F2=new Child();      //dynamic polymorphism
       //   here the methods of that class will be called whose object is created if they are not there
       // then methods of that class will be called whose reference variable is there.
       F2.Car();    //swift
       F2.Home();
       F2.Money();
	}
}
