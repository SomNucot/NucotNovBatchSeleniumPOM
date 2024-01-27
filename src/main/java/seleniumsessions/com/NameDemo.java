package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		Thread.sleep(3000);
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-1")).sendKeys("Modi");
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-2")).sendKeys("PM");
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-3")).sendKeys("1234566789");
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-5")).sendKeys("Bangalore");
		Thread.sleep(3000);
		odriver.findElement(By.name("RESULT_TextField-6")).sendKeys("nucot@gmail.com");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
