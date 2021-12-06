package com.serenity.pages.RetailSite;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Page{
	
	@FindBy(xpath = "//span[@class='tb_text'][contains(.,'Home')]")
	public WebElementFacade homeLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-user-o')]")
	public WebElementFacade accountIcon;
	
	@FindBy(xpath = "//span[@class='tb_text'][contains(.,'LOGIN / REGISTER')]")
	public WebElementFacade loginRegister;

	
	/*public void clickOnRegistration() {
		
		accountIcon.click();
		loginRegister.click();
		
	}*/


}
