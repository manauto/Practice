package AccessModifiers;

public class Public1 {
	
	//public AM can be accessed anywhere within the project.
	public int No =100;
	
	public static void main(String [] args) {
		
		Public1 P = new Public1();
		P.Demo1();
		P.Demo2();
		
		System.out.println(P.No);
	}
	
	public void Demo1 (){
		
		System.out.println("Access modifier is public1");
	}
	
	public void Demo2 () {
		System.out.println("Access modifiers is public2");
	}

}
