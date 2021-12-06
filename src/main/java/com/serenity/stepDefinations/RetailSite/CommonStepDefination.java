package com.serenity.stepDefinations.RetailSite;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import com.serenity.steps.RetailSite.CommonStep;

public class CommonStepDefination {

	@Steps
	CommonStep cs;
	
	@Given("I am on Retail Site")
	public void i_am_on_retail_site(){
	    cs.i_am_on_retail_site();
	   
	}

}
