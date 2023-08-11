package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	
	@Given("user in NetBanking page")
	public void user_in_net_banking_page() {
	   System.out.println("user in NetBanking page");

	}


	@When("user_enters_credentials user id {string} and password {string}")
	public void user_enters_credentials_user_id_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);
	}



	@And("click on Submit")
	public void click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("click on Submit");
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Homepage is displayed");
	}

	@And("Cards are displayed is {string}")
	public void cards_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cards are displayed "+string);
	}
	
}
