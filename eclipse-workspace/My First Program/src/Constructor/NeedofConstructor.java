package Constructor;

public class NeedofConstructor {
	
	public NeedofConstructor() {
		
		System.out.println("Default Constructor");
	}
	String name; ///non static Gvar //null value
	int RollNo; //default value is 0
	//for boolean default value is false
	
	public static void main(String [] args ) {
		
		NeedofConstructor S1 = new NeedofConstructor(); //1
		NeedofConstructor S2 = new NeedofConstructor(); //2
	  
	  
	    NeedofConstructor S100 = new  NeedofConstructor(); //3
	    NeedofConstructor S200 = new NeedofConstructor();  //4
	}
	 public void M1() {
		 System.out.println(name+" "+RollNo);
	 }
		 
		 public void M2() {
			 System.out.println(name+" "+RollNo);
		 }
}
	


