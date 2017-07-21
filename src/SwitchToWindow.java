import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SwitchToWindow {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://bing.com");
	}
	
	@Test
	public void switchWindowTo()
	{
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			
			try{
				
				driver.findElement(By.xpath("//*[@id='navGroupData']/div/div[2]/div/ul/li[8]/a")).click();
			}
			
			catch(Exception e)
			{
				
			}
			//driver.switchTo().defaultContent();
		}
		
	}

}
