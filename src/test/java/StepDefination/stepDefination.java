package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("launch the amazon application")
	public void launch_the_amazon_application() {
		System.out.println("This is teststep");
	}

	@Given("go to registration page")
	public void go_to_registration_page() {
		System.out.println("This is teststep");
	}

	@Given("fill all the valid registration details")
	public void fill_all_the_valid_registration_details() {
		System.out.println("This is teststep");
	}

	@When("user register successfully")
	public void user_register_successfully() {
		System.out.println("This is teststep");
	}

	@Then("I validate user login with new credencials")
	public void i_validate_user_login_with_new_credencials() {
		System.out.println("This is teststep");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		System.out.println("This is teststep");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("This is teststep");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println("This is teststep");
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		System.out.println("This is teststep");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
		System.out.println("This is teststep");
	}

}
