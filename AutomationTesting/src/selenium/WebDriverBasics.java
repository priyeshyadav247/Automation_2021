package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// for chrome // for firefox (webdriver.gecko.driver)
	System.setProperty("webdriver.chrome.driver", "//C:\\Users\\ROHINI\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();// launch chrome
	
	driver.get("http://www.google.com"); // open google homepage 
	//driver.get("http://www.facebook.com");//  open facebook after google 
	//driver.navigate().to("http://www.facebook.com");
	
	//geting title of homepage
	
	String title=driver.getTitle();
	System.out.println(title);
	
	//validation point: check google title is correct or not 
	
	if(title.equals("Google"))
	{
		System.out.println("its a coorect");
	}else
	{
		System.out.println("the title is wqrong");
	}
	
	//get current url
	System.out.println(driver.getCurrentUrl());
	
	//exit
	//driver.quit();//quit the browser
	driver.close();
	}

}
