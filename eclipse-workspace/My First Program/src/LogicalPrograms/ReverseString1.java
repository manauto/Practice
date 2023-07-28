package LogicalPrograms;

public class ReverseString1 {

public static void main(String [] args ) {
		
		String original="JAVA IS SIMPLE";         //original string
		
		
		String reverse="";                  //stores the reverse of a given string
		
		for (int i =original.length()-1; i>=0; i--)    {    //Iterates through the string from last and add each character to variable reverse  
			
			reverse=reverse+original.charAt(i);   
		}
		
		System.out.println("Original string: " + original);
		
		System.out.println("Reverse string: " + reverse);
			
	}

}

