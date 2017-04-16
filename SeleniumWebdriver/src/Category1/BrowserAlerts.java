package Category1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver = null;
	 WebElement element;
	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
	 String message = alert.getText();
	 if(message.contains("confirm"))
		 alert.accept();
	 else
		 alert.dismiss();
	 driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
	 alert.sendKeys("yes");
	 alert.accept();
	}

}
