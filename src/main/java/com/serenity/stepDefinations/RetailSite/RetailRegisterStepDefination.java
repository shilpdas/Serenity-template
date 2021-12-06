package com.serenity.stepDefinations.RetailSite;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.serenity.pages.RetailSite.Homepage;
import com.serenity.pages.RetailSite.RegisterSuccess;
import com.serenity.steps.RetailSite.RegisterStep;

public class RetailRegisterStepDefination extends Homepage{
	
	@Steps
	RegisterStep regstep;
	Homepage home;
		
	

	@When("I register with my details")
	public void i_register_with_my_details() {
	    
		regstep.register();
	}

	@Steps
	RegisterSuccess success;
	
	@Then("I should be successfully registered")
	public void i_should_be_successfully_registered() {
		success.registerSuccess();
	}


}
