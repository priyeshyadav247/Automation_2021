 package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasics  {

	WebDriver driver;
	/*	 hierarchy of annotation
	 * 1. before suite
	 * 2.before test
	 * 3.before class
	 * 4.before method
	 * 5.test
	 * 6.after anotation executed 
	 */
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuit");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
		@Test (priority=3)
		public void googleLogoTest()  {
		Boolean b=driver.findElement(By.xpath("//div[@id='hpctaplay']")).isDisplayed();
		System.out.println(b);
		}// if here we not gte{} and take part of another test case the its o/pis NullPointer Exception 
		
		@Test(priority=1) // set priority for test if it not gives then its auto generate test cases
		public void googleTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@Test(priority=2,groups = "typing name")
		public void typeName() throws InterruptedException {
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hi priyesh ");
		Thread.sleep(3000);
		}
		@Test(priority=4,groups = "grouping concept")
		
			public void testCase4() {
			System.out.println("test 4");
		}
		@Test(priority=5,groups = "grouping concept")
		public void testCase5() {
			System.out.println("test case 5");
		}
		@Test(priority=6,groups = "grouping concept")
			public void testCase6() {
						System.out.println("test case 6");	}
		
		@AfterMethod
		public void closeBroswer() {
			driver.quit();
		}
		@AfterSuite
		public void afterSuit() {
			System.out.println("afterSuit");
			
		}
		@AfterTest
		public void aftertest() {
			System.out.println("aftertest");
			
		}
		@AfterClass
		public void afterClass() {
			System.out.println("afterClass");
			
		}
	}


