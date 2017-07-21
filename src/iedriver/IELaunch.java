package iedriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("http://google.com");

	}

}
