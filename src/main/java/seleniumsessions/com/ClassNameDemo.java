package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		odriver.findElement(By.className("form_input")).sendKeys("standard_user");
		Thread.sleep(5000);
		odriver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		odriver.findElement(By.className("btn_action")).click();
		Thread.sleep(3000);
		
		odriver.quit();
	}

}
