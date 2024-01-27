package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	//By.xpath-->its not attribute but its the address of the webelement in the DOM
	
			//two types of xpath namely
			//1.Absolute xpath-->/
			//exmple-->/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/input[1]
			//2.Relative xpath-->//
	
	
	
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
		odriver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		
		
		odriver.quit();
		
		
		
		
		

	}

}
