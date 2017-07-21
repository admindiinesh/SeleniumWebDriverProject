import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreatingOurOwnXpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		
		//System.out.println(driver.findElement(By.className("tagline")).getText());	
		
		System.out.println(driver.findElement(By.xpath("//p[@class='tagline']")).getText());
		
		driver.close();	
		
		

	}

}
