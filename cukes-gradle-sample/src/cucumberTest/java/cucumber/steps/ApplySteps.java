package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplySteps
{
	@Given("^I navigate to the amaris web page$")
	public void i_navigate_to_the_amaris_web_page() throws Throwable
	{
	}

	@When("^I click on the apply button$")
	public void i_click_on_the_apply_button() throws Throwable
	{
	}

	@Then("^The apply page has to be loaded correctly$")
	public void the_apply_page_has_to_be_loaded_correctly() throws Throwable
	{
	}

	@Given("^I want to write a step with (.*)$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable
	{
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check for the (.*) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable
	{
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String msg) throws Throwable
	{
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}
}
