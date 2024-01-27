package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginpage {
	
	WebDriver odriver;
	@BeforeMethod
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.saucedemo.com/");
		
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
		odriver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
	
		
	}

	
	@AfterMethod
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
