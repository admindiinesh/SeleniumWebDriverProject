import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomeMercuryTours {
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement sign_in;
	
	public void loginFlight(String un,String pwd)
	{
		userName.sendKeys(un);
		password.sendKeys(pwd);
		sign_in.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement registerHere;
	
	public void register()
	{
		registerHere.click();
	}

}
