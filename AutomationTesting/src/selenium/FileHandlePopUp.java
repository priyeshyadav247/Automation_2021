package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlePopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\ROHINI\\Downloads\\Java+collection.txt");
		

	}

}
