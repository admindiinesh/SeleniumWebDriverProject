package iedriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CaptureScreenshotForNoLink {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.linkText("SoftQ"));
		
			if(links.size()==0)
			{
				File screenFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenFile,new File("C:\\Users\\asus\\Desktop\\eclipse\\ScreenShots\\ScreenShot.jpg"));
				System.out.println("Screen captured");
			}
			else
			{
				driver.findElement(By.linkText("SoftQ")).click();				
			}
				
		
		driver.close();
	}

}
