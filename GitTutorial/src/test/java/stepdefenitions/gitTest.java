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

	@Then("^verify remote PC commit$")
	public void verify_remote_PC_commit() throws Throwable {
		System.out.println("In commit from PC step");
	}
	@Then("^verify remote PC commit Two$")
	public void verify_remote_PC_commit_two() throws Throwable {
		System.out.println("In commit from PC step two");
	}
	@Then("^verify fetch$")
	public void verify_fetch() throws Throwable {
		System.out.println("In Then fetch test");
	}
	@Then("^verify fetch two$")
	public void verify_fetch_two() throws Throwable {
		System.out.println("In Then fetch test");
	}
	@Then("^verify fetch three$")
	public void verify_fetch_three() throws Throwable {
		System.out.println("In Then fetch test three");
	}
	@Then("^verify fetch four$")
	public void verify_fetch_four() throws Throwable {
		System.out.println("In Then fetch test four");
	}
	@Then("^verify fetch five$")
	public void verify_fetch_five() throws Throwable {
		System.out.println("In Then fetch test five");
	}
	@Then("^verify fetch six$")
	public void verify_fetch_six() throws Throwable {
		System.out.println("In Then fetch test six");
	}
}
