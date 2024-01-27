package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
	//LinkText
	
			WebDriverManager.chromedriver().setup();
			
			WebDriver odriver=new ChromeDriver();
			
			odriver.manage().deleteAllCookies();
			
			odriver.manage().window().maximize();
			
			odriver.get("https://app.hubspot.com/login");
			
			Thread.sleep(3000);
			
	
			
			odriver.findElement(By.className("login-email")).sendKeys("Admin");
			odriver.findElement(By.className("login-password")).sendKeys("admin123");
			odriver.findElement(By.linkText("Forgot my password")).click();
		
			
			Thread.sleep(3000);
			
			odriver.quit();
			
		
		
		
		
		
		

	}

}
