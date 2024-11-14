package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("Settup system properties");
	
	}
	
	@BeforeTest
	public void launch_browser()
	{
		System.out.println(" Lanching Browser");
	
	}
	
	
	@BeforeClass
	public void login()
	{
		System.out.println("loging to web page");
	}
	
	
	
	
	@BeforeMethod
	public void enter_url()
	{
		System.out.println("Enter the url");
	}
	
	
	@Test(priority=2, groups="basic")
	public void search_keyword()
	{
		System.out.println("perform search");
		
	}
	
	@Test(priority=1,groups="basic")
	public void google_tile_test()
	{
		System.out.println("print the title of url");
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("deleting all cookies");
	}
	
	@AfterClass
	public void close_Browser()
	{
		System.out.println("closing browser");
	}
	
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("printing the report of test");
	}
}
