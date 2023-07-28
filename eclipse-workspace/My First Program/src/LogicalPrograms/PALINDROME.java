
package LogicalPrograms;

public class PALINDROME {

public static void main(String [] args ) {
		
		String original="NURSESRUN";         //original string
		
		String reverse="";                  //stores the reverse of a given string
		
		for (int i =original.length()-1; i>=0; i--)    {    
			
			reverse=reverse+original.charAt(i);   
		}
		System.out.println(reverse);
		
		if (original.equals(reverse))  {
	         System.out.println(original+" is a palindrome");
		}
		else {
	         System.out.println(original+" is not a palindrome");
		
		}		
}
}
