package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("pune");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("delhi");
		WebElement date= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal="1-1-2021";
		selectByDate(date,driver,dateVal);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}
	public static void selectByDate(WebElement element,WebDriver driver,String dateVal) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
		
	}
}
