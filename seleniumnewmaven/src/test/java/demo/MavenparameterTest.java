package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenparameterTest 
{
	@Test
	public void recieveData() 
	{
		String url = System.getProperty("url");
		Reporter.log("url",true);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
}
