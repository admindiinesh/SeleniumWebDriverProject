import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FluentWaitTest {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
	}
	
	@Test
	public void fluentTest()
	{
		Sleeper.sleepTightInSeconds(10);
		FluentWait<WebDriver> fluentWaitObject=new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		fluentWaitObject.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[2]/div/traybuilder-directive/masthead-directive/div/div/div/ng-include/div[2]/div/div/div/article[1]/img")));
		fluentWaitObject.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[2]/div/traybuilder-directive/masthead-directive/div/div/div/ng-include/div[2]/div/div/div/article[4]/img"))).click();
		
	}

}
