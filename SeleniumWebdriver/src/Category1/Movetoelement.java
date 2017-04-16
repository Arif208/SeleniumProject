package Category1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = null;
		 WebElement element;
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		 Actions ac = new Actions(driver);
		 ac.moveToElement(element).click().build().perform();
		 driver.findElement(By.xpath("//a[@title='Lenovo']")).click();
		 driver.quit();
		 
	}

}
