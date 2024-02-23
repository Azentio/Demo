package stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class gitTest {
	@Given("^navigate to URL$")
	public void navigate_to_url() throws Throwable {
		System.out.println("In given step");
	}

	@Then("^verify$")
	public void verify() throws Throwable {
		System.out.println("In Then step");
	}
}
