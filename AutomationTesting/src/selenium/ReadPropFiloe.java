package selenium;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFiloe {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop =new Properties();
		FileInputStream ip= new FileInputStream("F:\\eclipse\\AutomationTesting\\src\\selenium\\config.properties"); 
		prop.load(ip);
		
		//read the properties:
		
		System.out.println(prop.getProperty("name")); // tom // if weput # in text file it gices ==null
		System.out.println(prop.getProperty("Name")); // null
		System.out.println(prop.getProperty("age")); // 25
		String url=prop.getProperty("URL");
		System.out.println(url);// hhtp://google.com
		
		String WebBrowser=prop.getProperty("browser");
		System.out.println(WebBrowser);
		
		// here we get IF stmt forlaunching various browser 
		
		if (WebBrowser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get(url);
			driver.findElement(By.linkText("Create New Account")).click();
			
			//driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.name(prop.getProperty("firstName_name"))).sendKeys(prop.getProperty("firstName"));
			driver.findElement(By.name(prop.getProperty("surName_name"))).sendKeys(prop.getProperty("surName"));
			driver.findElement(By.name(prop.getProperty("mobileno_name"))).sendKeys(prop.getProperty("mobileno"));
			driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
			
		}
		
	
	}

}
