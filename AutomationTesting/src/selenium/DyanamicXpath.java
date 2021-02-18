package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://stackoverflow.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		/*
		 absolute xpath:not recommnded
		 //*[@id='headerserachebar']/div/div[2]/table/tbody/tr/td[2]/input
		 	//1.performance issue
		 	 *2.not realibel
		 	 *3.can be chnged at any time in future
		 	 */
		//driver.findElement(By.name("q")).sendKeys("happy love");;
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		//driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("xrreme");
		
		/// dynamic input id :
		//id=test_123
		//By.id("test_123")
		//driver.findElement(By.xpath("//input[contains(@id,'tset_123')]")).sendKeys("hello");

		
		/// starts-with
		//id=test 123
		//id=test234
		//id=test456
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("hi");

		
		/// ends-with
		//id=123_test
		//id=234_test
		//id=456_test
		//driver.findElement(By.xpath("//input[ends-with(@id,'test']")).sendKeys("priyesh");;
		
		//for LINKS : all the links are represented by < a > html tag
		//driver.findElement(By.xpath("//a[@class='-marketing-link js-gps-track js-products-menu']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'______')]));
		driver.findElement(By.linkText("About")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
