import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DownloadFile {
	
	@Test
	public void downloadTest() throws IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://seleniumhq.org");
		
		driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
		
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\asus\\Desktop\\eclipse\\AutoItScripts\\Download.exe");
	}

}
