package TestDefinitions;

import Pages.LandingPage;
import cucumber.api.java.en.*;

public class SmokeTests {

@Given("^I open landing page$")
public void I_open_landing_page(){
	LandingPage.GoTo();
}
	
@When("^I log in$")
public void I_log_in(){
	
}

@Then("main page is displayed")
public void main_page_is_displayed(){
	
}
}
