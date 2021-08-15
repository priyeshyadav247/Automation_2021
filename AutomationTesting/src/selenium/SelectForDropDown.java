package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectForDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//C:\\\\Users\\\\ROHINI\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/mivi-duopods-m20-true-wireless-bluetooth-headset/p/itmc87db06839203?pid=ACCFNH2GZG7AGUTM&lid=LSTACCFNH2GZG7AGUTMZJZY7L&marketplace=FLIPKART&store=0pm%2Ffcn&srno=b_1_1&otracker=hp_omu_Headphones%2B%2526%2BSpeakers_1_9.dealCard.OMU_MWBME3FHOU26_6&otracker1=hp_omu_WHITELISTED_neon%2Fmerchandising_Headphones%2B%2526%2BSpeakers_NA_dealCard_cc_1_NA_view-all_6&fm=neon%2Fmerchandising&iid=0619edd5-db5b-4f3e-9d06-2d1fe0cf3fc1.ACCFNH2GZG7AGUTM.SEARCH&ppt=browse&ppn=browse&ssid=e4x22i8eq80000001627026199407");
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();// xpath= //button[contains(class,'------')]
		
			driver.findElement(By.cssSelector("div#container>div>div:nth-of-type(2)>div>div>div>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>button:nth-of-type(2)")).click();
		
		
	}

}
