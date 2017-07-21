package iedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CaptureHeaderLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://news.google.co.in/");
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		
		for(int i=0;i<headerLinks.size();i++)
		{
			System.out.println(headerLinks.get(i).getText());
		}
		
		driver.close();
		
	}

}
