package stepdefenitions;

import io.cucumber.java.en.Given;

public class gitTest {
	@Given("^remote commit one$")
	public void remote_commit_one() {
		System.out.println("Message test remote commit one");

	}
	@Given("^local commit one$")
	public void local_commit_one() {

	}
}
