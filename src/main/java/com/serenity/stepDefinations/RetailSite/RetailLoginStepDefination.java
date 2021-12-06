package com.serenity.stepDefinations.RetailSite;

import com.serenity.steps.RetailSite.LoginStep;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RetailLoginStepDefination {

	@Steps
	LoginStep loginstep;
	
	@When("I enter my user details")
	public void i_enter_my_user_details() {
		loginstep.login();
	    
	}

	@Then("I should be successfully logged in")
	public void i_should_be_successfully_logged_in() {
	    
	}
}
