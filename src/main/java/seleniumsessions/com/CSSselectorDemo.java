package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		odriver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		Thread.sleep(5000);
		odriver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		odriver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(3000);
		
		odriver.quit();
	}
		

	}


