package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		//by using frame name by rightclk+open source page
		//driver.switchTo().frame("SingleFrame");
		
		//by  using xpath
		WebElement frame = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hii ");
		driver.switchTo().defaultContent();// default homepage
		driver.navigate().refresh();
		
	}

}
