package Category1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartLuanch {
	
	

	public static void main(String[] args) {
		
	WebDriver driver;
	WebElement element;
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String title = driver.getTitle();
	if(title.contains("Online Shopping"))
	System.out.println("true");	
	String tg = driver.findElement(By.xpath("//a[contains(text(),'Sell on Flipkart')]")).getTagName();
	System.out.println();
	driver.navigate().back();
	//driver.navigate().forward();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
	if(element!=null)
	driver.findElement(By.name("q")).sendKeys("lenovo");
	element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	if(element!=null)
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.quit();
	
	}	
}
