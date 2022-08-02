package bankofally_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mysecondselenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // we need to work with any browser 2. we need to add driver path."
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.homedepot.com/");
	

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	
	WebElement searchfield= driver.findElement(By.id("headerSearch"));
	
	

	searchfield.sendKeys("Xps");

	WebElement Searchbutton =driver.findElement(By.id("headerSearchButton"));
	
	Searchbutton.click();
     Thread.sleep(2000);
	
     driver.quit();
	}
}
