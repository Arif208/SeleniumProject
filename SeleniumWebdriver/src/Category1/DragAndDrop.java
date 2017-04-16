package Category1;

import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebElement element;
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// element3 = driver.findElement(By.linkText("Droppable"));
		WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		//action.moveToElement(element3).click().perform();
		action.dragAndDrop(element1, element2).build().perform();
	}

}
