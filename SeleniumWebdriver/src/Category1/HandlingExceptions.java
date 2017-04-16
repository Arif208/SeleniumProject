package Category1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		element =  driver.findElement(By.id("email"));
		Select sc = new Select(element);
		sc.selectByIndex(4);
		//driver.switchTo().window("newwindow").close();
		 //WebDriverWait wait = new WebDriverWait(driver, 10);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("statedropdown")));
	}

}
