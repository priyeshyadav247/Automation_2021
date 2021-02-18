package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://total-qa.com/live-examples/loginpage");
		/*
		// 1.xpath ---- rule---- 1. absolute xpath is not used [html/div/div1]
		 //  uses ---//*[@id='']
		 
		 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("priyeshparwa");
		 driver.findElement(By.xpath("//*[@id='pass word']")).sendKeys("rpriyesh247@12");
		 
		 //2.id:
		 driver.findElement(By.id("username")).sendKeys("yadav");
		 driver.findElement(By.id("pass word")).sendKeys("yadav123");
		 */
		 //3Linktext
		 
		//driver.findElement(By.linkText("Sign In")).click();
		
	//4.partilLinkText:
	//	driver.findElement(By.partialLinkText("SELENIUM BASICS AND")).click();
		
		//5.css selector
		//if id is there : #id
		//if id is not there then use className
		//driver.findElement(By.cssSelector("#username")).sendKeys("hi");;
		 
		//6.name
		//7.className
		driver.findElement(By.className("textboxcolor1")).sendKeys("pr");;
	
	}

}
