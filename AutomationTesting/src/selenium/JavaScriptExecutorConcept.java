package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("priyeshparwa");
		driver.findElement(By.name("pass")).sendKeys("rpriesh247");
		WebElement loginBtn= driver.findElement(By.xpath("//button[@type='submit']"));
		flash(loginBtn, driver); // highlight the perticular login btn n blink it 
		drawBorder(loginBtn,driver);//border for login btn
		
		// for scrrenshot
		/*
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // as file to driver- takesscreenshot-src
		FileUtils.copyFile(src, new File("D://highlight&BOrder.png"));
		*/
		// for alert message
		//generateAlert(driver, "this is a error u have to resolve");
		
		//click element by js 
		clickElementByJs(loginBtn, driver);
		refreshBrowser(driver);
		
		//geting title by javscript
		System.out.println(getTitleBy(driver));
		
		//getting page text by js 
		System.out.println(getInnerText(driver));
		
		//page scroll at bottom
		//pageScroll(driver);
		
		//pagescroll till the element not visible
		WebElement services= driver.findElement(By.xpath("//a[@title='Browse our Facebook Services directory.']"));
		scrollIntoView(services, driver); // go till services 
		services.click(); // click on services and get new page
		
	}

	public static void flash(WebElement element, WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0;i<50;i++) {
			changeColor("rgb(255,0,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver)  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
	
	}	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid red'", element);
	}	
		
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickElementByJs(WebElement element,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void refreshBrowser(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}
	public static String getTitleBy(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title= js.executeScript("return document.title;").toString();
		return title;
		
		
	}
	public static String getInnerText(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String pageText= js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static void pageScroll(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
}
