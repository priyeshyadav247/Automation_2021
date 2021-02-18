package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch chrome
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		List<WebElement>sugestions=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("total numbers of suggestions:"+sugestions.size()); //size of perticular suggestons
		for (int i = 0; i <sugestions.size(); i++) {
			System.out.println(sugestions.get(i).getText()); // get text of all suggestions 
			if (sugestions.get(i).getText().equals("testing powder")) {
				sugestions.get(i).click(); //click on perticlar suggestions
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();

	}

}
