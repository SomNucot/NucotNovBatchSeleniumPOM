package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
				/*
					ID.
					Name.
					ClassName.
					LinkText.
					Partial LinkText.
					TagName.
					CssSelector.
					XPath.
					Partial LinkText.
					Types of XPath in Selenium
	Absolute XPath: Begins from the root of the HTML document and
 					specifies the complete path to the element.
 					It's not as flexible and can break if the page structure changes.
Relative XPath: Starts from a specific element and 
				navigates through the DOM hierarchy to locate the desired element.
					*/
	
	
public static void main(String[] args) throws InterruptedException {
		
		//To open the browser

		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
		//locate the webelement + actions
		odriver.findElement(By.id("username")).sendKeys("nucot@gmail.com");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.id("password")).sendKeys("nucot@12345!");
		

		Thread.sleep(3000);
		
		
		
		
		odriver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
