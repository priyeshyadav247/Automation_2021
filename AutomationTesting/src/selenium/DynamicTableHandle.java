package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch chrome
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		 driver.get("http://demo.automationtesting.in/WebTable.html");
		
		 WebElement btnEdit=driver.findElement(By.cssSelector("html>body>section>div>div>div:nth-of-type(3)>div>div>div:nth-of-type(2)>div>div:nth-of-type(3)>div>div:nth-of-type(6)>user-click-select>div>button>i"));
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(btnEdit).doubleClick().build().perform();
		
		 WebElement hi=driver.findElement(By.xpath("//input[@value='a10@gmail.com']"));
		 hi.clear();
		 hi.sendKeys("priyeshparwa@gmail.com");
		 
		 driver.findElement(By.cssSelector("html>body>section>div>div>div:nth-of-type(3)>div>div>div:nth-of-type(2)>div>div:nth-of-type(3)>div>div:nth-of-type(6)>user-click-select>div:nth-of-type(2)>save-click>button")).click();
	}

}
