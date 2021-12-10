package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public void OpenWebsite(String string)
	{
	driver.get("http://demowebshop.tricentis.com/");
	}

	@FindBy(xpath ="//a[.='Log out']")
	private WebElement Logout;

	public void Logout()
	{
		Logout.click();
	}
	@FindBy(xpath ="//a[.='Log in']")
	private WebElement login;

	public void clickLogin()
	{
	login.click();
	}
	
	@FindBy(id="Email")
	private WebElement unLogin;
	public void enterUsernamelogin(String un)
	{
		unLogin.sendKeys(un);
	}
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwlogin;
	public void enterPasswordlogin(String pw)
	{
		pwlogin.sendKeys(pw);

	}
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement loginBtn;
	public void loginbtnclick()
	{
		loginBtn.click();
	}
	
}
