package bankofally_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_demo {

	public static void main(String[] args) throws Exception {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement drop=driver.findElement(By.xpath("//td[@id=\"gh-cat-td\"]"));
		drop.click();
		Select dropdown=new Select(driver.findElement(By.id("gh-cat")));
		dropdown.selectByVisibleText("Antiques");
		
		Thread.sleep(5000);
		driver.quit();
		
		
	
         
         
         
         
		
		
		
		
		
		
		
		
		
		
		
		// select by index,value,text
       
        
         
         
         
         
         
         
         
	}

}
