package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\\\\\\\Users\\\\\\\\ROHINI\\\\\\\\Downloads\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] items = { "Brocolli","Brinjal" };
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			List<String> items1=Arrays.asList(name);
			if (name.contains(name)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(3000);
				break;

			}

		}
		Thread.sleep(11000);
 driver.quit();
	}

}
