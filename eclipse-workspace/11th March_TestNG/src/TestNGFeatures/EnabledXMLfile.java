package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnabledXMLfile {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void Setup() {  //1 4 //7
	System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver.exe/");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void B() {     //2   
		boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo);
		System.out.println("B");	
	}
	
	@Test
	public void A() {
	boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	System.out.println(logo);
	System.out.println("A");
	}
	
	@Test 
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {     //5
	System.out.println("Test2");
	}
	@Test
	public void Test3() {      //8
	System.out.println("Test3");
	}
	
	@AfterClass                    //3  6  9
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}

