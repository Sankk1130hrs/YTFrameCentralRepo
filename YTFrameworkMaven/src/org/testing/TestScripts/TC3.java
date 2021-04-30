package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC3 
{
	ChromeDriver driver;
	@BeforeMethod
	public void Browseropening()
	{
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Signin() throws InterruptedException
	{
		WebElement Signin=driver.findElement(By.cssSelector("*[aria-label='Sign in']"));
		Signin.click();
		Thread.sleep(5000);
		
		WebElement Email=driver.findElement(By.cssSelector("input[autocomplete='username']"));
		Email.sendKeys("sank.selenium@gmail.com");
		
		WebElement Next=driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']"));
		Next.click();
		Thread.sleep(5000);
		
		WebElement Pass=driver.findElement(By.xpath("//input[(@name='password')]"));
		Pass.sendKeys("Sank@25.10.1990");
		
		WebElement Next2=driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']"));
		Next2.click();
		Thread.sleep(5000);
		
		List<WebElement> Suscription=driver.findElements(By.xpath("//*[(@role='tab')]"));
		Suscription.get(2).click();
		Thread.sleep(5000);
		
		WebElement Slogo=driver.findElement(By.xpath("//img[(@alt='Avatar image')]"));
		Slogo.click();
		Thread.sleep(5000);
		
		List<WebElement> Logout=driver.findElements(By.xpath("//*[(@*='link')]"));
		Logout.get(4).click();
		Thread.sleep(12000);
		
	}
	@AfterMethod
	public void browserclose()
	{
	driver.close();
	}

}

