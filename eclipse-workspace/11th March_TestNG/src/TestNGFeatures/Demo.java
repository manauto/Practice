package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver.exe/");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void C() {
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println("C");	
	}
	
	@Test
	public void B() {
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
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	
	

}
}