package StarPattern;

public class NumberPattern2 {
	
	public static void main(String [] args ) {
	
	for (int i=1;i<=5;i++) {
		for (int j=5;j>=i;j--) {
			System.out.print(i);
		}
		System.out.println();
	}

//Output:-
//
//11111
//2222
//333
//44
//5
	}
}
