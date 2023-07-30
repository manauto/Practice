package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram {
	
    WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp ()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}	
	@Test(dataProvider ="loginData")
     public void LoginTest(String Username,String Password,String Expected) throws InterruptedException  {
	
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement User =driver.findElement(By.id("Email"));
		User.clear();
		Thread.sleep(2000);
		User.sendKeys(Username);
		
		WebElement Pass =driver.findElement(By.id("Password"));
		Pass.clear();
		Thread.sleep(2000);
		Pass.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String Actual_Title=driver.getTitle();
		String Expected_Title="Dashboard/nopCommerce administration";
		
		if(Expected.equals("Valid")) {    //true
			
		if (Expected_Title.equals(Actual_Title)) {
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);    //pass
		} else {
			Assert.assertTrue(false);    //fail
		} 
		}	else if(Expected_Title.equals("Invalid"))  {      //false
			if(Expected_Title.equals(Actual_Title)) {    
		    driver.findElement(By.linkText("Logout")).click();
		    Assert.assertTrue(false);    
	} else {
		    Assert.assertTrue(true);    
	}
    }
	}

@DataProvider(name="loginData")
public String [][] GetData() {
	String Logindata[][] = { {"admin@yourstore.com","admin","Valid"},
			{"admin@yourstore.com","adm","Invalid"},
			{"admin@yoursto.com","admin","Invalid"},
			{"admin@yourstor1.com","admin1","Invalid"},
	};
	return Logindata;
    }
	@AfterMethod
	public void TearDown() {
		//driver.quit();
}
}