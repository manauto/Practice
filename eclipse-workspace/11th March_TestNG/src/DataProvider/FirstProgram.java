package DataProvider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstProgram {
	
	WebDriver driver;
	
	@Test(dataProvider="Logindata")
	
	public void LoginTest (String Username,String Password)   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement Username1=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Username1.sendKeys(Username);
		WebElement Password1=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password1.sendKeys(Password);
		
		String Exp_Name="Maceo Plex";
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		boolean Test=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed();
	
		
		Assert.assertTrue(Test);
		
		driver.quit();
	}
	@DataProvider(name="Logindata")
		public Object[] [] LoginData() throws InterruptedException {
			
			Object data[] [] = new Object[5] [2];
			
			//Correct UN and Correct PWD
			data[0] [0] ="Admin";
			data[0] [1]="admin123";
			
			Thread.sleep(4000);
			
			//Correct UN and Incorrect PWD
			data[1] [0] ="Admin";
			data[1] [1]="admin1234";
			Thread.sleep(4000);
			
			//Incorrect UN and Correct PWD
			data[2] [0] ="Admin1";
			data[2] [1]="admin123";
			Thread.sleep(4000);
			
			//Incorrect UN and InCorrect PWD
			data[3] [0] ="Admin1";
			data[3] [1]="admin1232";
			Thread.sleep(4000);
			
			//Empty UN and correct PWD
			data [4] [0]="";
			data[4][1]="admin123";
			Thread.sleep(4000);
			
			return data;
		}
		
	}
	


