package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	@FindBy(xpath ="//a[.='Register']")
	private WebElement Register;

	public void clickReg()
	{
		Register.click();
	}
	@FindBy(id="gender-male")
	private WebElement gender;

	public void genderClick()
	{
		gender.click();
	}
	@FindBy(id="FirstName")
	private WebElement fName;

	public void FirstName(String fn)
	{
		fName.sendKeys(fn);
	}
	@FindBy(id="LastName")
	private WebElement LName;

	public void LastName(String ln)
	{
		LName.sendKeys(ln);
	}
	@FindBy(id="Email")
	private WebElement Email;

	public void EName(String en)
	{
		Email.sendKeys(en);
	}
	@FindBy(id="Password")
	private WebElement pwd;

	public void Password(String pw)
	{
		pwd.sendKeys(pw);
	}
	@FindBy(id="ConfirmPassword")
	private WebElement CnPwd;

	public void ConfirmPassword(String cpw)
	{
		CnPwd.sendKeys(cpw);
	}
	@FindBy(id="register-button")
	private WebElement RegBtn;

	public void RegButton()
	{
		RegBtn.click();
	}
	@FindBy(xpath = "//input[contains(@class,'button-1 register-continue-button')]")
	private WebElement continueReg;

	public void Continue()
	{
		continueReg.click();
	}

}
