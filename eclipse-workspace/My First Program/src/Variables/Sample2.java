package Variables;

public class Sample2 { //Class body
     public static void main(String[] args) { //Main method body
	
	//1.Variable Declaration
	String StudentFirstName;   ///Anushree
	String StudentLastName; //Jagtap
	int RollNo; //44 43
	char StudentGrade; //A B C D
	Float StudentPercentage;  //85.86
	
	//2.Variable initialization (Assisgning)
	StudentFirstName="Anushree";
	StudentLastName="Jagtap";
	RollNo=44;
	StudentGrade='A';
	StudentPercentage=85.86f;
			
	//3.Usages
			//String Concatenation
	System.out.println(StudentFirstName+"First Name :"); //printing statement
	System.out.println("Last Name :"+ StudentLastName);  
	System.out.println("Roll No :"+ RollNo);
	System.out.println("Grade :"+ StudentGrade);
	System.out.println("Percentage :"+ StudentPercentage);
}
}
