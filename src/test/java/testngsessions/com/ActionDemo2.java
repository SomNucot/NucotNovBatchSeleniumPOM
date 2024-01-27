package testngsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDemo2 {
	
	
	
	
	
	
	
	
	
	
	WebDriver odriver;
	Actions oaction;
	@BeforeMethod
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
	}
	
	
	@Test(priority=1)
	void scrollDown()
	{
		
		oaction=new Actions(odriver);
		//-->Scroll Down using Action class
		oaction.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
	@Test(priority=2)
	void scrollUP()
	{
		oaction=new Actions(odriver);
		//-->Scroll Up using Action class
		oaction.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
	}
	
	
	
	
	@AfterMethod
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	

}
