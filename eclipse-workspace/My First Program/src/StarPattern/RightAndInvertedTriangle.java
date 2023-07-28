package StarPattern;

public class RightAndInvertedTriangle {
	
	public static void main(String [] args) {
	
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}  // This for Loop is to generate upper Triangle

	for (int i=1;i<=5;i++) {
		for (int j=4;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}  //// This for Loop is to generate lower Triangle


//Output:-
//
//*
//**
//***
//****
//*****
//****
//***
//**
//*
	
}
}
