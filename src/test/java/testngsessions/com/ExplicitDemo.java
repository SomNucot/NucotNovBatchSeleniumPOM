package testngsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitDemo {
	
	
	//syntax--->explicit wait
	
		/*	
			WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='RESULT_TextField-2']")));
					
		*/		
			
			
		/*	In order to declare explicit wait, one has to use ExpectedConditions. The following Expected Conditions can be used in Explicit Wait.

			alertIsPresent()
			elementSelectionStateToBe()
			elementToBeClickable()
			elementToBeSelected()
			frameToBeAvaliableAndSwitchToIt()
			invisibilityOfTheElementLocated()
			invisibilityOfElementWithText()
			presenceOfAllElementsLocatedBy()
			presenceOfElementLocated()
			textToBePresentInElement()
			textToBePresentInElementLocated()
			textToBePresentInElementValue()
			titleIs()
			titleContains()
			visibilityOf()
			visibilityOfAllElements()
			visibilityOfAllElementsLocatedBy()
			visibilityOfElementLocated()
			
			
			*/
	
	

	WebDriver odriver;
	@BeforeMethod
	void launchBrowser() throws InterruptedException
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.amazon.com");
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Continue shopping']")));
		
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
