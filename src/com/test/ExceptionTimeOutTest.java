package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=1)
	public void infiniteLoop()
	{
		
		int i=1;
		int count=0;
				while(i==1)
				{
					System.out.println(i);
					count=count+1;
					
					System.out.println(count);
				}
	}
	
	//to handle exception without using try and catch block we use expectedExceptions option - here the test will not fail although it has exception
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x ="100A";
		Integer.parseInt(x);
	}

	@Test()
	public void test2()
	{
		String x ="100A";
		Integer.parseInt(x);
	}
	
	
	
}
// timeout - The maximum number of milliseconds this test should take. If it hasn't returned after thistime, it will be marked as a FAIL.
