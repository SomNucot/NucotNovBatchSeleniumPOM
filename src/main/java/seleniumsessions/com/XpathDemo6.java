package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo6 {

	public static void main(String[] args) throws InterruptedException {
		//syntax for xpath
		//-->6-->//tagName[text()='value']
		
		
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
		String userNamelabel=odriver.findElement(By.xpath("//i18n-string[text()='Email address']")).getText();
		System.out.println(userNamelabel);
		
		odriver.findElement(By.className("login-email")).sendKeys("Admin");
		Thread.sleep(5000);
		
		String userPwdlabel=odriver.findElement(By.xpath("//i18n-string[text()='Password']")).getText();
		System.out.println(userPwdlabel);
		
		odriver.findElement(By.className("login-password")).sendKeys("admin123");
		Thread.sleep(3000);
		odriver.findElement(By.linkText("Forgot my password")).click();
		Thread.sleep(3000);
		
		
		
		
		
		odriver.quit();
		

	}

}
