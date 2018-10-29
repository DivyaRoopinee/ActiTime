package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage 
{

	
	//Declaration
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errorMessage;
	
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement tasksTab;

	
	//Initialization
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	//Utilization
	public void verifyPage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void enterUserName(String un)
	{
		usernameTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	public void clickOnTasks()
	{
		tasksTab.click();
	}
	public String verifyErrorMessage()
	{
		verifyElement(errorMessage);
		String aerrorMessage=errorMessage.getText();
		return aerrorMessage;
		
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aVersion=version.getText();
		return aVersion;
		
	}
	
	
}
