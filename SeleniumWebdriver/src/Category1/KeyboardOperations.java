package Category1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		 WebDriver driver = null;
		 WebElement element;
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 element = driver.findElement(By.id("email"));
		 Actions ac = new Actions(driver).moveToElement(element).click(element);
		 ac.keyDown(Keys.CONTROL).sendKeys("a").perform();
		 Thread.sleep(1000);
		 ac.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		 driver.quit();
		 
	}

}
