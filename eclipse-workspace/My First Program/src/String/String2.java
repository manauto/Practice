package String;

public class String2 {
	
	public static void main(String [] args ) {
		
		String S1 = new String ("Test");
		String S2 = new String ("Test");
		
		String S3 = "Test";
		String S4 = "Test";
		String S5 = "test";
		
		String S6 = new String ("Java");   //6
		
		String S7 = "Test";
		
		System.out.println(S4 == S3);  //True
		
		
		System.out.println(S1==S2);  // false ......reference comparison
		// false because stored in different location or pointed in different location.
		
		
		
		System.out.println(S3==S4);   //true
		
		System.out.println(S1.equals(S2)); // true  because same location pointed
		
		//same location asel tarach true
		
	}

}
