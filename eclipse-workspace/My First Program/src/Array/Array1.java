package Array;

public class Array1 {
	
	public static void main (String [] args ) {
		
		int i1 = 10;
		//array is a collection of similar type of elements/values.
		//We can store only a fixed set of elemnt in java array.
		//array is index based and first elemnt of the array is stored at at oth ondex and last index n-1(array name).
		
		//System.out.println(i1);
		//System.out.println(i2);
		//Array Declaration
		
		//1.Syntax
		//datatype arrayname[]=new datatype[size of array]
		int arr[]=new int[10];
		
		//2.Array initialization
		//syntax arrayname[index number[];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		//arr[10]=150;   outofboundexception
		//arr[11]=200;
		//arr[20]=500;
		
		//3.Array usage
		
		System.out.println();
		System.out.println(arr.length);
		
		System.out.println("Index 5 -"+arr[5]); //60
		System.out.println("Index 2-"+arr[2]);  //30
		//System.out.println("Index--"+arr[9]);
		
		for (int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
