import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExamTabByjus {
	
	WebDriver driver;
	@BeforeMethod
	
public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://byjus.com/");
	}
	@Test
	public void Byjus() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class=\"primary-login-btn\"]")).click();
		
		//driver.findElement(By.xpath("//div[@class=\"selected-country\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"number-input\"]")).sendKeys("9766106961");

		//driver.findElement(By.xpath("//div[@class=\"phone-input-container input-group\"]")).sendKeys("9766106961");
	
		//driver.findElement(By.xpath("//input[@placeholder=\'Enter your mobile number\']")).sendKeys("9766106961");
//		
//        JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
//        
//        WebElement Element=driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
//   
//        // JS.executeScript(Script,Arguments);
//       JS.executeScript("arguments[0].scrollIntoView();",Element);    //Call the JavascriptExecutor method to scroll upto that element
//       
//        Element.sendKeys("9766106961");
	    Thread.sleep(3000);	
	    
//	    JavascriptExecutor
//	    – JavascriptExecutor jse = (JavascriptExecutor)driver;
//	    – jse.executeScript(“document.getElementById(“input-email”).setAttribute(‘value’,’QAFox’)”);
//	     
	    //driver.findElement(By.xpath(" //div[@class=\"number-input\"]")).sendKeys("9766106961");
		//driver.findElement(By.xath("//input[@placeholder='Enter your mobile number'][1]")).sendKeys("9766106961");
		//driver.findElement(By.xpath("//div[@class=\"phone-input-container input-group\"]")).sendKeys("9766106961");
		//driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9766106961");
		
		//driver.findElement(By.xpath("//input[@min=\"0\"]")).sendKeys("9766106961");
				
		//driver.findElement(By.xpath("//input[@class=\"phone-text-input  form-control\"]")).sendKeys("9766106961");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@data-menu-key='home']//div[@class='menuitem-icon']")).click();
		
	//	driver.findElement(By.xpath("//button[@class=\"btn next-btn next-btn btn btn-light\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"login-btn text-center\"]")).click();
	
		Thread.sleep(3000);
	}
		@AfterMethod
		
		public void Teardown() throws InterruptedException {
			Thread.sleep(3000);
		}
		}

