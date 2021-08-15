package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOnPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerLink = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());

		// here we want to click on specific url from last foot link
		WebElement link = driver.findElement(By.xpath("//table//tbody/tr[1]//ul"));

		System.out.println(link.findElements(By.tagName("a")).size());

		for (int i = 1; i < link.findElements(By.tagName("a")).size(); i++) {

			String clickable = Keys.chord(Keys.CONTROL, Keys.ENTER);

			link.findElements(By.tagName("a")).get(i).sendKeys(clickable);
			Thread.sleep(5000);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
