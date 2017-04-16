package Category1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebElement element;
		driver = new FirefoxDriver();
		driver.get("http://www.srsbooking.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='searchbus_from_chosen']/descendant::a")).click();
		driver.findElement(By.xpath("//div[@id='searchbus_from_chosen']/descendant::input[@type='text']")).sendKeys("Co");
		List <WebElement> list = driver.findElements(By.xpath("//div[@id='searchbus_from_chosen']/descendant::li"));
		for(WebElement ele : list)
		{
			ele.sendKeys(Keys.DOWN);
			if(driver.findElement(By.xpath("//div[@id='searchbus_from_chosen']/descendant::li[@class='active-result highlighted']")).getText().equalsIgnoreCase("coimbatore"))
			{
				ele.click();
			}
				
		}

	}

}
