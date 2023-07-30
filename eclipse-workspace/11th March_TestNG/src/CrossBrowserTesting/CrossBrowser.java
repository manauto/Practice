package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;
	@Parameters("BrowserName")
	@Test
	
	public void OrangeHRM(String Browsername)   {
		
		
		if(Browsername.equals("Chrome"))  {
			
		System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver.exe/");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		else if (Browsername.equalsIgnoreCase("Firefox"))  {
		System.setProperty("webdriver.gecko.driver","C:/Users/Dell/Downloads/geckodriver/");
		driver=new FirefoxDriver();	
		}
//		else if (Browsername.equalsIgnoreCase("Edge"))  {
//		System.setProperty("webdriver.edge.driver","C:/Users/Dell/Downloads/msedgedriver/");
//		driver=new FirefoxDriver();	
//		}
//		else if (Browsername.equalsIgnoreCase("IE"))  {
//		System.setProperty("webdriver.IE.driver","C:/Users/Dell/Downloads/IEdriver/");
//		driver=new FirefoxDriver();	
		//}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement Username=driver.findElement(By.name("username"));
		Username.sendKeys("Admin");
		
		WebElement Password=driver.findElement(By.name("passsword"));
		Password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Exp_Name="Maceo Plex";
		
		String Act_Name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		Assert.assertEquals(Act_Name,Exp_Name);
		
		System.out.println("Correct username");
		System.out.println("Exceution completed");
		
		driver.quit();
		
	}
	
}
