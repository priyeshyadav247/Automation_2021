package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenShotconcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//take screenshot and store as a file format
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // as file to driver- takesscreenshot-src
		FileUtils.copyFile(src, new File("D://priyesh.png"));
	}

}
