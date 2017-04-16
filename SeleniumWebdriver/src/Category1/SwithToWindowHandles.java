package Category1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwithToWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebElement element;
		driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf#");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Cab / Bus')]")).click();
		Set <String> windows = driver.getWindowHandles(); //returns iterator
		System.out.println(windows);
		for(String window: windows)
		{
			if(driver.getTitle().equalsIgnoreCase("IRCTC Hotel India"));
			driver.switchTo().window(window);
		}
		

	}

}
