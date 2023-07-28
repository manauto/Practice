package LogicalPrograms;

public class STringRevEachWord {
	
	public static void main(String [] args) {
		
		//String Str = "Hello good evening";
		//expected Result-gnineve doog olleH
		//expected -olleH doog gnineve
		String Str ="Velocity";
		
		
		String [] Word = Str.split(" ");  //splitted string into words
		
		String RevS ="";
		
		for(String W: Word) {   //outer loop
			
			String StringWord = "";
			
			for(int i=W.length()-1;i>=0;i--)   {   //inner loop
				
				StringWord = StringWord+W.charAt(i);	
			}
			RevS = RevS+StringWord+" ";
		}
		System.out.println(RevS);
		 
	}

}
