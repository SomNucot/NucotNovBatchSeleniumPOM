package testngsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionDemo {
	
	
	/*
	 * 
	 * Mouse Actions
			Mouse actions in Selenium are the actions that can be performed using a mouse, such as clicking, double-clicking, right-clicking, dragging and dropping, etc. These actions simulate a user’s interactions with a website through the mouse.
			
			The Actions class in Selenium WebDriver provides the following mouse action:
			
			1) click(): performs a single mouse click on the specified element.
			
			2) clickAndHold(): holds down the left mouse button on the specified element.
			
			3) contextClick(): performs a right-click on the specified element.
			
			4) doubleClick(): performs a double-click on the specified element.
			
			5) dragAndDrop(): performs a drag and drop operation between two elements.
			
			6) release(): releases the left mouse button on the specified element.
			
			7) moveToElement(): moves the mouse cursor to the middle of the specified element.
			
			Keyboard Actions
			Keyboard actions in Selenium are the actions that can be performed using a keyboard, such as pressing keys, holding down keys, releasing keys, etc. These actions simulate a user’s interactions with a website through the keyboard.
			
			The Actions class in Selenium provides the following keyboard actions:
			
			1) sendKeys(CharSequence… keysToSend): sends a series of key presses to the specified element.
			
			2) keyDown(Keys theKey): holds down the specified key.
			
			3) keyUp( Keys theKey): releases the specified key.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	WebDriver odriver;
	@BeforeTest
	void launchBrowser() throws InterruptedException
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		Thread.sleep(3000);
	}
	
	
	@Test(priority=1)
	void keysConceptDemo()
	{
			
		WebElement ole=odriver.findElement(By.name("q"));
		
		Actions oaction=new Actions(odriver);
		
		oaction.keyDown(ole,Keys.SHIFT).sendKeys("somaautomation").build().perform();
		
		
		
	}
	
	
	
	@AfterTest
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
