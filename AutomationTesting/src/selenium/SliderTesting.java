package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTesting {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// checking frame is there or not
		List<WebElement>list=driver.findElements(By.tagName("frame"));
		System.out.println(list.size());
		
		//initialise frame
		driver.switchTo().frame(0);
		
		//handle frame with slider xapth
		WebElement slider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all')]"));
		Thread.sleep(2000);
		
		//sliding 
		Actions action=new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(4000);
		driver.close(); 
	}

}
