

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		System.out.println("Browser opened");
		driver.get("http://google.co.in");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{	
				count++;
				System.out.println(links.get(i).getText());
			
			//links.get(i).click();
			}
		}
		System.out.println("Visible links : "+count);
		System.out.println("Invisible links : "+(links.size()-count));
		driver.close();
		

	}

}
