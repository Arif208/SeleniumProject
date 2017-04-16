package Category1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingTableData {
	public static void main(String[] args) {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		/*List<WebElement> elements = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//a[@title='Prev']//ancestor::div[1]/following::table[2]//tr"));
		int leng = elements.size();
		for(int i = 1; i<leng ; i++)
		{
			System.out.println(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//a[@title='Prev']//ancestor::div[1]/following::table[2]//tr//td["+ i +"]//a")).getText());
		}*/
		
		
		// Always remember while printing the values of table thetd values are either present in span or with link attribute
		List<WebElement> element  = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//a[@title='Prev']//ancestor::div[1]/following::table[2]//td//a"));
		for(WebElement elements : element)
		{
			System.out.println(elements.getText());
		}
	}
	

}
