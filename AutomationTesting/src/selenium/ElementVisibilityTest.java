package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// launch chrome
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://register.freecrm.com/register/");
		
		//1: iDisplayed() :apllicable for all the elements
		boolean b1=driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1); // true
		
		//2.isEnabled()
		boolean b2= driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2); // true
		
		//3 seelect I agree checkbox:
		driver.findElement(By.name("terms")).click();
		boolean b3= driver.findElement(By.name("action")).isEnabled();
		System.out.println(b3); // true
		
		//4 isSelected : only forcheckboxes , dropdown,radiobutton
		boolean b4=driver.findElement(By.name("terms")).isSelected();
		System.out.println(b4); // true ---- for terms and condition checkbox
		
		//5 is deselected 
		driver.findElement(By.name("terms")).click();
		boolean b5 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(b5); // false ---- for terms n condn checkbox
		
		driver.close();
	}

}
