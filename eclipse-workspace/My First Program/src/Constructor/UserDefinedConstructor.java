package Constructor;

public class UserDefinedConstructor {
// without para const
	
	//1.Var Dec
	int num1;
	int num2;    //nonstatic global variable
	
	public UserDefinedConstructor() {   //without para constructor
	
	//2.var intialization
	num1 =10;
	num2 =20;
	int add = num1 +num2;
	
	//usage
	System.out.println(add);
}

	public UserDefinedConstructor(int a,int b) {
		num1 =a;
		num2 =b;
		int add=num1+num2;
		
		System.out.println(add);
	}
   public void Addition() {   //non static method
	   int sum=num1+num2;
	   System.out.println(sum);
   }

   public static void main(String [] args) {
	 
	   UserDefinedConstructor UD  = new UserDefinedConstructor();
	   UserDefinedConstructor UD1 = new UserDefinedConstructor(20,20);
	   UserDefinedConstructor UD2 = new UserDefinedConstructor(5000,10000);
	   
	   UD.Addition();   //calling of non static method
   }
}