package Category1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintEmptyValuesInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 ChromeDriver driver1 = new ChromeDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.srmtransports.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@id,'DepDate')]/following::img")).click();
		List <WebElement> element1 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for(WebElement ele : element1)
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase(" "))
			{
				
			}
		}*/
	}

}
