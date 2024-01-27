package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDemo3 {
	
	
	
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
	void keyCopyPasteDemo() throws InterruptedException
	{
		
		WebElement firstName=odriver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		WebElement lastName=odriver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
		firstName.sendKeys("Bangalore");
		oaction=new Actions(odriver);
		//Windows -->Keys.CONTROL
		oaction.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		oaction.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		lastName.click();
		oaction.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
	
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	
	
	
	@AfterMethod
	void appclose()
	{
		odriver.quit();
	}
	
	

}
