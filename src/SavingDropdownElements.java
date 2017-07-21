import java.io.FileInputStream;
import java.io.IOException;

import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SavingDropdownElements {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver=new FirefoxDriver();
		 
		 driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void elementsIntoExcel() throws IOException
	{
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement drop=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		List<WebElement> dropdownElements=drop.findElements(By.tagName("option"));
		
		System.out.println(dropdownElements.size());
		
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\DropDowns.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0;i<dropdownElements.size();i++)
		{
			r=ws.createRow(i);
			
			r.createCell(0).setCellValue(dropdownElements.get(i).getText());
			
			dropdownElements.get(i).click();
			
			if(dropdownElements.get(i).isSelected())
				r.createCell(1).setCellValue("Passed");
			else
				r.createCell(1).setCellValue("Failed");
		}
		
		FileOutputStream save=new FileOutputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\DropDowns.xlsx");
		
		wb.write(save);
	}

}
