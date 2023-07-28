

package String;

public class String3 {
	
	public static void main(String [] args) {
		
		
		//difference between == and .equals method
		String S1= new String("Java");      //false //20
		String S2=new String("Java");       //true  //21
		
		System.out.println(S1==S2);     //faLse
		System.out.println(S1.equals(S2));   //true
		
		
		String S3="Java";           //34
	    String S4="Java";           //34
		//String S4="JAVa";
		
		System.out.println(S3==S4);   //true 
		System.out.println(S3.equals(S4));   // true
		
		// always compares reference or address comparison 
		//reference comparison means if both reference point into the same object then it will give true
		
		//.equals method
		//content comparison means compare the two given string based on the content of the string.If any character is not matched,it returns false.
		//if all the characters are matched it returns true
	}
	
	

}
