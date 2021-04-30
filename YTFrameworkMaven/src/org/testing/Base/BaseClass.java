package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void BrowserOpening() throws IOException
	{
		File f=new File("../YTFramework/object.properties");
		FileInputStream fr=new FileInputStream(f); 
		pr=new Properties();
		pr.load(fr);
		
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	//@AfterMethod
	//public void browserclose()
	//{
	//driver.close();
	//}
	

}
  