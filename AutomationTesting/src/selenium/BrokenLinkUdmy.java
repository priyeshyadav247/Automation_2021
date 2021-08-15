package selenium;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class BrokenLinkUdmy {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//broken url
		// STEP -1 -- is to get all urls tied up to the links usinmg selenium
		// java methods call the URL s and gets you the status code 
		// if status code >400 then that url is not working  ---> broken url
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//String url= driver.findElement(By.xpath("//a[@href='https://www.soapui.org/']")).getAttribute("href");
		String url= driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		HttpURLConnection con= (HttpURLConnection)new java.net.URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int stcode= con.getResponseCode();
		System.out.println(stcode); //for 1 xpath is get 200 n another is 404

	}

}
