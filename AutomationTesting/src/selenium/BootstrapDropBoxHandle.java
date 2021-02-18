package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.className("multiselect-selected-text")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
	/*
		//select perticular element in drpdown
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Java")) {
				list.get(i).click();
				break;
				
			}
			
		}*/
		// for selecting all the element
		boolean b4=driver.findElement(By.xpath("//label[text()=' HTML']")).isSelected();
		System.out.println(b4);
		if (b4==false) {
			driver.findElement(By.xpath("//input[@value='HTML']")).click();
		}
		boolean b5=driver.findElement(By.xpath("//label[text()=' CSS']")).isSelected();
			System.out.println(b5);
			if (b5==false) {
				driver.findElement(By.xpath("//input[@value='CSS']")).click();
				
			}
			
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			list.get(i).click();
			
			
				
				
			}
		}
	}


