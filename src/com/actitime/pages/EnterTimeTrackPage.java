package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	
	//Declaration
		@FindBy(xpath="//a[.='Logout']")
		private WebElement logoutBTN;
		
		@FindBy(xpath = "//div[@class='popup_menu_icon support_icon']")
		private WebElement helpBTN;
		
		@FindBy(xpath="//a[contains(text(),'About your actiTIME')]")
		private WebElement aboutYourActiTimeBTN;
		
		@FindBy(xpath = "//span[contains(text(),'build 40469')]")
		private WebElement buildNumber;
		
		//Initialization
		public EnterTimeTrackPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void clickOnLogout()
		{
			logoutBTN.click();
		}
		
		public void clickOnHelp()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			helpBTN.click();
		}

		public void clickOnAboutYourActiTime()
		{
			aboutYourActiTimeBTN.click();
		}
		
		public String verifyBuildNumber()
		{
			verifyElement(buildNumber);
			String aBuildNumber = buildNumber.getText();
			return aBuildNumber;
		}
	}
