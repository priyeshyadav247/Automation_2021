package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		  driver.findElement(By.className("signinbtn")).click();  
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String text=alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("text is correct");
			
		}else {
			System.out.println("text is incorrect");
		}
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(4000);
	driver.close();
	}

}
