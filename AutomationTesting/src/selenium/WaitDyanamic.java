package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDyanamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//1.Implicitly wait:
		//implicity wait is applied globally --for all elements
		///not use implicity wait and explicitly wait together bozeselenium WD wait first implicitly and the explecitly
		//hence total sync wait will be increases
		//use anywhere in code 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://touch.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Ftouch.facebook.com%2F&soft=hjk");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement Lname=driver.findElement(By.name("lastname"));
		sendKeys(driver,fname,10,"priyesh");
		sendKeys(driver, Lname, 10, "yadav");
		WebElement next=driver.findElement(By.linkText("Already have an account?"));
		clickOn(driver, next, 5);
		Thread.sleep(5000);
		driver.close();

		
		//2:Explicitly wait: use mostly for ecommerce sites insted of implicitlywait
		//no explicitly keyword used
		//dynamic in nature
		//available with webdriverwait
		//specific to element
	}
		public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value)
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		}
		//for click 
		public static void clickOn(WebDriver driver,WebElement element,int timeout)
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		}
		
}
