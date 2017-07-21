package phantombrowsertesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTesting {
	PhantomJSDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("phantomjs.binary.path","C:\\Users\\asus\\Desktop\\eclipse\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver=new PhantomJSDriver();
		driver.get("http://timeanddate.com/worldclock/");
	}
	
	@Test
	public void capturingTableElements()
	{
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				System.out.println(cols.get(j).getText()+"   ");
				
			}
			System.out.println();
		}
		
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}

}
