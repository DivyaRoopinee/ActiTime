package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.FbLoginPage;
import com.actitime.pages.LoginPage;

public class FbValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testFbValidLoginLogout() throws InterruptedException
	{
		String email = ExcelData.getData(file_path, "TC06", 1, 0);
		String pass = ExcelData.getData(file_path, "TC06", 1, 1);
		String fbloginTitle = ExcelData.getData(file_path, "TC06", 1, 2);
				
		FbLoginPage fp=new FbLoginPage(driver);
		
		
		//verify login page
		fp.verifyPage(fbloginTitle);
		//enter valid username
		Reporter.log("Valid emailid is :"+email,true);
		fp.enterEmail(email);
		//enter valid password
		Reporter.log("Valid password is :"+pass,true);
		fp.enterPass(pass);
		//click on Login
		fp.clickLogin();
		Thread.sleep(3000);
		//click on logout
		fp.clickLogoutDropDown();
		fp.clickLogout();
		//verify login page
		fp.verifyPage(fbloginTitle);
		
}
}
