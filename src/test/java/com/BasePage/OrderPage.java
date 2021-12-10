package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
	@FindBy(xpath ="(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[1]")
	private WebElement orderitem;

	public void OrderItemClick()
	{
		orderitem.click();
	}
	@FindBy(id="giftcard_2_RecipientName")
	private WebElement RecipientName;

	public void RecipientName(String re)
	{
		RecipientName.sendKeys(re);
	}
	@FindBy(id="giftcard_2_RecipientEmail")
	private WebElement RecipientEmail;

	public void RecipientEmail(String em)
	{
		RecipientEmail.sendKeys(em);
	}
	@FindBy(id="add-to-cart-button-2")
	private WebElement AddCart;

	public void AddCart()
	{
		AddCart.click();
	}
}
