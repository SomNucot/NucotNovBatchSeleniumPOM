package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthDemo5 {

	public static void main(String[] args) throws InterruptedException {
		//syntax for xpath
				//-->5-->//tagName[@id='value' and contains(@attribute,'value')]
				
				
				WebDriver odriver=new ChromeDriver();
				odriver.manage().deleteAllCookies();
				odriver.manage().window().maximize();
				odriver.get("https://www.saucedemo.com/");
				Thread.sleep(3000);
				odriver.findElement(By.xpath("//input[@id='user-name' and contains(@id,'user-name')]")).sendKeys("standard_user");
				Thread.sleep(5000);
				odriver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
				Thread.sleep(3000);
				odriver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
				Thread.sleep(3000);
				
				
				odriver.quit();
				

	}

}
