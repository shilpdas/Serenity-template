package com.serenity.pages.RetailSite;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import com.serenity.pages.RetailSite.Homepage;


public class RegisterPage extends Homepage{

	@FindBy(xpath = "//*[@id='System_nyHsmShk']/div/div[1]/div/div[2]/div/a")
	public WebElementFacade  registerLink;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	public WebElementFacade  loginLink;

	@FindBy(xpath = "//input[contains(@id,'input-firstname')]")
	public WebElementFacade  firstname;

	@FindBy(xpath = "//input[contains(@id,'input-lastname')]")
	public WebElementFacade  lastName;

	@FindBy(xpath = "//input[contains(@id,'input-email')]")
	public WebElementFacade  email;
	
	@FindBy(xpath = "//input[contains(@id,'input-telephone')]")
	public WebElementFacade  telephone;
	
	@FindBy(xpath = "//input[contains(@id,'input-address-1')]")
	public WebElementFacade  address1;
	
	@FindBy(xpath = "//input[contains(@id,'input-address-2')]")
	public WebElementFacade  address2;
	
	@FindBy(xpath = "//input[contains(@id,'input-city')]")
	public WebElementFacade  city;
	
	@FindBy(xpath = "//input[contains(@id,'input-postcode')]")
	public WebElementFacade  postcode;
	
	@FindBy(xpath = "//select[contains(@id,'input-country')]")
	public WebElementFacade  country;
	
	@FindBy(xpath = "//select[contains(@id,'input-zone')]")
	public WebElementFacade  region;
	
	@FindBy(xpath = "//input[contains(@id,'input-password')]")
	public WebElement  password;
	
	@FindBy(xpath = "//input[contains(@id,'input-confirm')]")
	public WebElementFacade  passwordConfirm;
	
	@FindBy(xpath = "//label[@class='radio-inline'][contains(.,'No')]")
	public WebElementFacade  noSubscribe;
	
	@FindBy(xpath = "//input[contains(@name,'agree')]")
	public WebElementFacade  privacyPolicy;
	
	@FindBy(xpath = "//input[contains(@value,'Continue')]")
	public WebElementFacade  submit;
	
	
	public void register() {
		
			
		registerLink.waitUntilVisible().click();
		
		firstname.sendKeys("manzoor");
		lastName.sendKeys("mehadi");
		email.sendKeys("manzoor@gmail.com");
		telephone.sendKeys("9876543210");
		address1.sendKeys("yeshwanthapur");
		address2.sendKeys("bangalore");
		city.sendKeys("bangalore");
		postcode.sendKeys("560022");
		country.sendKeys("India");
		region.selectByVisibleText("Karnataka");
		password.sendKeys("manzoor1");
		passwordConfirm.sendKeys("manzoor1");
		noSubscribe.isSelected();
		privacyPolicy.click();
		privacyPolicy.isSelected();
		submit.click();
	}


	

}
