import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DependantDropdownCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://goair.in");
		
		WebElement dropFrom=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		WebElement dropTo=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropDownFrom=dropFrom.findElements(By.tagName("option"));
		
		for(int i=0;i<dropDownFrom.size();i++)
			{
				dropDownFrom.get(i).click();
				System.out.println(dropDownFrom.get(i).getText());
				List<WebElement> dropDownTo=dropTo.findElements(By.tagName("option"));
				if(dropDownFrom.get(i).isSelected())
				{
					System.out.println("Drop to List : " );
								
					for(int j=0;j<dropDownTo.size();j++)
					{
						System.out.println(dropDownTo.get(j).getText());
				
					}
					i++;
				}	
					dropDownFrom=dropFrom.findElements(By.tagName("option"));
			
			
			}
		driver.close();
		

	}

}
