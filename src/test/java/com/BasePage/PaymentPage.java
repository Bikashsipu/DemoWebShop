package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
	@FindBy(xpath="//input[contains(@class,'button-1 payment-method-next-step-button')]")
	private WebElement Continue;

	public void Continue()
	{
		Continue.click();
	}
	@FindBy(xpath="//input[contains(@class,'button-1 payment-info-next-step-button')]")
	private WebElement Continuepayment;

	public void Continuepayment()
	{
		Continuepayment.click();
	}
	@FindBy(xpath="//input[contains(@class,'button-1 confirm-order-next-step-button')]")
	private WebElement Continuepaymentconfirm;

	public void Continuepaymentconfirm()
	{
		Continuepaymentconfirm.click();
	}
	@FindBy(xpath="//input[contains(@class,'button-2 order-completed-continue-button')]")
	private WebElement confirmContinue;

	public void confirmContinue()
	{
		confirmContinue.click();
	}

}
