package chromedriver;

//import org.apache.jasper.compiler.Node.SetProperty;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\eclipse\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//driver.get("http://google.com");

	}

}
