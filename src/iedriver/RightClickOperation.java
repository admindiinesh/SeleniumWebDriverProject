package iedriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickOperation {
	
	//InternetExplorerDriver driver;
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		
		//driver=new InternetExplorerDriver();
		driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		
	}
	
	@Test
	public void rightClickTest()
	{
		
		Actions action=new Actions(driver);
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		/*action.contextClick(gmail)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.click().build().perform();*/
		
		action.contextClick(gmail).sendKeys("W").build().perform();
	}

}
