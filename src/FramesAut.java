import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FramesAut {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://angelfire.com/super/badwebs");
	}
	
	@Test
	public void frmeAutomation()
	{
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		System.out.println(frames.size());
		
		for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			
			try{
				driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
				
				Set<String> windowIds=driver.getWindowHandles();
				
				Iterator<String> it=windowIds.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					try{
						driver.findElement(By.xpath("html/body/center/p/a[4]")).click();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
				driver.switchTo().defaultContent();
				
			}
		}
		
	}

}
