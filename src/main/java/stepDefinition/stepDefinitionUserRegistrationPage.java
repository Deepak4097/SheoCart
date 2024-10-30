package stepDefinition;

import io.cucumber.java.en.Then;
import static pages.Registration.*;

public class stepDefinitionUserRegistrationPage {
	
	
	@Then("User should able to see Registration page")
	public void user_should_able_to_see_registration_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions		
		visibilityUserRegistrationPageHeader();
	}
}
