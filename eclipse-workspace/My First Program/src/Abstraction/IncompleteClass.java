package Abstraction;

public abstract class IncompleteClass {
	
	public IncompleteClass() {
	}
	public void Demo1() {     //Method Declaration     Non Abstract Methods
		System.out.println("Demo Method");    //Method Definition    
	}

	
	public abstract void Demo2();    //   Abstract Method	
	
	
	public abstract void Demo3();   // Abstract Method	
	
	public static void main(String [] args) {
		
		//Incompleteclass IC = new IncompleteClass();
		//cannot create the object of abstract class
	}
	
}
