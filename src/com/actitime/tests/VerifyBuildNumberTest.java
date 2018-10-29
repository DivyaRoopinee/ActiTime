package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class VerifyBuildNumberTest extends BaseTest
{
	@Test(priority=4)
	public void testVerifyBuildNumber() throws InterruptedException
	{
		String user = ExcelData.getData(file_path, "TC01", 1,0);
		String pass = ExcelData.getData(file_path, "TC01", 1,1);
		String loginTitle = ExcelData.getData(file_path, "TC01", 1,2);
		String enterTimeTrackTitle = ExcelData.getData(file_path, "TC01", 1,3);
		String aBuildNumber = ExcelData.getData(file_path, "TC04", 1, 0);
		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		
		//verify login Page
		lp.verifyPage(loginTitle);

		//enter valid user name
		Reporter.log("valid user name is :"+user,true);
		lp.enterUserName(user);
				
		//enter the valid password
		Reporter.log("valid password is :"+pass,true);
		lp.enterPassword(pass);
				
		//click on login
		lp.clickOnLogin();
		Thread.sleep(3000);
		//verify enter time track page
		lp.verifyPage(enterTimeTrackTitle);
		
		//click on Help
		ep.clickOnHelp();
		
		//click on about your actitime
		ep.clickOnAboutYourActiTime();
		
		//verify build number
		String eBuildNumber = ep.verifyBuildNumber();
		Reporter.log("Expected Build number:"+eBuildNumber,true);
		Reporter.log("Actual Build number"+aBuildNumber,true);
		Assert.assertEquals(aBuildNumber, eBuildNumber);
		Reporter.log("Build number is matching...........",true);
	}

}
