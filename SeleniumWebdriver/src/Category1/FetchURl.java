package Category1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchURl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8");
		String content = driver.getPageSource();
		System.out.println(content);
		File fl = new File("D:\\newfile.html");
		FileWriter wr = new FileWriter(fl);
		wr.write(content);
		
		//String Url[] = currUrl.split("/");
		/*StringTokenizer Url =  new StringTokenizer(currUrl, "/?&");
		while(Url.hasMoreTokens())
		{
			System.out.println(Url.nextToken());
		//if(Url.nextToken().contains("sourceid"))
			//System.out.println(Url.nextToken());
		}*/
		driver.close();
	}

}
