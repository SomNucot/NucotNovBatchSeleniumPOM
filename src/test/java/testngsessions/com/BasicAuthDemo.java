package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAuthDemo {
	
	
	
	WebDriver odriver;
	@BeforeTest
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://the-internet.herokuapp.com/");
		
	}
	
	
	
	@Test
	void handlingBasicAuth() throws InterruptedException
	{
		
			odriver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
			
			odriver.get("http://user:admin@the-internet.herokuapp.com/basic_auth");
		  
			
			
			
			
		
	}

	
	
	
	@AfterTest
	void appclose()
	{
		odriver.quit();
	}
	
	

}
