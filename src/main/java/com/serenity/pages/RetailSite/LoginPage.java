package com.serenity.pages.RetailSite;

import org.openqa.selenium.support.FindBy;

import com.serenity.steps.RetailSite.LoginStep;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;


public class LoginPage extends LoginStep{ 
	

	@FindBy(xpath = "//input[contains(@id,'input-email')]")
	public WebElementFacade EmailAddress;

	@FindBy(xpath = "//input[contains(@id,'input-password')]")
	public WebElementFacade Password;

	@FindBy(xpath = "//input[contains(@value,'Login')]")
	public WebElementFacade loginButton;

	
	public void loginPage() {
		
	}
}
