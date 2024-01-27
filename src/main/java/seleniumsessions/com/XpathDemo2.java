package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//syntax for xpath
		//-->1-->//tagName[@attribute='value']
		//input[@name='username']
		//*[@name='username']
		//input[@placeholder ='Username']

	WebDriver odriver=new ChromeDriver();
	odriver.manage().deleteAllCookies();
	odriver.manage().window().maximize();
	odriver.get("https://www.saucedemo.com/");
	Thread.sleep(3000);
	odriver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
	Thread.sleep(5000);
	odriver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
	Thread.sleep(3000);
	odriver.findElement(By.xpath("//input[@name='login-button']")).click();
	Thread.sleep(3000);
	odriver.quit();


	}

}
