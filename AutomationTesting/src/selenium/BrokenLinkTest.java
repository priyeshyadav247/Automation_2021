package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, IOException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemysushi.com/404?");

		// links= //a href
		// image=//img href

		// get list of all links and images
		java.util.List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of all inks and images" + linkList.size());

		java.util.List<WebElement> activeLink = new ArrayList<WebElement>();

		// 2. iterate linkList : exclude all the link/images- doesnt have any href
		// attribute
		for (int i = 0; i < linkList.size(); i++) {
			System.out.println(linkList.get(i).getAttribute("href"));
			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLink.add(linkList.get(i));
			}
		}
		// get size of active links
		System.out.println("active links is :" + activeLink.size());

		// 3. check the href url, with httpconnectiuon api:
		// 200--ok
		// 400--bad reqst
		// 404-- not found
		// 500-- intrnal error

		for (int j = 0; j < activeLink.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLink.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String respond = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLink.get(j).getAttribute("href") + "-----" + respond);
		}

	}
}
