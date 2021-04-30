package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.ScreenshotCapture;
import org.testing.Utilities.logsCapture;
import org.testng.annotations.*;

public class TC1 extends BaseClass
{
	
	@Test
	public  void SIGNIN() throws  IOException, InterruptedException 
	
	{
		
		Login login=new Login (driver,pr);
		
		login.SignIn("sank.selenium@gmail.com", "Sank@25.10.1990");
		
		logsCapture.takelogs("TC1", "Log in Succesfully for TC1");
		
		
		
		//WebElement SIGNIN=driver.findElement (By.id("button"));
		//WebElement SIGNIN=driver.findElement (By.className("style-scope ytd-button-renderer style-suggestive size-small"));
		/////WebElement SIGNIN=driver.findElement (By.cssSelector(pr.getProperty("SIGNIN")));
		//WebElement SIGNIN=driver.findElement (By.className("style-scope ytd-button-renderer style-suggestive size-small"));
		/////SIGNIN.click();
		/////Thread.sleep(5000);
		
		//WebElement Email=driver.findElement(By.cssSelector(pr.getProperty("Email")));
		//Email.sendKeys("sank.selenium@gmail.com");
		
		//WebElement Next=driver.findElement(By.cssSelector(pr.getProperty("Next")));
		//Next.click();
		//Thread.sleep(5000);
		
		//WebElement Pass=driver.findElement(By.xpath(pr.getProperty("Pass")));
		//Pass.sendKeys("Sank@25.10.1990");
		
		//WebElement Next2=driver.findElement(By.cssSelector(pr.getProperty("Next2")));
		//Next2.click();
		//Thread.sleep(5000);
		
		List<WebElement> Explore=driver.findElements(By.xpath("//yt-formatted-string[(@class='title style-scope ytd-guide-entry-renderer')]"));
		Explore.get(1).click();
		Thread.sleep(5000);	
		
		List<WebElement> Trending=driver.findElements(By.xpath("//a[(@id='destination-content-root')]"));
		Trending.get(0).click();
		

		//WebElement Slogo=driver.findElement(By.xpath(pr.getProperty("Slogo")));
		//Slogo.click();
		//Thread.sleep(5000);
		
		//List<WebElement> Logout=driver.findElements(By.xpath("//*[(@role='link')]"));
		//Logout.get(4).click();
		//Thread.sleep(12000);
		
		ScreenshotCapture.takescreenshot(driver, "./Screenshot/TC1.png");
		Thread.sleep(5000);
		
		Logout logout=new Logout(driver,pr);
		logout.Signout();
		
		
		
	}
	
	
			
	
}




