package com.BaseTest;

import org.testng.annotations.BeforeTest;

import com.DemoWebshop.generic.DriverUtils;



public class BaseTest {
	@BeforeTest
	
	public void setUp( )
	{
		DriverUtils.createDriver();
	}

}
