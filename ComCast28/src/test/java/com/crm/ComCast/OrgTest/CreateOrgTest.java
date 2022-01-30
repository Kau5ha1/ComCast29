package com.crm.ComCast.OrgTest;

import org.testng.annotations.Test;

import com.crm.genericlibrary.BaseClass;

public class CreateOrgTest extends BaseClass{

	@Test(groups = "smokeTest")
	public void createOrgTest()
	{
		System.out.println("this is create org test");
	}
	
	@Test(groups = "regressionTest")
	public void createOrgWithIndustryTest()
	{
		System.out.println("this is create org with industry type");
		
	}
	@Test(groups = "regressionTest")
	public void createOrgWithRegionTest()
	{
		System.out.println("this is create org with region");
	}
}
