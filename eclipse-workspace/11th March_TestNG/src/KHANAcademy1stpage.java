import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KHANAcademy1stpage {
	
	public static void main(String [] args ) throws InterruptedException  {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   //implicit wait applied
			
			driver.manage().window().maximize();
			
			driver.get("https://www.khanacademy.org/");
			
			driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();		
          //driver.findElement(By.xpath("//a[@class=\"_1sq7o4lg\"]")).click();
         
        JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
        
        WebElement Element=driver.findElement(By.xpath("//span[@class=\"_1aixq078\"]"));
         
        //2 methods of JSE-executeScript and executeAsyncScript  
        //JS.executeScript(Script,Arguments);
         JS.executeScript("arguments[0].scrollIntoView",Element);      //Call the JavascriptExecutor method
        // JS.executeAsyncScript("arguments[0].scrollIntoView();",Element);
         
         Thread.sleep(3000);        // to wait or pause
          
          driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("rsrbiotech@gmail.com");         //username
          //driver.findElement(By.xpath("//input[@class=\"_1azps1m\"]")).sendKeys("rsrbiotech@gmail.com");    //username
          driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rupalishinde@123");          //password
          
          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();                                //login
          	
        Thread.sleep(4000);
       
       driver.findElement(By.xpath("//span[@class=\"empty-field pure-hidden-xs\"]")).click();   ///to click on username
       
       Thread.sleep(4000);
       WebElement element1 = driver.findElement(By.id("username"));
       element1.sendKeys("Jagtap");
       driver.navigate().refresh();
       
     driver.navigate().back();
       // identify element
         //WebElement element = driver.findElement(By.id("username"));
       // WebElement element=driver.findElement(By.xpath("//input[@type=\"text\"]"));
        // WebElement element=driver.findElement(By.xpath("//input[@class=\"username\"]"));
         WebElement element=driver.findElement(By.xpath("//span[@class=\"_90x24ln\"]"));
          
         element.sendKeys("Jagtap");
        
          //refresh page
         // driver.navigate().refresh();
          driver.navigate().back();
          //fix exception with try−catch block
         //driver.findElement(By.id("username")).sendKeys("Jagtap"); 
        // driver.findElement(By.xpath("//input[@class=\"username\"]"));
         driver.findElement(By.xpath("//span[@class=\"_90x24ln\"]")).sendKeys("Jagtap");
        //driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Jagtap");
        try{
        	element.sendKeys("Jagtap");
         }
         catch(StaleElementReferenceException e){
        	// WebElement element1=driver.findElement(By.xpath("//span[@class=\"_90x24ln\"]"));
            //element1.sendKeys("Jagtap");
         }
        finally {
       System.out.println("Execution done");
        }
        //driver.findElement(By.xpath("//button[@role=\"button\"]")).click();
}
}