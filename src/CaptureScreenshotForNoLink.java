import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CaptureScreenshotForNoLink {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		
		try{
			driver.findElement(By.linkText("SoftQ")).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			File screenFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenFile,new File("C:\\Users\\asus\\Desktop\\eclipse\\ScreenShots\\ScreenShot.jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			System.out.println("Error Screen captured");
			
		}
		
		driver.close();
	}

}
