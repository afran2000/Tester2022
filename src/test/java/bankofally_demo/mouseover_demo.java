package bankofally_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseover_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.get("https://www.dell.com/en-us");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(5000);
			
			Actions ac=new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath("//span[text()='About Us'"))).build().perform();
			
			driver.findElement(By.linkText("investors")).click();
			
			
			
			
			
			
			
			
			
			
			driver.quit();
			
	
	}
	
	

}
