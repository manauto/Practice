package Array;

public class Duplicatearray {
	
	public static void main(String args[] ) {
		
		int arr[] = {2,3,4,5,67,8,9,5,4};
		
		System.out.println("Duplicate elementin a given array");
		
		for(int i = 0;i<arr.length;i++) {
			
			//if i = 2 then j= 2+1=3
		
			
			for (int j = i+1 ;j<arr.length;j++) {
				
			
			
			if (arr[i] ==arr[j]) {
				
				System.out.println(arr[j] + "  ");
			}
		}
		
	}

	}
}