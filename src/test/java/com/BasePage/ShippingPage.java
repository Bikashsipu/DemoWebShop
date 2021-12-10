package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage extends BasePage{
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement SelectCountry;
	public void SelectRole()
	{
		Select slt = new Select(SelectCountry);
		slt.selectByIndex(1);
	}
	@FindBy(id="BillingNewAddress_City")
	private WebElement city;

	public void city(String cit)
	{
		city.sendKeys(cit);
	}
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement Address;

	public void Address(String ad)
	{
		Address.sendKeys(ad);
	}
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement ZipCode;

	public void ZipCode(String zip)
	{
		ZipCode.sendKeys(zip);
	}
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement PhoneNo;

	public void PhoneNo(String ph)
	{
		PhoneNo.sendKeys(ph);
	}
	@FindBy(xpath="//input[contains(@class,'button-1 new-address-next-step-button')]")
	private WebElement Continue;

	public void Continue()
	{
		Continue.click();
	}
}
