package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		Thread.sleep(3000);
		odriver.findElement(By.name("fname")).sendKeys("Modi");
		Thread.sleep(5000);
		odriver.findElement(By.name("To Hide")).sendKeys("PM");
		Thread.sleep(3000);
		odriver.findElement(By.name("Hidden")).sendKeys("1234566789");
		Thread.sleep(3000);
		odriver.findElement(By.name("vehicle")).click();
		Thread.sleep(3000);
		odriver.quit();
		
	}

}
