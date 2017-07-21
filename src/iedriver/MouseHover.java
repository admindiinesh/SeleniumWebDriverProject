package iedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {

	InternetExplorerDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		
		driver=new InternetExplorerDriver();
		
		driver.get("http://yssofindia.org");
		
	}
	
	@Test
	public void mousehoverTest()
	{
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a")))
		.build().perform();
		
		driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a")).click();		
		
	}
}
