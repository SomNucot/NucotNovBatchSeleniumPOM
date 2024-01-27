package seleniumsessions.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		List<WebElement> olist=odriver.findElements(By.tagName("a"));
		System.out.println(olist);
		for(WebElement oolist:olist)
		{
			System.out.println(oolist.getText());
			
			
		}
		
		
		
		
		
		
		odriver.quit();


	}

}
