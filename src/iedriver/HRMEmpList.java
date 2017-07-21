package iedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMEmpList {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@Test
	public void hrmEmpDetails()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		WebElement table=driver.findElement(By.xpath("//*[@id='resultTable']"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
				System.out.print(cols.get(j).getText());
			}
			System.out.println();
		}
	}
	
	@AfterTest
	public void closeTheDriver()
	
	{
		driver.close();
	}

}
