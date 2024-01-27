package seleniumsessions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		
		//To open the browser

		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		odriver.quit();
		
		
		
		
		
	}

}
