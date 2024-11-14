package com.test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
//	@BeforeMethod   //before every test method
	@BeforeClass	//run once in a class 
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.com");
		 
	}
	
		@Test(priority=1)
		public void getTitle()
		{
			String Title=driver.getTitle();
			System.out.println(Title);
			Assert.assertEquals(Title, "Google");
			
			
		}
		
		@Test(priority=2)
		public void SearchTest() throws InterruptedException
		{
			driver.findElement(By.name("q")).sendKeys("Arvind");
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(Duration.ofSeconds(5));
			String Title= driver.getTitle();
			String address=driver.findElement(By.xpath("//cite[text()='https://www.arvind.com']")).getText();
			
			Assert.assertEquals(Title,"Arvind - Google Search");
			Assert.assertEquals(address, "https://www.arvind.com");
			
		}
		
//		@AfterMethod				// after every test method
		@AfterClass					//run after complete all test cases in a class 
		public void tearDown()
		{
		driver.quit();
		}
		
		
	}


