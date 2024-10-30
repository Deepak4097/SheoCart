package stepDefinition;

import io.cucumber.java.en.When;
import static pages.LoginPage.*;
import static pages.HomePage.clickHamburgerMenu;
import static pages.HomePage.clickSignInLink;



public class stepDefinitionLoginPage {
	
	@When("User successfully enters the login details")
	public void user_successfully_enters_the_login_details() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		sendKeysPassword();
		sendKeysUserName();
		clickLoginBtn();	
	}
	

	
	@When("User click on new registration button")
	public void user_click_on_new_registration_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions		
		clickNewUserBtn();
	}
}
