
package Array;

public class ArraySum {
	
	public static void main(String [] args ) {
		
		int arr [] = {1,2,3,4,5};   
		
		System.out.println(arr.length);
		
		int sum = 0;
		
		//0<7---true
		//1<7--true  will execute till true condition is met.
		for (int i = 0;i<arr.length;i++) {
			
			//1=0+1
			//2=1+2    /// 
			sum = sum+arr[1];
		}
		
		System.out.println("Sum of all the elements...>"+sum);
		
	}

}
