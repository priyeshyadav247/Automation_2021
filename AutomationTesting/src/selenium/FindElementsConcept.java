package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://stackoverflow.com/");
		
		java.util.List<WebElement> linkedList=driver.findElements(By.tagName("a"));
		System.out.println(linkedList.size());
		for (int i = 0; i < linkedList.size(); i++) {
		String ltr=	linkedList.get(i).getText();
		System.out.println(ltr);
		
		driver.close();
		}

	}

}
