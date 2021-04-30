package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	ChromeDriver driver;
	Properties pr;
	public Logout (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void Signout() throws InterruptedException
	{
		WebElement Slogo=driver.findElement(By.xpath(pr.getProperty("Slogo")));
		Slogo.click();
		Thread.sleep(5000);
		
		driver.findElements(By.xpath(pr.getProperty("Logout"))).get(4).click();;
		Thread.sleep(12000);
		
		
	}

}
		