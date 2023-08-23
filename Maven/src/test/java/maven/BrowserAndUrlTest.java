package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAndUrlTest
{
	@Test
	public void BrowserAndUrl()
	{
	System.out.println("afeefa");
	/*	String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		WebDriver driver;
		if (BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			driver= new EdgeDriver();
		}
		driver.get(URL);*/
		
	}

}
