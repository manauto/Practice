package TestNGFeatures;

import org.testng.annotations.Test;

public class dependsOnMethods {

	@Test
	public void LoginTest() {
		System.out.println("LoginTest");
	  //int number=10/0;   Arithmetic exception
	}
	
	@Test  (dependsOnMethods="LoginTest")
	public void HomePage()  {
		System.out.println("Homepage");
		}
	@Test  (dependsOnMethods="LoginTest")
	public void Searchpage()  {
		System.out.println("Searchpage");
	}
	@Test
	public void Refreshpage() {
		System.out.println("Refreshpage");
	}
}

