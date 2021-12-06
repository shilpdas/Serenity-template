package com.serenity.steps.RetailSite;

import com.serenity.pages.RetailSite.Homepage;

import net.thucydides.core.annotations.Step;


public class CommonStep {
	
	Homepage home;
	
	@Step
	public void i_am_on_retail_site() {
		home.openUrl("http://retailm1.upskills.in/");
	
	}

}
