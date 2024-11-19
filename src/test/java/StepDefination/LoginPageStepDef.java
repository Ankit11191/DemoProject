package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	@Given("go to login page")
	public void go_to_login_page() {
		System.out.println("go to login page");
	}

	@When("I provide username as {string}")
	public void i_provide_username_as_UN1(String un) {
		System.out.println(un);
	}

	@Then("I provide password as {string}")
	public void i_provide_password_as_password(String pwd) {
		System.out.println(pwd);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("CLick on login");
	}

}
