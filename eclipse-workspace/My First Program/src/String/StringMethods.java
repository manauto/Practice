package String;

public class StringMethods {
	
	public  static void main(String [] args) {
		//1.CharAt method/functions-it returns char values for the particular/specified index
		
		String S1 ="Velocity";
		
		System.out.println("Index-->"+S1.charAt(5));
		System.out.println("Index-->"+S1.charAt(2));
		
		//System.out.println(S1.charAt(10));   //StringIndexOutofBoundsExceptions
		//System.out.println(S1.charAt(-1));
		
		//2.length();  --it returns length or size
		System.out.println(S1.length());
		
		//3. .equals-it checks the equality of string with given object
		
		String S2= "Velocity";
		String S3= "Velocity";
		String S4= new String("Velocity");
		
		System.out.println(S2.equals(S3));   //true
		System.out.println(S2.equals(S4));   //true/false
		System.out.println(S3.equals(S4));
		
		//4.isemptyto check whether the string is empty or not
		String S5 = "Automation";
		System.out.println("S5 is not empty()");
		String S6 = "";
		System.out.println("S6 is empty()");
		
		//5.Replace
		String S7 = "Automation";
		System.out.println(S7.replace('A','O'));
		System.out.println(S7.replace('t','P'));
		System.out.println(S7.replace('X','J'));
		System.out.println(S7.replace('u','z'));
		
		String S8 = "11 05 2023";
		System.out.println(S8.replace(' ','/'));
		
		//6.Replace all
		String S9 = "Java is an easy language";
		System.out.println(S9.replace("an easy language","difficult"));
		System.out.println(S9.replace(""," "));
				
		
		
	}

}
