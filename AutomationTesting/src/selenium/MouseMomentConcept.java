package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseMomentConcept {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("link"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Member Login")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		
				Thread.sleep(4000);
		driver.close();
	}

}
