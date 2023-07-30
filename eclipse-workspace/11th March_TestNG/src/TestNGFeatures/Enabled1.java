package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled1 {
	
	//test execution order with priority
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void Setup() {
	System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver.exe/");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void B() {    
		boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo);
		System.out.println("B");	
	}
	
	@Test(enabled=false)
	public void A() {
	boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	System.out.println(logo);
	System.out.println("A");
	}
	
	@Test (enabled=false)
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(enabled=true)
	public void Test2() {
	System.out.println("Test2");
	}
	@Test(enabled=true)
	public void Test3() {
	System.out.println("Test3");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
