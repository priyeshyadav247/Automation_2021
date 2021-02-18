package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0);
	Actions action=new Actions(driver);
	/*
	action.clickAndHold(driver.findElement(By.id("draggable")))//click and hold the object
	.moveToElement(driver.findElement(By.id("droppable")))// move to the anither element
	.release()// realese to antother element
	.build()
	.perform();*/

	action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.close();
	}

}
