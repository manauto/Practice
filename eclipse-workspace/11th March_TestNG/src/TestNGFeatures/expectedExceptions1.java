package TestNGFeatures;

import org.testng.annotations.Test;

public class expectedExceptions1 {

	@Test(expectedExceptions=Exception.class)
	
	public void LoginTest() throws InterruptedException  {
		
		System.out.println("Hello");
//		
////		try {
////			int number=10/0;
////		} catch (ArithmeticException e)  {
////			//ToDO:handle exception
	//	}
		int number=10/0;
		
	}

}