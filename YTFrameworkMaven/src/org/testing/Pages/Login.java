package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
		
	}
	public void SignIn (String Username , String Password) throws InterruptedException
	
	{
		WebElement SIGNIN=driver.findElement (By.cssSelector(pr.getProperty("SIGNIN")));
		SIGNIN.click();
		Thread.sleep(5000);
		
		WebElement Email=driver.findElement(By.cssSelector(pr.getProperty("Email")));
		Email.sendKeys("sank.selenium@gmail.com");
		
		WebElement Next=driver.findElement(By.cssSelector(pr.getProperty("Next")));
		Next.click();
		Thread.sleep(5000);
		
		WebElement Pass=driver.findElement(By.xpath(pr.getProperty("Pass")));
		Pass.sendKeys("Sank@25.10.1990");
		
		WebElement Next2=driver.findElement(By.cssSelector(pr.getProperty("Next2")));
		Next2.click();
		Thread.sleep(5000);
		
	}

}
