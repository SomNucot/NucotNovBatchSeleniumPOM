package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorDemo3 {

	public static void main(String[] args) throws InterruptedException {
		//tagname[class='value']
		//.class_value
				
		WebDriver odriver=new ChromeDriver();
				odriver.manage().deleteAllCookies();
				odriver.manage().window().maximize();
				odriver.get("https://www.saucedemo.com/");
				Thread.sleep(3000);
				odriver.findElement(By.cssSelector("input[class='input_error form_input']")).sendKeys("standard_user");
				Thread.sleep(5000);
				odriver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
				Thread.sleep(3000);
				odriver.findElement(By.cssSelector("input[id='login-button']")).click();
				Thread.sleep(3000);
				
				odriver.quit();


	}

}
