import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ExplicitTest {
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://hotstar.com");
	}
	
	@Test
	public void explicitWaitTest()
	{
		WebDriverWait explicitWaitObject=new WebDriverWait(driver,60);
		
		explicitWaitObject.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[2]/div/traybuilder-directive/masthead-directive/div/div/div/ng-include/div[2]/div/div/div/article[1]/img")));
		
		explicitWaitObject.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[2]/div/traybuilder-directive/masthead-directive/div/div/div/ng-include/div[2]/div/div/div/article[4]/img"))).click();
	}
	

}
