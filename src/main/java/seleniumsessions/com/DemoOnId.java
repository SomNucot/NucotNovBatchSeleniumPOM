package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver odriver=new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-1")).sendKeys("Modi");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-2")).sendKeys("PM");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-3")).sendKeys("1234566789");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-5")).sendKeys("Bangalore");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-6")).sendKeys("nucot@gmail.com");
		Thread.sleep(3000);
		WebElement radioBtn1 = odriver.findElement(By.id("RESULT_RadioButton-7_0"));
		((JavascriptExecutor) odriver).executeScript("arguments[0].checked = true;", radioBtn1);
		Thread.sleep(3000);
		WebElement checkBtn1 = odriver.findElement(By.id("RESULT_CheckBox-8_0"));
		((JavascriptExecutor) odriver).executeScript("arguments[0].checked = true;", checkBtn1);
		Thread.sleep(3000);
		odriver.quit();

	}

}
