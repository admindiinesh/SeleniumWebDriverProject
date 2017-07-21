package iedriver;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class HaveScreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");
		TakesScreenshot screen=(TakesScreenshot)driver;
		File screenFile=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenFile, new File("C:\\Users\\asus\\Desktop\\eclipse\\CpturedScreen.jpg"));
		driver.close();
	}	

}
