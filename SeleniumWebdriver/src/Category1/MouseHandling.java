package Category1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver;
	WebElement element;
	driver = new FirefoxDriver();
	driver.get("http://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	element = driver.findElement(By.linkText("Testing"));
	Actions action = new Actions(driver);
	action.moveToElement(element).click().perform();
	WebElement element1 = driver.findElement(By.linkText("Manual Testing"));
	action.moveToElement(element1);
	action.click().perform();
	}

}
