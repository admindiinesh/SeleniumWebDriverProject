import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileInputStream fin=new FileInputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\DummyWorkbook.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//Adding data to existing cell
		
		Row r=ws.getRow(0);
		
		Cell c=r.getCell(2);
		
		c.setCellValue("Ramella Neelaveni Kirankumar");
		
		//Creating a new cell in existing row
		
		try{
			r=ws.getRow(2);
		}
		catch(Exception e){
			r=ws.createRow(2);
			c=r.createCell(0);
			c.setCellValue("Cherukumalli's family");
			c=r.createCell(1);
			c.setCellValue("Paladugu's Family");
		}
		
		
		
		//Create a new row and cell date
		
		r=ws.createRow(5);
		
		c=r.createCell(0);
		c.setCellValue("Welcomes u from DineshVineesha");
		
		// Saving the file
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\asus\\Desktop\\eclipse\\DummyXls\\DummyWorkbook.xlsx");
		wb.write(fout);

	}

}
