package Constructor;

	// any number of constructor can be declared in java class but 
	//constructor name should be the same as class name but arguments /parameters should be different
	
     public static void main(String [] args ) {
		
		Rule5 R5 = new Rule5();
		Rule5 R6 = new Rule5(4);
		Rule5 R7 = new Rule5(1,2);
		Rule5 R8 = new Rule5(1,2,3);
	
	public Rule5() { 
	System.out.println("zero input argument constructor");
	}
	
	public Rule5( int i) {
	System.out.println("one input argument constructor");
	}
	
	public Rule5 (int i,int j) {
	System.out.println("two input argument constructor");
	}
	 
	public Rule5 (int i,int j,int k) {
	System.out.println("three input argument constructor");
	}
	 
	}
	
