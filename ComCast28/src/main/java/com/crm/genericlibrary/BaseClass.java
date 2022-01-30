package com.crm.genericlibrary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;

public class BaseClass {

	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void configBs()
	{
		System.out.println("=====connect to DB=========");
	}

@Parameter
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void configBc()
	{
		System.out.println("open browser========");
	}


	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void configBm() throws Throwable
	{
		//read common data
		System.out.println("login to the application");
	}

	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void configAm()
	{
		System.out.println("=====logout to the application=====");
	}
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void configAc()
	{
		System.out.println("======close the browser====");
		
	}
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void configAs()
	{
		System.out.println("======close DB conn=======");
	}
}
