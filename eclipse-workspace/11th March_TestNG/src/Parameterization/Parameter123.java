package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter123 {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters ("URL")
	
   public void SetUp   (String URL) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@Test
	@Parameters ({"Username","Password"})
	public void LoginTest(String Username,String Password)   {
		
		WebElement Username1=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		//Assert.assertTrue(Username1.isDisplayed());
		Username1.sendKeys(Username);
		
		WebElement Password1=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		//Assert.assertTrue(Password1.isDisplayed());
		Password1.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Actual_Title=driver.getTitle();
		String Title="OrangeHRM";
		
		if(Actual_Title.equals(Title)  ) {
			System.out.println("Correct Title");
		}
		else
			{
				System.out.println("Inorrect Title");	
			}	
		}

	@AfterMethod
		public void Teardown() {
			driver.quit();	
		}
}	
			

	