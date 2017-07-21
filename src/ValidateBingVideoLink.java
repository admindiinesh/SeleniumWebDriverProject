import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ValidateBingVideoLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
		
		System.out.println("firefox browser opened ");
		
		driver.get("http://bing.com");
		
		System.out.println("Navigated to bing search engine ");
		
		driver.findElement(By.linkText("Videos")).click();
		
		System.out.println(driver.getCurrentUrl().equals("http://www.bing.com/?scope=video&nr=1"));
	}

}
