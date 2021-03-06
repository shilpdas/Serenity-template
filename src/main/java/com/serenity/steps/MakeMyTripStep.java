package com.serenity.steps;

import com.serenity.pages.MakeMyTripPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class MakeMyTripStep extends ScenarioSteps {

	MakeMyTripPage MakeMyTrip;
	
	/*Open URL*/
	@Step
	public void MakeMyTrip_homepage() {
		
		MakeMyTrip.openUrl("https://www.makemytrip.com/");
		
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
		
	}
	
	
	/*Search Flight*/
	@Step
	public void flight_search() {
		
		MakeMyTrip.fromCity.sendKeys("delhi");
		MakeMyTrip.selectfromCity.click();
		MakeMyTrip.toCity.sendKeys("mumbai");
		MakeMyTrip.selectToCity.click();
		MakeMyTrip.Search.click();
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	
	/*Flight search results*/
	@Step
	public void flight_details() {
		
		MakeMyTrip.flightDetailsPageTitle.isCurrentlyVisible();	
		MakeMyTrip.flightSortBy.isCurrentlyVisible();
		
	}
	
	@Step
	public void roundflight_search() {
		MakeMyTrip.roundTrip.select();
		MakeMyTrip.fromCity.sendKeys("delhi");
		MakeMyTrip.selectfromCity.click();
		MakeMyTrip.toCity.sendKeys("mumbai");
		MakeMyTrip.selectToCity.click();
		MakeMyTrip.Search.click();
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
}
