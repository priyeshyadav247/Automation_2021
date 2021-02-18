package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.javatpoint.com/");
		
		System.out.println("before title is :===" +driver.getTitle());
		
		driver.findElement(By.linkText("Selenium")).click();
		System.out.println("after title is:=="+driver.getTitle());

	}

}
