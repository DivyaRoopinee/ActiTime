package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;
import com.actitime.generic.BaseTest;

public class FbLoginPage extends BasePage
{
	//Declaration
	@FindBy(id="email")
	private WebElement emailTB;
	
	@FindBy(id="pass")
	private WebElement passwdTB;
	
	@FindBy(css="input[value='Log In']")
	private WebElement loginBTN;
	
	@FindBy(id="userNavigationLabel")
	private WebElement logoutDropDown;
	
	@FindBy(className="_54nc")
	private WebElement logoutBTN;
	
	
	@FindBy(xpath="//a[.='Forgotten account?']")
	private WebElement forgotAcc;
	
	@FindBy(name="firstname")
	private WebElement firstNameTB;
	
	@FindBy(name="lastname")
	private WebElement surNameTB;
	
	@FindBy(css="input[aria-label='Mobile number or email address']")
	private WebElement mobTB;
	
	@FindBy(css="input[aria-label='New password']")
	private WebElement newPassTB;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement daySel;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthSel;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yearSel;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement femaleRadioBTN;
	
	@FindBy(xpath="//button[.='Sign Up']")
	private WebElement signUpBTN;
	
	
	//Initialization
	public FbLoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	//verify page
	public void verifyPage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	//Login
	public void enterEmail(String email)
	{
		emailTB.sendKeys(email);
	}
	
	public void enterPass(String pwd)
	{
		passwdTB.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	//Create Account
	public void enterFirstName(String firstname)
	{
		firstNameTB.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		surNameTB.sendKeys(lastname);
	}
	
	public void enterEmailOrPh(String emailorph)
	{
		mobTB.sendKeys(emailorph);
	}
	
	public void enterNewPass(String newpass)
	{
		newPassTB.sendKeys(newpass);
	}
	
	public void enterBirthDay(String day)
	{
		daySel.sendKeys(day);
	}
	
	public void enterBirthMonth(String month)
	{
		monthSel.sendKeys(month);
	}
	
	public void enterBirthYear(String year)
	{
		yearSel.sendKeys(year);
	}
	
	public void clickGender()
	{
		femaleRadioBTN.click();
	}
	
	public void clickSignUp()
	{
		signUpBTN.click();
	}
	public void clickLogoutDropDown()
	{
		logoutDropDown.click();
	}
	public void clickLogout()
	{
		logoutBTN.click();
	}
}
