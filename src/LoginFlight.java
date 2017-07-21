import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginFlight {

	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wmt=PageFactory.initElements(driver, WelcomeMercuryTours.class);
		//wmt.loginFlight("Admin","admin");
		wmt.register();
	}
}
