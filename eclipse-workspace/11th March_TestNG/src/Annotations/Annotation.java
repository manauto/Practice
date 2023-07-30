package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotation {
	//execution sequence of annotations
//	@Beforesuite===setup systemProperty
//	@BeforeTest--enter URL
//	@BeforeClass-Launch browser
//	@BeforeMethod-Login application
//	@test-GoogleTitle1
//	@AfterMethod-logout from application
//	@BeforeMethod-Login application
//	@Test-GoogleTitle2
//	@AfterMethod-Logout from application
//	@BeforeMethod-Login application
//	@Test--GoogleTitle3
//	@AfterMethod-logout from appliaction
//	@AfterClass-Close Browser
//	@After Test-Deletecookies
	
	//Precondition annotations
	//1.@Beforesuite-Setup system property
	//In real time project we dont need all these annotaions we use only @beforeclass @before method @Test @AfterMethod @AfterClass annotations
	
	@BeforeSuite
	public void Setup() {
		System.out.println("@BeforeSuite-Setup SystemProperty");
	}
	//2.@BeforeTest
    @BeforeTest
    public void URL() {
    	System.out.println("@BeforeTest-Enter URL");
    }
    //3. @BeforeClass
    @BeforeClass
    public void Launchbrowser() {
        System.out.println("@BeforeClass-Launch browser");
    }
    //4. @BeforeMethod
    @BeforeMethod
    	public void Login()  {
    	System.out.println("@BeforeMethod-Login");
    	}
    
    //@Test annoations
    @Test
    public void googleTitle1()  {
    	System.out.println("@Test annotation-Google Title1");
    }
    @Test
    public void googleTitle2() {
    	System.out.println("@Test annotation-Google Title2");
    }
    
    //Postcondition annotation
    //5. @AfterMethod
    @AfterMethod
    public void Logout() {
    	System.out.println("@Aftersuite-Logout");
    }
    //6.  @AfterClass
    @AfterClass
    public void Closebrowser() {
    	System.out.println("@AfterClass-Closebrowser");
    }
    //7. @AfterTest
    @AfterTest
    public void DeleteCookies() {
    	System.out.println("@AfterTest-DeleteCookies");
    }
    //8. @AfterSuite
    @AfterSuite
    public void Logout1() {
    	System.out.println("@AfterSuite-Logout1");
    }
    @Test
    public void GoogleTitle3() {
    	System.out.println("@Test-GoogleTitle3");
    	
    }
    

}
