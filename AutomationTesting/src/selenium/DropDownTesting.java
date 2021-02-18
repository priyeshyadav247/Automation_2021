package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//handle dropbox
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		select.selectByVisibleText("Monday");
	
		
	
	}

}
