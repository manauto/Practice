package Polymorphism;

public class Staticchild extends Static1{
	
	public static void main(String [] args) {
		
		Staticchild SC = new Staticchild();
		SC.Demo2();
		//SC.Demo1();
		Staticchild.Demo1();
		
	}
		public static void Demo1() {
			
			// method hiding
			//Method hiding can be defined as, "if a subclass defines a static method with the same signature
			//as a static method in the super class, in such a case, 
			//the method in the subclass hides the one in the superclass." 
			
			System.out.println("Parent class static Method");
		}
		
		@Override
		public  void Demo2() {
			System.out.println("Child Method");	
		}
	}	
		
		
	


