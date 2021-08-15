package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"//C:\\\\\\\\Users\\\\\\\\ROHINI\\\\\\\\Downloads\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> window = driver.getWindowHandles(); // get id of windows 
		Iterator<String> it = window.iterator(); // we dont use in this for loop
		String parentId = it.next(); // for next id we use iterator for parent
		String childId = it.next(); // for chikd 
		driver.switchTo().window(childId);
		String title = driver.getTitle();
		System.out.println(title);
		String txt=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		System.out.println(txt);
		String emailId=txt.split("at")[1].trim().split(" ")[0]; // getting specific emailid ---- at after and 1 is index  look output
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		

	}

}
