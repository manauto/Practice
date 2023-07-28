package Array;

public class LargestNumber {
	
	public static void main (String [] args) {
		
		int arr [] = {3,5,898,9999,345678};
		
		System.out.println(arr.length);
		
		int maximum = arr[0];
		//System.out.println(maximum);
		
		
		
		for (int i = 0;i < arr.length;i++);
		
		if (arr[i]>maximum) {
			maximum = arr[i];
			
			System.out.println("largest number in given array is ....>");
		}
	}

}
