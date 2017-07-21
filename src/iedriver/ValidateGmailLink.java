package iedriver;

import org.openqa.selenium.By;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ValidateGmailLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		System.out.println("IE browser opened ");
		driver.get("http://google.in");
		System.out.println("Navigated to Google search engine ");
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle().equals("Gmail"));
		

	}

}
