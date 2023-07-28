package Constructor;

public class Rule3 {

	
	//3.Return type is not applicable for constructor even void also.
	
	public static void main(String [] args) {
		
		Rule3 R3 = new Rule3();	
	}
	public Rule3() {
		
		System.out.println("Hello");
	}
	
	// public void Rule3() {   //Not allowed
	//
	//System.out.println("Hello");
}
