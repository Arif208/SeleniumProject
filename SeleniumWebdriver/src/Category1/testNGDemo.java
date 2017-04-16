package Category1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGDemo {
	
	WebDriver driver = null;
	WebElement element;
	@BeforeTest
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void operations() throws AWTException
	{
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select sc = new Select(element);
		List<WebElement> options = sc.getOptions();
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		for(WebElement opt : options)
		{
			String option = opt.getText();
			if(option.equalsIgnoreCase("Switch Commands")||option.equalsIgnoreCase("WebElement Commands"))
			opt.click();
		}
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
