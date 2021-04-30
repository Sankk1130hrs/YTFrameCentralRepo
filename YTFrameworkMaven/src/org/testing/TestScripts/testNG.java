package org.testing.TestScripts;

import org.testng.annotations.*;


public class testNG 
{
	@BeforeSuite
	public void m1()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void m2()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void m3()
	{
		System.out.println("Before Test");
	}
	@Test
	public void m0()
	{
		System.out.println("Test annotations");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void m5()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void m6()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void m7()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void m8()
	{
		System.out.println("After Method");
	}

}
