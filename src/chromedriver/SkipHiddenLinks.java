package chromedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SkipHiddenLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\eclipse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{	
				
				System.out.println(links.get(i).getText());
				links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				//Sleeper.sleepTightInSeconds(2);
				links=driver.findElements(By.tagName("a"));
			}
		}

	}

}
