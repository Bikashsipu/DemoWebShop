package com.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
	@FindBy(xpath = "(//span[contains(@class,'cart-label')])[1]")
	private WebElement ShoppingCart;

	
	public void Action()
	{
	Actions act = new Actions(driver);
	act.moveToElement(ShoppingCart).perform();;
	
	ShoppingCart.click();
	
	}
	@FindBy(id="termsofservice")
	private WebElement Checkbox;
	public void Checkbox()
	{
		Checkbox.click();
	}
	@FindBy(id="checkout")
	private WebElement checkout;
	public void checkout()
	{
		checkout.click();
	}

}
