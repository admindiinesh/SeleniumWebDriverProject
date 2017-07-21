import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BookHotels {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
	}
	
	@Test
	public void bookHotelTest()
	{
		try
		{
		
		driver.findElement(By.xpath("//*[@id='Home']/div/aside[1]/nav/ul[1]/li[2]/a[1]")).click();
		
		Sleeper.sleepTightInSeconds(7);
		
		driver.findElement(By.xpath("//*[@id='Tags']")).sendKeys("Gandhi Nagar, Vijayawada");
		
		String checkIn="17-09-2017";
		
		String[] a=checkIn.split("-");
		
		String checkInDay=a[0];
		
		String[] checkinMonths={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String checkInMonth=checkinMonths[Integer.parseInt(a[1])-1];
		
		String checkInYear=a[2];
		
		driver.findElement(By.xpath("//*[@id='SearchForm']/section[2]/div[1]/dl/dd/div/i")).click();
		
		String year1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		
		while(!checkInYear.equals(year1))
		{
			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			year1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		}
		
		String month1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		
		while(!checkInMonth.equals(month1))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			month1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			
		}
		
		WebElement table1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		
		List<WebElement> rows1=table1.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows1.size();i++)
		{
			List<WebElement> cols1=rows1.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols1.size();j++)
			{
				if(cols1.get(j).getText().equals(checkInDay))
				{
					cols1.get(j).click();
					
					break;
				}
			}
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		//Sleeper.sleepTightInSeconds(5);
		
		String checkOut="19-09-2017";
		
		String[] b=checkOut.split("-");
		
		String checkOutDay=b[0];
		
		String[] checkoutMonths={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String checkOutMonth=checkoutMonths[Integer.parseInt(b[1])-1];
		
		String checkOutYear=b[2];
		
		driver.findElement(By.xpath("//*[@id='SearchForm']/section[2]/div[2]/dl/dd/div/i")).click();
		
		String year2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		
		while(!checkOutYear.equals(year2))
		{
			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			year2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		}
		
		String month2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		
		while(!checkOutMonth.equals(month2))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			
			month2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			
		}
		
		WebElement table2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		
		List<WebElement> rows2=table2.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows2.size();i++)
		{
			List<WebElement> cols2=rows2.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols2.size();j++)
			{
				if(cols2.get(j).getText().equals(checkOutDay))
				{
					cols2.get(j).click();
					
					break;
				}
			}
		}
		driver.findElement(By.xpath("//*[@id='SearchHotelsButton']")).click();
	}
	
	/*@AfterTest
	public void closeDriver()
	{
		driver.close();
	}*/
	
	

}
