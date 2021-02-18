package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		 
		//WebDriver driver=new ChromeDriver();
		WebDriver driver= new HtmlUnitDriver(); // for short script or execution of test cases
		
		/* note:
		 * 1.
		 * htmlunitdriver is  not availabe in selenium we have to download as a jar file
		 * advantages : testing is happening behind the scene -no browser 
		 * its to fast .. excution of test cases is fast that improves the performance of script
		 * ghost driver 
		 * its not suitable for action class i.e mouse moment , drag and drop, double click ,click and hold . scrolling 
		*/
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.javatpoint.com/");
		
		System.out.println("before title is :===" +driver.getTitle());
		
		driver.findElement(By.linkText("Selenium")).click();
		System.out.println("after title is:=="+driver.getTitle());
	}

}
