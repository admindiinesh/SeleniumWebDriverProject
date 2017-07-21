import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		System.out.println(driver.findElement(By.id("searchDropdownBox")).getText());
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		driver.findElement(By.className("nav-input")).click();
		

	}

}
