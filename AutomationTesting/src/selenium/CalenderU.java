package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderU {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-title']")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next button 
		}
		
		List<WebElement>dates= driver.findElements(By.className("ui-state-default")); //path of dates
		int count=driver.findElements(By.className("ui-state-default")).size();// size of dates
		for(int i=0;i<count;i++) {
			String text= driver.findElements(By.className("ui-state-default")).get(i).getText();
			if (text.equalsIgnoreCase("16")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
			
		}
	}


}
