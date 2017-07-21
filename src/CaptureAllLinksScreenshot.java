import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class CaptureAllLinksScreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement w=links.get(i);
			String s=w.getText();
			if(w.isDisplayed())
			{
				
				System.out.println(i+" "+w.getText());
				
				w.click();
				Sleeper.sleepTightInSeconds(3);
				File screenFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenFile,new File("C:\\Users\\asus\\Desktop\\eclipse\\ScreenShots\\"+s+".jpg"));
				System.out.println("Screen captured");
				driver.navigate().back();
				//Sleeper.sleepTightInSeconds(3);
				
			}
			else
			{
				System.out.println(i);
			}
			links=driver.findElements(By.tagName("a"));
			
			
		}
		driver.close();
	}

}
