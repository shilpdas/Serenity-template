package com.serenity.steps.RetailSite;

import com.serenity.pages.RetailSite.Homepage;
import com.serenity.pages.RetailSite.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {
	LoginPage login;
	Homepage home;
	
	@Step
	public void  login() {
	home.accountIcon.click();
	home.loginRegister.click();
	login.EmailAddress.sendKeys("manzoor@gmail.com");
	login.Password.sendKeys("manzoor");
	login.loginButton.click();
}
}
