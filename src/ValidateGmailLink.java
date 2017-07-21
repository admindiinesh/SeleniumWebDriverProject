//package firefoxdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ValidateGmailLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		System.out.println("IE browser opened ");
		
		driver.get("http://google.in");
		
		System.out.println("Navigated to Google search engine ");
		//System.out.println(driver.findElement(By.linkText("Gmail")));
		
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println(driver.getTitle().equals("Gmail"));
		

	}

}
