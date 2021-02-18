package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	 System.out.println(driver.findElements(By.tagName("iframe")).size());
	 driver.switchTo().frame(0);
	 
	WebElement resize= driver.findElement(By.id("resizable"));
	 
	 Actions action=new Actions (driver);
	 Thread.sleep(4000);
	 action.moveToElement(resize).dragAndDropBy(resize,50,50).build().perform();

	// driver.close();
	}

}
