package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TaskListPage;

public class ImportTasksFromCsvTest extends BaseTest
{
	@Test(priority=6)
	public void testImportTasksFromCsv() throws InterruptedException
	{
		String user = ExcelData.getData(file_path, "TC01", 1, 0);
		String pass = ExcelData.getData(file_path, "TC01", 1, 1);
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String taskListTitle = ExcelData.getData(file_path, "TC05", 1, 0);
		
		LoginPage lp=new LoginPage(driver);
		TaskListPage tp=new TaskListPage(driver);
		
		//verify login page
		lp.verifyPage(loginTitle);
		//enter valid username
		Reporter.log("Valid username is :"+user,true);
		lp.enterUserName(user);
		//enter valid password
		Reporter.log("Valid password is :"+pass,true);
		lp.enterPassword(pass);
		//click on Login
		lp.clickOnLogin();
		Thread.sleep(3000);
		//click on Tasks tab
		lp.clickOnTasks();
		Thread.sleep(3000);
		//verify task list page
		tp.verifyPage(taskListTitle);
		//Add new task
		tp.clickOnAddNewTask();
		//import from csv
		tp.clickOnImport();
		//click on logout
		tp.clickOnLogout();
	}
}
