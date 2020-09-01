import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("I want to write a step with precondition");
	    throw new PendingException();
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("some other precondition");
	    throw new PendingException();
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I complete action");
	    throw new PendingException();
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("some other action");
	    throw new PendingException();
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("yet another action");
	    throw new PendingException();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I validate the outcomes");
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("check more outcomes");
	    throw new PendingException();
	}

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I navigate to the login page");
	    throw new PendingException();
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I submit username and password");
	    throw new PendingException();
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be logged in");
	    throw new PendingException();
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_search_for_Lenovo_Laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User search for Lenovo Laptop");
	    throw new PendingException();
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add the first laptop that appears in the search result to the basket");
	    throw new PendingException();
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User basket should display with added item");
	    throw new PendingException();
	}

	@Given("^User navigate for Lenovo Laptop$")
	public void user_navigate_for_Lenovo_Laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate for Lenovo Laptop");
	    throw new PendingException();
	}

	@When("^Add the laptop to the basket$")
	public void add_the_laptop_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add the laptop to the basket");
	    throw new PendingException();
	}

}
