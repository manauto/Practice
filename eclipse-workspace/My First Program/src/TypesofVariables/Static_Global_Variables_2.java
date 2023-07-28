package TypesofVariables;

public class Static_Global_Variables_2 {
	
  static int number =200;
  static String name = "Rupali";

  public static void main(String [] arg) {
	  //Static global variables call from same class
	  //Creating variables outside the method/function is known as global variables.
	  
	  System.out.println(number);
	  System.out.println(name);
	  
	  Static_Global_Variables_2.Demo1();
	  Static_Global_Variables_2.Demo2();
	  
	  Static_Global_Variables_2 SGV=new Static_Global_Variables_2();
	  SGV.Demo3();
	 
  }
  public static void Demo1() {
	  
	  number =300;
	  name="Anushree";
	  
	  System.out.println(number);  //200
	  System.out.println(name);    //Rupali
	  
  }
  public static void Demo2() {
	
	  number =400;
	  name ="Aditi";
	  
	  System.out.println(number);  
	  System.out.println(name);    
  }
  public void Demo3() {
	  
	  number =500;
	  name="Swara";
	  
	  System.out.println(number);
	  System.out.println(name);
	  
  }
}
