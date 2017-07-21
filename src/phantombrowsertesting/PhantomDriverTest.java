package phantombrowsertesting;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomDriverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path","C:\\Users\\asus\\Desktop\\eclipse\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		PhantomJSDriver driver=new PhantomJSDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
