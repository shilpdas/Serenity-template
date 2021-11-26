package com.serenity.stepDefinations;


import com.serenity.pages.MakeMyTripPage;
import com.serenity.steps.MakeMyTripStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MakeMyTripStepDefination {

	@Steps
	MakeMyTripPage mmt;
	
	@Given("I am on MakeMyTrip homepage")
	public void i_am_on_make_my_trip_homepage() {
		mmt.MakeMyTrip_homepage();
	}
	
	@When("I do one way flight search for the below")
	public void i_do_one_way_flight_search_for_the_below(io.cucumber.datatable.DataTable dataTable) {
		mmt.flight_search();
	    
	}	
	
		
	@Then("I am directed to flight details")
	public void i_am_directed_to_flight_details() {
	    mmt.flight_details();
	}
		
	@When("I do Round way flight search for the below")
	public void i_do_round_way_flight_search_for_the_below(io.cucumber.datatable.DataTable dataTable) {
	   mmt.roundflight_search();
	   
	}

	
}
