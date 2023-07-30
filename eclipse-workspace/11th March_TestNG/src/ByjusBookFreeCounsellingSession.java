
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class ByjusBookFreeCounsellingSession {
		WebDriver driver;
		@BeforeMethod
		
	public void Setup() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://byjus.com/btc/");
	}
		@Test
		public void Byjus2() throws InterruptedException {
			
			driver.findElement(By.xpath("//button[@id='home-btn']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Rupali");
			
			driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9881246245");
			
			driver.findElement(By.xpath("//button[@class=\"otp-btn\"]")).click();
		
			 Thread.sleep(15000);
		
	WebElement City=driver.findElement(By.xpath("//select[@id='formCity']"));
			
			Select S1=new Select(City);
			
			S1.selectByVisibleText("Pune");
			
			Thread.sleep(5000);
			
	WebElement Center=driver.findElement(By.xpath("//select[@id='formCenter']"));
			
			Select S2=new Select(Center);
			
			S2.selectByVisibleText("Pune-Hadapsar");
			
			Thread.sleep(5000);
			
			//driver.findElement(By.xpath("//input[@id='class-ten']")).click();
			driver.findElement(By.xpath("//input[@id='class-nine']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
				
			Thread.sleep(5000);			
	}
	@AfterMethod

	public void Teardown() {
		
		//driver.quit();
	}

		}