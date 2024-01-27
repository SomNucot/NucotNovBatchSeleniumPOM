package testngsessions.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownDemo {
	
	
	/*
	 * 
	 * 				selectByIndex
					selectByValue
					selectByVisibleText
	 * 
	 */
	
	
	WebDriver odriver;
	@BeforeTest
	void launchBrowser()
	{
		odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
	
	
	@Test(priority=1)
	void selectValueFromDropDown() throws InterruptedException
	{
		
		WebElement oele=odriver.findElement(By.xpath("//select[@name='country']"));
			
		Select oselect=new Select(oele);
		//oselect.selectByIndex(106);
		//oselect.selectByValue("INDIA");
		//oselect.selectByVisibleText("ROMANIA");
		
		List<WebElement> olist=oselect.getOptions();
		
		
		
		for(WebElement olist1:olist)
		{
			System.out.println(olist1.getText());
			
		}
		
		
		
		
		
		
			Thread.sleep(8000);
		
	}
	
	/*
	 * 
	 * 			getOptions()
				getFirstSelectedOption()
				getSelectedOptions()
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	@AfterTest
	void appclose()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
