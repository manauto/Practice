

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class ByjusBookFreeOfflineSession  {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
	}
	@Test
	public void LoginTest() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Rupali");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9766106961");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("rsrbiotech@gmail.com");  //not mandatory
		
		WebElement States = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		
		Select S1 = new Select(States);
		S1.selectByValue("Maharashtra");
		Thread.sleep(2000);
		
		WebElement grade = driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		Select S2 = new Select(grade);
		S2.selectByVisibleText("Class 5");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"ftcOfflineScheduleClass\"]")).click();
		Thread.sleep(3000);
		
		WebElement City=driver.findElement(By.xpath("//select[@name=\"city-offline\"]"));
		
		Select S3=new Select(City);
		S3.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement Centre=driver.findElement(By.xpath("//select[@name=\"center-offline\"]"));
		Select S4=new Select(Centre);
		S4.selectByVisibleText("Pune-Hadapsar");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@min=\"2023-07-13\"]")).click();
		WebElement dd=driver.findElement(By.xpath("//input[@type=\"date\"]"));
		dd.click();

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].value='min date'",dd);
		
		String date="13=07-2023";
		driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys(date);
	    
		WebElement TS=	driver.findElement(By.xpath("//select[@name='slot-offline']"));
		Select S5=new Select(TS);
		S5.selectByValue("12 PM - 2 PM");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"schedule-offline-session-btn\"]")).click();
	}
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(4000);
		//driver.quit();
	}
}
