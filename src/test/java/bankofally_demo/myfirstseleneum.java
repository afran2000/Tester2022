package bankofally_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstseleneum {

		public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // we need to work with any browser 2. we need to add driver path."
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://www.ebay.com/");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

WebElement searchfield= driver.findElement(By.id("gh-ac"));

searchfield.sendKeys("laptops");

WebElement Searchbutton =driver.findElement(By.id("gh-btn"));

Searchbutton.click();

driver.quit();


		
	}

}
