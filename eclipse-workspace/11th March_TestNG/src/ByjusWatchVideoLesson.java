
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByjusWatchVideoLesson  {

	@SuppressWarnings("deprecation")
	public static void main (String[] args ) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
	
		Thread.sleep(2000);
		
        JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
        
        WebElement Element=driver.findElement(By.xpath("//h2[contains(text(),\"Watch video lessons\")]"));
   
        // JS.executeScript(Script,Arguments);
       JS.executeScript("arguments[0].scrollIntoView();",Element);  
	   //JS.executeScript("window.scrollBy(0,4500)","Element");   //Call the JavascriptExecutor method to scroll upto that element
	   Thread.sleep(3000);	
	   
	   WebElement Class=driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));

	   Select S1=new Select(Class);
	   S1.selectByValue("6");      // to select class 6
	  
	   driver.findElement(By.xpath(("//div[@class=\'row row-inline\']//div[2]//a[1]"))).click();
	   
	   driver.navigate().to("https://youtu.be/p1cM7T0fvhQ");
	   Thread.sleep(4000);
	   
	   
	   //driver.quit();
	}
}
