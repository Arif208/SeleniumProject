package Category1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver =null;
		WebElement element = null;
		driver = new FirefoxDriver();
		driver.get("http://www.srsbooking.com/");
		driver.findElement(By.xpath("//img[@title='click to close']")).click();
		driver.findElement(By.xpath("//input[@id='searchbus_depart']")).click();
		System.out.println("Enter the input date");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List <WebElement> rows = driver.findElements(By.xpath("(//div[@id='ui-datepicker-div']//table//tbody)[1]//tr//td"));
		int row = rows.size();
		for(int i = 0;i<row;i++)
		{
			String k = ""+i;
			String xpath = "//div[@id='ui-datepicker-div']//table//tbody)[1]//tr//td[" +k+ "]";
			String colval = driver.findElement(By.xpath("xpath")).getText();
			if(colval.equalsIgnoreCase(input))
			{
				driver.findElement(By.xpath("xpath")).isEnabled();
				driver.findElement(By.xpath("xpath")).click();
			}
			}
	}
}
