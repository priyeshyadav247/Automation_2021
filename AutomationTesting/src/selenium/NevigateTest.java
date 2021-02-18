package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");
		 driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[1]")).click();
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.navigate().back();
		 Thread.sleep(1000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 
		

	}

}
