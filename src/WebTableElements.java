import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebTableElements {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void tableElements() throws IOException
	{
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\TableElements.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0;i<rows.size();i++)
		{
			r=ws.createRow(i);
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
				r.createCell(j).setCellValue(cols.get(j).getText());
			}
			//System.out.println();			
			
		}
		FileOutputStream save=new FileOutputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\TableElements.xlsx");
		
		wb.write(save);
	}
	
}
