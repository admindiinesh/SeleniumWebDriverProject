package iedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class CharCaptcha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://harvard.edu/feedback");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id='edit-submitted-name' and @class='form-text required']")).sendKeys("Dinesh kumar Cherukumalli");
		
		driver.findElement(By.xpath("//input[@id='edit-submitted-email' and @class='form-text required' and @type='text']")).sendKeys("son_dinesh79@gmail.com");
		
		List<WebElement> myCommentAbout=driver.findElements(By.id("edit-submitted-my-comment-is-about"));
		
		/*for(int i=0;i<myCommentAbout.size();i++)
		{
			
			System.out.println(myCommentAbout.get(i).getText());
		}
		*/
		myCommentAbout.get(myCommentAbout.size()-1).click();
		
		driver.findElement(By.xpath("//textarea[@id='edit-submitted-comment']")).sendKeys("I can automate ur captcha , so please change ur captcha to image based");
		
		String captcha=driver.findElement(By.xpath("//span[@class='field-prefix']")).getText();
		
		System.out.println(captcha);
		
		String[] capArgs=captcha.split(" ");
		
		int x=Integer.parseInt(capArgs[0]);
		
		int y=Integer.parseInt(capArgs[2]);
		
		int z=x+y;
		
		String result=Integer.toString(z);
		
		System.out.println(result);
		
		driver.findElement(By.xpath("//input[@id='edit-captcha-response']")).sendKeys(result);
		
		driver.findElement(By.name("op")).click();
		
		driver.close();
		

	}

}
