package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsDemo {
	
	
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
			
		WebElement jsAlertButton= odriver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		jsAlertButton.click();
		
		
		
	}
	
	@Test(priority=2)
	void getTextJSAlert()
	{
		
		String textJSAltert=odriver.switchTo().alert().getText();
		System.out.println(textJSAltert);
		
	}
	
	
	@Test(priority=3)
	void clickOnOkJSAlert() throws InterruptedException
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
