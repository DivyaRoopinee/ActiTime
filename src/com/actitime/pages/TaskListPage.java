package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class TaskListPage extends BasePage
{
	
	//Declaration
		@FindBy(xpath="//a[.='Logout']")
		private WebElement logoutBTN;
		
		@FindBy(xpath="(//div[@class='img'])[6]")
		private WebElement firstTask;
		
		@FindBy(xpath="//span[.='Delete']")
		private WebElement deleteBTN;
	
		@FindBy(id="deleteTaskPopup_deleteConfirm_cancelBtn")
		private WebElement cancelPopup;
	
		@FindBy(xpath="//div[.='Add New Task']")
		private WebElement addNewTask;
		
		@FindBy(xpath="//div[.='Import tasks from CSV']")
		private WebElement importTaskFromCsv;
		
	
		//Initialization
		public TaskListPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void verifyPage(String eTitle)
		{
			verifyTitle(eTitle);
		}
		
		public void clickOnLogout()
		{
			logoutBTN.click();
		}
		
		public void clickOnFirstTask()
		{
			firstTask.click();
		}

		public void clickOnDelete()
		{
			deleteBTN.click();
		}
		public void clickOnCancel()
		{
			cancelPopup.click();
		}
		public void clickOnAddNewTask()
		{
			addNewTask.click();
		}
		public void clickOnImport()
		{
			importTaskFromCsv.click();
		}
				
		}
