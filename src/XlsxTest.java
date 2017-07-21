import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XlsxTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] a) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\DummyWorkbook.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		System.out.println("WorkBook");
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		System.out.println("WorkSheet");
		
		int rowCount=ws.getLastRowNum();
		System.out.println("Rows="+rowCount);
		
		
			for(int i=0;i<=rowCount;i++)		
			{
				Row r=ws.getRow(i);
				System.out.println("Row "+i);
				
				try{
				int colCount=r.getLastCellNum();
				System.out.println("Columns in Row "+i+"is "+colCount);
			
				for(int j=0;j<colCount;j++)
				{
					Cell c=r.getCell(j);
					System.out.print(c.getStringCellValue()+"    ");
				}
				System.out.println();
			}
			
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
			}
		
		
		

	}

}
