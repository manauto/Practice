

package TypesofVariables;

public class NonStaticGlobalVariable1 {

	int age= 50;///non static global variable
	String name= "Roshni";
	
    public static void main (String [] args ) {
    	
    	NonStaticGlobalVariable1 NSGV=new NonStaticGlobalVariable1();
    	
    	//Syntax
    	//System.out.println(Refvarname.variabelename)
    	
    	System.out.println(NSGV.age);
    	System.out.println(NSGV.name);
	
 }
    
    public void Test() {
    	
    	int Demo = 40;
    	name="Sujay";
    	
    	
    	System.out.println(Demo);
    	System.out.println(name);
    }
}
