package com.BaseTest;

import org.testng.annotations.Test;

import com.BasePage.LoginPage;
import com.BasePage.OrderPage;
import com.BasePage.PaymentPage;
import com.BasePage.RegisterPage;
import com.BasePage.ShippingPage;
import com.BasePage.ShoppingCartPage;
import com.DemoWebshop.generic.PropertyReader;

public class LoginTest extends BaseTest {
	
	LoginPage l = new LoginPage();
	//RegisterPage r=new RegisterPage();
	OrderPage o=new OrderPage();
	ShoppingCartPage s=new ShoppingCartPage();
	ShippingPage s1=new ShippingPage();
	PaymentPage p1=new PaymentPage();
	

	@Test
	public void VerifyLogin() throws InterruptedException {
		
		PropertyReader.initProperty();
		l.OpenWebsite(PropertyReader.getProperty("OpenWebsite"));
		Thread.sleep(3000);
	//	r.clickReg();
//		Thread.sleep(3000);
//		r.genderClick();
//		r.FirstName(PropertyReader.getProperty("Fname"));
//		Thread.sleep(3000);
//		r.LastName(PropertyReader.getProperty("Lname"));
//		Thread.sleep(3000);
//		r.EName(PropertyReader.getProperty("Ename"));
//		Thread.sleep(3000);
//		r.Password(PropertyReader.getProperty("password"));
//		Thread.sleep(3000);
//		r.ConfirmPassword(PropertyReader.getProperty("ConPassword"));
//		Thread.sleep(3000);
//		r.RegButton();
//		Thread.sleep(3000);
//		r.Continue();
		Thread.sleep(3000);
		l.Logout();
		Thread.sleep(3000);
		l.clickLogin();
		Thread.sleep(3000);
		l.enterUsernamelogin(PropertyReader.getProperty("logEmail"));
		Thread.sleep(3000);
		l.enterPasswordlogin(PropertyReader.getProperty("logPwd"));
		Thread.sleep(3000);
		l.loginbtnclick();
		Thread.sleep(3000);
		o.OrderItemClick();
		Thread.sleep(3000);
		o.RecipientName(PropertyReader.getProperty("RecipientName"));
		Thread.sleep(3000);
		o.RecipientEmail(PropertyReader.getProperty("RecipientEmail"));
		Thread.sleep(3000);
		o.AddCart();
		Thread.sleep(3000);
		s.Action();
		Thread.sleep(3000);
		s.Checkbox();
		Thread.sleep(3000);
		s.checkout();
		Thread.sleep(3000);
		s1.SelectRole();
		Thread.sleep(3000);
		s1.city(PropertyReader.getProperty("City"));
		Thread.sleep(3000);
		s1.Address(PropertyReader.getProperty("Address"));
		Thread.sleep(3000);
		s1.ZipCode(PropertyReader.getProperty("ZipCode"));
		Thread.sleep(3000);
		s1.PhoneNo(PropertyReader.getProperty("PhoneNo"));
		Thread.sleep(3000);
		s1.Continue();
		Thread.sleep(3000);
		p1.Continue();
		Thread.sleep(3000);
		p1.Continuepayment();
		Thread.sleep(3000);
		p1.Continuepaymentconfirm();
		Thread.sleep(3000);
		p1.confirmContinue();
		Thread.sleep(3000);
		l.Logout();
	}
	}

