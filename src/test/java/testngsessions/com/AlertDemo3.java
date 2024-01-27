package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertDemo3 {
	

	WebDriver odriver;
	@BeforeTest
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	
	
	@Test(priority=1)
	void clickOnAlertButton()
	{
			
		WebElement jsAlertPromptButton= odriver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		jsAlertPromptButton.click();
		
		
		
	}
	
	@Test(priority=2)
	void passValueToJSAlertPrompt()
	{
		
		odriver.switchTo().alert().sendKeys("Bangalore");
		
		
	}
	
	
	@Test(priority=3)
	void clickOnOkPromptJSAlert() throws InterruptedException
	{
		
		odriver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}

	
	@AfterTest
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	

}
