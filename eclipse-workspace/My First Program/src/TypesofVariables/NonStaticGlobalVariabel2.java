package TypesofVariables;

public class NonStaticGlobalVariabel2 {
	
	String name="Rupali";
	
	public static void main(String [] args) {
		
		//Syntax --Syso(Classname.varname)
		
		System.out.println(DifferentClass.age);
		System.out.println(DifferentClass.name);   //static variable
		
		//Nonstatic global variabele calling from different class
		DifferentClass DC= new DifferentClass();
		
		//syntax---Syso.(RVN.Varname)
		
		System.out.println(DC.RollNumber);
		System.out.println(DC.name1);
		
		NonStaticGlobalVariabel2 NSGV =new NonStaticGlobalVariabel2();
		
		NSGV.Demo();
	}
	
	public void Demo() {
		
		int RR=65;///local variable
		
		System.out.println(RR);
		System.out.println(name);
	}
	

}
