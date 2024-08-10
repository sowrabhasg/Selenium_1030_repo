package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mahidraTest 
{
	@Test(groups = "system")
			public void launch()
			{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				driver.get("https://auto.mahindra.com/");
				Reporter.log("tatamotors launched successfully");
			}
	}


