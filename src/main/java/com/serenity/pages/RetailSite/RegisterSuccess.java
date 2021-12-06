package com.serenity.pages.RetailSite;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegisterSuccess {
	
	@FindBy(xpath = "//p[contains(.,'Congratulations! Your new account has been successfully created!')]")
	public WebElementFacade  successMessage;

    
	
	
	public void registerSuccess() {
		
		successMessage.isCurrentlyVisible();
		
	}
}

