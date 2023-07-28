package Methods;

public class Addition {
	
public static void main (String [] args ) {
	
	System.out.println("Main method started");
	
	M1();
	M2();
	
	Addition.M1();
	Addition.M2();
	
	System.out.println("main method ended");
	
}

public static void M1() {
	int i=20;
	int j=30;
	int k=i+j;
	
	System.out.println("Addition of 2 nos==-"+k);
}

public static void M2() {
	
	System.out.println("Main method calling by class name");
}

}
