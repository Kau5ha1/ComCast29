package com.crm.ComCast.contactTest;

import org.testng.annotations.Test;

import com.crm.genericlibrary.BaseClass;

public class CreateContactTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createContactTest()
	{
		System.out.println("this is create contact test");
	}
	
	@Test(groups = "regressionTest")
	public void createContactWithOrgTest()
	{
		System.out.println("this is create contact with org ");
		System.out.println("modifued by user1 of workspace====");
		
	}
	@Test(groups = "regressionTest")
	public void createContactWithRegionTest()
	{
		System.out.println("this is create contact with region");
	}
}
