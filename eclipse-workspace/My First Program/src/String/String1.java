package String;

public class String1 {
	
	public static void main(String [] args) {
		//By using string literal
		
		//String is  a collection of character.
		
		//syntax- String SRVN = ""Values";
		
		String Str = "Automation";   //SCP
		String Str1 = "Automation";  //SCP
		
		// by using new keyword
		
		// syntax
		//String Str = new String ("Values");
		// Classname RVN = new Classname("Stringvalue");
		
		String S3 = new String ("Java");
		String S4 = new String("Java");
		String S5 = new String ("Automation");      //Heap
		
		System.out.println(Str==Str1);// true
		System.out.println(Str==S5); //false
		System.out.println(S3==S4); //false
		
	}

}
