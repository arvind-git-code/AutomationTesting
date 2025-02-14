package com.test;



	
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	
	
	
	public class TestNGAnnotationsHierarchy {
	@Test
	public void testCase1() {
	   System.out.println("This is Test Case 1");
	}
	@Test
	public void testCase2() {
	   System.out.println("This is Test Case 2");
	}
	@BeforeMethod
	public void beforeMethod() {
	   System.out.println(" BeforeMethod- will execute before every Test Method");
	}
	@AfterMethod
	public void afterMethod() {
	   System.out.println("AfterMethod- will execute after every Test Method");
	}
	@BeforeClass
	public void beforeClass() {
	   System.out.println("BeforeClass-  will execute before the Class");
	}
	@AfterClass
	public void afterClass() {
	   System.out.println("AfterClass - will execute after the Class");
	}
	@BeforeTest
	public void beforeTest() {
	   System.out.println("AfterClass-  will execute before the First Test");
	}
	@AfterTest
	public void afterTest() {
	   System.out.println("AfterTest-  will execute after the Last Test");
	}
	@BeforeSuite
	public void beforeSuite() {
	   System.out.println("BeforeSuite-  will execute before the Test Suite");
	}
	@AfterSuite
	public void afterSuite() {
	   System.out.println("AfterSuite - will execute after the Test Suite");
	}
	}

