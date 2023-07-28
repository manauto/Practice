
package Methods;


public class Method5 {

	//Non static regular method calling from same class
	
	public static void main(String[] args){

		System.out.println("Main method started");
		
      //1.Direct calling
		//Demo1();
		//Demo2();
		
		//2.Calling by class name
	//  Method5.Demo1(); (non satic methods cannot be called from class.It requires object to be created)
	//  Method5.Demo2();
		
		//Object Creation
		//Syntax-Classname Referencevariablename=new Classname();
		
		Method5 obj=new Method5();
		
		//Objvarrefname.methodname();
		
		obj.Demo1();
		obj.Demo2();
		
		System.out.println("Main method ended");
		
	}
	public static  void Demo1() {
		
		System.out.println("Non static regular method calling from same class--Demo1");	
	}
	
		public void Demo2()	{
			
			System.out.println("Non static regular method calling from same class--Demo2");
		}
		
		public void m1() {
			
			System.out.println("Hello");
		}
		
}
