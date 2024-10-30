package stepDefinition;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;


public class stepDefinitionHomePage {
	
	
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		clickHamburgerMenu();
		clickSignInLink();
		
	}

	@Given("^User navigates to the online product page$")
	public void user_navigates_to_the_online_product_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		clickHamburgerMenu();
		clickOnlineProductLink();
		
	}
}
