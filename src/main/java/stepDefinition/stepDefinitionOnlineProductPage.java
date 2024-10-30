package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.OnlineProduct.*;


public class stepDefinitionOnlineProductPage{
	
	
  
	
	@When("^User click on formal shoe dropdown$")
	public void click_on_formal_shoe_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		clickOnlineProductFormalSheosDropdown();
		
		
	}
	@Then("^User should able to view the product$")
	public void User_should_able_to_view_the_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 visibilityFormalSheoName();
		
	}
}
