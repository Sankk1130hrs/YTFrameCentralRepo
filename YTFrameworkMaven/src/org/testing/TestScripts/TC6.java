package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC6 
{
	ChromeDriver driver;
		@BeforeMethod
		public void BrowserOpening()
		{
			System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void login() throws InterruptedException
		{
			WebElement Signin=driver.findElement(By.cssSelector("*[aria-label='Sign in']"));
			Signin.click();
			Thread.sleep(5000);
			
			WebElement email= driver.findElement(By.id("identifierId"));
			email.sendKeys("sank.selenium@gmail.com");
			
			WebElement button=driver.findElement(By.className("VfPpkd-RLmnJb"));
			button.click();
			Thread.sleep(6000);
			
			WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Sank@25.10.1990");
			
			WebElement button1= driver.findElement(By.className("VfPpkd-RLmnJb"));
			button1.click();
			Thread.sleep(4000);
			
			List<WebElement> videoplay= driver.findElements(By.xpath("//a[@id='video-title-link']"));
			videoplay.get(4).click();
			Thread.sleep(6000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			WebDriverWait w= new WebDriverWait(driver, 6);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ytd-comment-simplebox-renderer"))).click();
			
			WebElement comment= driver.findElement(By.id("contenteditable-root"));
			comment.click();
			comment.sendKeys("Superb");
			
			List<WebElement>signoutimage=driver.findElements(By.xpath("//img[@id='img']"));
			signoutimage.get(0).click();
			Thread.sleep(4000);
			
			List<WebElement>signout=driver.findElements(By.xpath("//*[@role='link']"));
			signout.get(4).click();
			Thread.sleep(4000);	
			
		}
		//@AfterMethod
		//public void BrowserClose()
		//{
		//	driver.close();
		//}
	}