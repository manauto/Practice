package ThisandSuper;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Sample3 extends Sample2 {
	
	//int RollNo=10;
	//String Name="Java";   //Non Static Global Variable
	
	//What is the use of super keyword?
	//SK is used to access global variables from different class.
	
	int RollNo=20;
	String Name="Selenium";
	
	public void Demo() {
		int RollNo=30;
		String Name="Python";
		
		System.out.println(RollNo);   //30
		System.out.println(Name);     //python
		
		System.out.println();
		System.out.println(this.RollNo);  //20
		System.out.println(this.Name);    //selenium
		
		System.out.println();
		System.out.println(super.Name); //10
		System.out.println(super.RollNo);   //Java	
	}
	Sample3 S2=new Sample3();
	S2.Demo();

}
 