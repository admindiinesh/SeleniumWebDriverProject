package iedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
	//InternetExplorerDriver ied=new InternetExplorerDriver();
		FirefoxDriver fd=new FirefoxDriver();
	fd.get("http://gmail.com");
	fd.findElement(By.id("Email")).sendKeys("dineshkumarcherukumalli");
	fd.findElement(By.id("next")).click();
	
	}

}
