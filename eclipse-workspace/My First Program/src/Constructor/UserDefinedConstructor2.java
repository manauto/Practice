package Constructor;

public class UserDefinedConstructor2 {

	//Variable Declaration Car Property/Specifications
	//1 
	String Name;
	String Model;
	int Price;
	String Engine;
	
	
	public UserDefinedConstructor2(String name1,String Model1,int Price1,String Engine1) {/// user defined constructor
		
		//2.Variable intialization
		Name  = name1;
		Model = Model1;
		Price = Price1;
		Engine = Engine1;
		
		// this.Name = name1;
		//this.Model=Model1;
		//this.Price=Price1;
		//this.Engine=Engine1;
	}
	public static void main(String [] args ) {
		UserDefinedConstructor2 UD1= new UserDefinedConstructor2("Kia","Seltos",2000000,"Manual");
		UserDefinedConstructor2 UD2= new UserDefinedConstructor2("Nexon","Tata", 23000000,"Automatic");
		UserDefinedConstructor2 UD3= new UserDefinedConstructor2("Maruti","800",500000,"Manual");
		UserDefinedConstructor2 UD4= new UserDefinedConstructor2("Honda","City",1000000,"Automatic");
		
		System.out.println(UD1.Name+" "+UD1.Model+" "+UD1.Price+ " "+UD1.Engine);
		System.out.println(UD2.Name+" "+UD2.Model+" "+UD2.Price+" "+UD2.Engine);
		System.out.println(UD3.Name+" "+UD3.Model+" "+UD3.Price+" "+UD3.Engine);
		System.out.println(UD4.Name+" "+UD4.Model+" "+UD4.Price+" "+UD4.Engine);
		
		
	}
	
}