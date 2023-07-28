package TypesofVariables;

public class Static_Global_Variables_1 {
	
 static int number = 300;   //static global variable
	
	public static void main(String [] args ) {
		
		Static_Global_Variables_1 SV =new Static_Global_Variables_1();       // creation of object
		SV.m1();      //calling by 
		SV.m2();
		SV.name();
		SV.name1();
		}
	
	public void m1 () {
		
		System.out.println(number);   //300
		
		number = 400;
		
		System.out.println(number);   //400
	}
	
	public void m2 () {
		
		System.out.println(number);  //400
		
		number = 500;
		
		System.out.println(number);  //500
	}
	 public void name() {

		System.out.println(number);  //500
			
		 number =600;
		 
		 System.out.println(number); //600
	 }
	 
	 public void name1()  {

			System.out.println(number); //600
			
		 number=700;
		 
		 System.out.println(number);  //700
	 }

}