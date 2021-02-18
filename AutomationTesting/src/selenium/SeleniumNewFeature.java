package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumNewFeature {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch chrome
		
		driver.get("http://www.google.com"); // open google homepage
		
		   // open a new window
       // driver.switchTo().newWindow(Window.WINDOW);
        //navigate to a URL on newly opened window
        driver.navigate().to("https://www.youtube.com/");


	}

}
