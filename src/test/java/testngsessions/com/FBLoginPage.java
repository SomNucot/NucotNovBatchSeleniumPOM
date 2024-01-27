package testngsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBLoginPage {
	
	
	/*Selenium WebDriver provides three commands to implement waits in tests.

	Implicit Wait
	Explicit Wait
	Fluent Wait
	
*/	
	
	//types of waits
			//1.Static wait
			//example -->Thread.sleep
			//Thread.sleep(9000);
			//2.Dynamic wait
			//a)implicit b)explicit and c) fluent wait
			
			//syntax--->implicit wait
			//odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinmillisceonds));
	
	
	
	
	
	
	
	WebDriver odriver;
	@BeforeMethod
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.facebook.com/");
		
	}
	
	
	@Test(priority=1)
	void titleOfPage()
	{
		String title=odriver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test(priority=2)
	void currentUrlOfPage()
	{
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
		
	}
	
	
	@Test(priority=3)
	void loginpage() throws InterruptedException
	{
		odriver.findElement(By.xpath("//input[@id='email']")).sendKeys("nucot.softwaretesting@gmail.com"
				+ "");
		//Implicit wait
		/*
		 * odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinmillisceonds));
		 */
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		odriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9986453663");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		odriver.findElement(By.xpath("//button[@name='login']")).click();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		
	}


	
	@AfterMethod
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
