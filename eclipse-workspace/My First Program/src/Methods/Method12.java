package Methods;

public class Method12 {

	//student info-name,roll no,grade,percentage.;
	
	public static void main(String []args){
		
		Method12.StudentInfo("Anushree", 10, 'A', 90.1f);
		Method12.StudentInfo("Shrisha", 12, 'B', 88.9f);
		Method12.StudentInfo("Aditi", 13, 'C', 87.9f);
		Method12.StudentInfo("Sujay", 14, 'A', 78.9f);
		Method12.StudentInfo("Swara", 15, 'B', 78.5f);
	}

			public static void StudentInfo(String StudentName,int RollNo, char Grade,float Percentage ) {
						
			System.out.println("StudentName--"+ StudentName+ " "+"Student RollNo--"+RollNo+ " "
			+"Student Grade--"+Grade+ " "+"Student Percentage----"+Percentage);
					
			}
		 
}						