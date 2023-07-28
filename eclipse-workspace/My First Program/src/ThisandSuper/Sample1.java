package ThisandSuper;

public class Sample1 {

	int number=100;//non static Global variable
	int num=200;
	String Name="Automation";
	
	//what is use of this key word?
	// This keyword is used to access global variables from the same class.
	
	public void Test() {
		int number =500;// non static local variable
		int num =600;
		
		System.out.println(number);   //500
		System.out.println(num);      //600
		System.out.println(Name);     //Automation
		System.out.println();
		System.out.println(this.number);   //100
		System.out.println(this.num);      //200
	}
public static void main(String [] args) {
	Sample1 S1= new Sample1();
	S1.Test();

}
}