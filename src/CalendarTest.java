import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CalendarTest {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
		driver.get("http://cleartrip.com");
	}
	
	@Test
	public void captureCalendar()
	{
		driver.findElement(By.xpath("//*[@id='OneWay']")).click();
		
		driver.findElement(By.xpath("//*[@id='FromTag']")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		
		driver.findElement(By.xpath("//*[@id='ToTag']")).sendKeys("Kuala Lumpur, MY - Kuala Lumpur (KUL)");
		
		driver.findElement(By.id("DepartDate")).click();
		
		String doj="18-09-2018";
		String[] a=doj.split("-");
		
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		String month=months[Integer.parseInt(a[1])-1];
		
		String day=a[0];
		
		String year=a[2];
		
		String calYear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		
		while(!calYear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			calYear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
						
		}
		
		String calMonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		
		while(!calMonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			calMonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		}
		
		WebElement dateTable=driver.findElement(By.className("calendar"));
		
		List<WebElement> rows=dateTable.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
		
		driver.findElement(By.id("SearchBtn")).click();
		
		
	}

}
