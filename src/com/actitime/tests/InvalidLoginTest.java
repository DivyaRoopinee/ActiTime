package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String expectedErrorMessage = ExcelData.getData(file_path, "TC02", 1, 2);
		
		LoginPage lp=new LoginPage(driver);
				
		//verify login page
		lp.verifyPage(loginTitle);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i=1;i<=rc;i++)
		{
			String user = ExcelData.getData(file_path, "TC02", i, 0);
			String pass = ExcelData.getData(file_path, "TC02", i, 1);
			
		
		//enter invalid username
		Reporter.log("InValid username is :"+user,true);
		lp.enterUserName(user);
		//enter valid password
		Reporter.log("Valid password is :"+pass,true);
		lp.enterPassword(pass);
		//click on login
		lp.clickOnLogin();
		Thread.sleep(3000);
		}
		//verify error message
		String actualErrorMessage=lp.verifyErrorMessage();
		Reporter.log("Expected error message is"+expectedErrorMessage,true);
		Reporter.log("Actual error message is"+actualErrorMessage,true);
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		Reporter.log("Error message is matching",true);
		Reporter.log("=======================",true);
	}
	
}
	
