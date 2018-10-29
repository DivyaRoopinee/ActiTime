package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

import junit.framework.Assert;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority=3)
	public void testVersion()
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String expectedVersion=ExcelData.getData(file_path, "TC03", 1, 0);
		LoginPage lp=new LoginPage(driver);
		//verify login page
		lp.verifyPage(loginTitle);
		//verify version
		String actualVersion=lp.verifyVersion();
		Reporter.log("Expected version:"+expectedVersion,true);
		Reporter.log("Actual version:"+actualVersion,true);
		Assert.assertEquals(expectedVersion, actualVersion);
		Reporter.log("Version is matching",true);	
			
	}
}
