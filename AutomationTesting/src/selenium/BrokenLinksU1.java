package selenium;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksU1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// broken url
		// STEP -1 -- is to get all urls tied up to the links usinmg selenium
		// java methods call the URL s and gets you the status code
		// if status code >400 then that url is not working ---> broken url

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a= new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a")); // getting list of all links 
		for (WebElement link : links) {
			String url = link.getAttribute("href"); // with attribute who get href 
			HttpURLConnection con = (HttpURLConnection) new java.net.URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
//			String msg=con.getResponseMessage();
//			System.out.println(msg);
			int stcode = con.getResponseCode();
			System.out.println("status code="+stcode);
		
			if (stcode > 400) {
				System.out.println("the link with text *" + link.getText() + "*is broken with code " + stcode);
				//Assert.assertTrue(false);// hard assertion
			a.assertTrue(false);// sof assertion
		}
			else {
				System.out.println("link text=" + link.getText() + "* active code= " + stcode);
			}
			// use below code for more generic method
			//a.assertTrue(stcode < 400, "the link with text *" + link.getText() + "*is broken with code " + stcode);
			
		}
		a.assertAll();
		driver.close();
	}
	
}
