package com.serenity.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MakeMyTripPage extends PageObject{
	
	@FindBy(xpath = "//li[@data-cy='oneWayTrip']")
	public WebElementFacade oneWayTrip;
	
	@FindBy(xpath = "//input[contains(@value,'Delhi')]")
	public WebElementFacade fromCity;
	
	@FindBy(xpath = "(//div[contains(.,'Mumbai, India Chhatrapati Shivaji International Airport')])[16]")
	public WebElementFacade selectfromCity;
	
	@FindBy(xpath = "//input[contains(@value,'Bangalore')]")
	public WebElementFacade toCity;
	
	@FindBy(xpath = "//a[contains(.,'Search')]")
	public WebElementFacade Search;

	
	@FindBy(xpath = "//li[@data-cy='roundTrip']")
	public WebElementFacade roundTrip;
	
	@FindBy(xpath = "//input[contains(@value,'Delhi')]")
	public WebElementFacade fromCity1;
	
	@FindBy(xpath = "//input[contains(@value,'Bangalore')]")
	public WebElementFacade toCity2;
	
	@FindBy(xpath = "//a[contains(.,'Search')]")
	public WebElementFacade roundwaySearch;

	
	public void MakeMyTrip_homepage() {
				
	}

	
	public void flight_search() {
			
	}

	
	public void flight_details() {
				
	}


	public void roundflight_search() {
		
		
	}
}
