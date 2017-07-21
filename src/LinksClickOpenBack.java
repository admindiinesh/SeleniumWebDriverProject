import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinksClickOpenBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		System.out.println("Browser opened");
		driver.get("http://pvrcinemas.com");
		WebElement header=driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[4]"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		    header=driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[4]"));
			links=header.findElements(By.tagName("a"));
			
		}
		driver.close();

	}

}
