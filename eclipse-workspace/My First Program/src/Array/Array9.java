package Array;

public class Array9 {
	
	public static void main (String [] args ) {
		//4*3     4*5
		
		int arr[] ={2,3,4};   //3
		int number [] [] = {{2,3,4},{4,6,4},{4,7,2},{7,4,6}};   //4*3
		
		
		System.out.println(number.length);       // for row
		System.out.println(number[0].length);    //for column
		
		//2,3   row column
		
		System.out.println(number[1][2]);    //2,4,7
		System.out.println(number[0].length); //2,4,7
		
		for (int i = 0;i<number.length;i++) {
			
			for (int j=0;j<number.length;j++) {
				
				System.out.println(number[i][j]+" ");
			}
		}
		
 	}

}
