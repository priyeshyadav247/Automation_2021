package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
WebDriver driver;
@Parameters({"browser"})
@Test

public void LaunchUrlTest(String browser) {
	System.out.println("running browser is:"+browser);
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
	}else if (browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if (browser.equals("ie")) {
		driver=new InternetExplorerDriver();
	}
	
	/* for assertion concept-----
	Assert.assertEquals("browser", "chrome");
	System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	*/
	driver.get("https://www.facebook.com/");
	
}

	@Parameters({"username","password"})
	@Test
	public void LoginTest(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}

