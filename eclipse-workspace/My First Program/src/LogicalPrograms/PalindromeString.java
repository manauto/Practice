package LogicalPrograms;

import java.util.Scanner;

public class PalindromeString {
	
//      public static void main(String [] args ) {
		
//		String original ="MOM";
//		String reverse="";
//		
//		for (int i=original.length()-1;i>=0;i--)  {
//		reverse=reverse+original.charAt(i);	
//		//The charAt() method accesses each character of the string.
//	    }
//	    System.out.println(reverse);
//	    
//	    if(original.equals(reverse))  {
//	    	System.out.println("The given string is a palindrome");
//	    }
//	    else {
//	    	System.out.println("The given string is not a palindrome");
//	    }
//	}
//}
		public static void main(String args[])  {
		      String original, rev = "";
		      Scanner sc = new Scanner(System.in);
		 
		     System.out.println("Enter a string:");
		     original = sc.nextLine();
		     //MOM
		     //121
		      int length =original.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )  {  // i=mom-1=2,2>0,2-- ->1    
		    	  // i = 2, rev = "", Original = "MOM"
		    	  //i = 1, rev ="M", Original = "MOM"
		    	//i = 0, rev ="MO", Original = "MOM"
		    	  
		         rev = rev + original.charAt(i); 
		         // rev = "M"
		         //rev = "MO";
		         //rev = "MOM"
		      }
		      
		      if (original.equals(rev))
		         System.out.println(original+" is a palindrome");
		      else
		         System.out.println(original+" is not a palindrome");
		 
		   }
		}
