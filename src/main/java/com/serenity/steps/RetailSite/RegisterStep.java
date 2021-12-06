package com.serenity.steps.RetailSite;
import com.serenity.pages.RetailSite.Homepage;
import com.serenity.pages.RetailSite.RegisterPage;
import net.thucydides.core.annotations.Step;


public class RegisterStep extends CommonStep {
	
	RegisterPage reg;
	Homepage home;
	
	@Step
	public void  register() {
	home.accountIcon.click();
	home.loginRegister.click();
	reg.register();
	}
	

}
