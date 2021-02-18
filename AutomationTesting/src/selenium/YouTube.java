package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=0bmE9XY3sOc");
		driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
	}

}
