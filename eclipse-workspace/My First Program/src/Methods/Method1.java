package Methods;

public class Method1 { //class body
	
	// Static regular method calling from same class
	
	public static void main(String []     args)  { //main method body
		//Starting point of the program
		
		System.out.println("Main method started");
		
		//Direct calling
		
		//Syntax--Method name();
		Demo1();
		Demo2();
		
		//2.Calling by class name
		//syntax-Classname.methodname();
		
		Method1.Demo1();
		Method1.Demo2();
		
		System.out.println("Main method completed/ended");
	}


      public static void Demo1() {
	  
	  System.out.println("Static regular method from same class--Demo1");
  }
	  
	  public static void Demo2() {
	  
	  System.out.println("Static regular method from same class--Demo2");
  }

}