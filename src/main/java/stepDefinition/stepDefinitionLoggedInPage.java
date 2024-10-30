package stepDefinition;

import io.cucumber.java.en.Then;
import static pages.LoggedInPage.*;





public class stepDefinitionLoggedInPage {
	
	@Then("User should able to view product category page")
	public void user_should_able_to_view_product_category_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		visibilityProductFormalShoes();
		visibilityProductSportsShoes();
		visibilityProductSneakers();
		}


}
