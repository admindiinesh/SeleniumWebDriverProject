
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ImplecitWaitTest {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://hotstar.com");
	}
	
	@Test
	public void impleciteTest()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/traybuilder-directive/masthead-directive/div/div/div/ng-include/div[2]/div/div/div/article[3]/img")).click();
		
	}

}
