package Polymorphism;

public class MainMethodOverloaded {
	
	public static void main(String [] args) {
	
		MainMethodOverloaded Mo=new MainMethodOverloaded();
		Mo.Demo1();
		Mo.Demo2();
		
		int arr[] = {13};
		MainMethodOverloaded.main(arr);
		MainMethodOverloaded.main('A');
	}
	public static void main(int [] args) {
		MainMethodOverloaded Mo=new MainMethodOverloaded();
		Mo.Demo1();
		Mo.Demo2();
	}
	
	public static void main(char  args) {
		MainMethodOverloaded Mo=new MainMethodOverloaded();
		Mo.Demo1();
		Mo.Demo2();
	}

	public void Demo1 () {
		System.out.println("Demo1 Method");
	}
	
	public void Demo2 () {
		System.out.println("Demo2 Method");

	}

}
