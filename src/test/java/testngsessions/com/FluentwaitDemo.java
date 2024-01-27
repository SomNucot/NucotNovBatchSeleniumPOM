package testngsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentwaitDemo {
	
	
	//3.FluentWait
	//syntax
			
			/* Wait<WebDriver> owait=new FluentWait<WebDriver>(odriver)
					.withTimeout(Duration.ofSeconds(Time in Milliseconds))
					.pollingEvery(Duration.ofSeconds(Time in Milliseconds))
					.ignoring(Exception.class);
			*/



			 /*	
				//Declare and initialise a fluent wait
				1.FluentWait wait = new FluentWait(driver);
				//Specify the timout of the wait
				2.wait.withTimeout(5000, TimeUnit.MILLISECONDS);
				//Sepcify polling time
				3.wait.pollingEvery(250, TimeUnit.MILLISECONDS);
				//Specify what exceptions to ignore
				wait.ignoring(NoSuchElementException.class)

				//This is how we specify the condition to wait on.
				//This is what we will explore more in this chapter
				wait.until(ExpectedConditions.alertIsPresent());
				
				
			*/
	
	

	WebDriver odriver;
	@BeforeMethod
	void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
		
		//2.Enter the URl
		odriver.get("https://www.amazon.com");
		
		Wait<WebDriver> owait=new FluentWait<WebDriver>(odriver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
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
	

	@AfterMethod
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	

}
