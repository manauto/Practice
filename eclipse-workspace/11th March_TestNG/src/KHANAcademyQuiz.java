
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KHANAcademyQuiz {
	
	public static void main(String [] args ) throws InterruptedException  {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   //implicit wait applied
			
			driver.manage().window().maximize();
			
			driver.get("https://www.khanacademy.org/");
			
			driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();		
      
     JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
     
     WebElement Element=driver.findElement(By.xpath("//span[@class=\"_1aixq078\"]"));
      
      JS.executeScript("arguments[0].scrollIntoView",Element);      //Call the JavascriptExecutor method
     
      Thread.sleep(3000);        // to wait or pause
       
       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("rsrbiotech@gmail.com");         //username
     
       driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rupalishinde@123");          //password
       
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();                                //login
       	
     Thread.sleep(4000);
     
     driver.findElement(By.xpath("//span[@data-test-id=\"learn-menu-button\"]")).click();
     
     driver.findElement(By.xpath("//li[@data-navigable-index=\"12\"]")).click();   // to click on class 12
     
     Thread.sleep(4000);
     //driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
     driver.findElement(By.xpath("//a[@class=\"_1rhl3qm4\"]")).click();
	}
}
      //driver.findElement(By.xpath("//span[@class=\"_90x24ln\"]")).sendKeys("Jagtap");
    //driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Jagtap");
    // driver.findElement(By.xpath(("//input[@type=\"text\"][2]"))).sendKeys("Jagtap");
   
     //driver.findElement(By.xpath("//button[@role=\"button\"]")).click();
     
