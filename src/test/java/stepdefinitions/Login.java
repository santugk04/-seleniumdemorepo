package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*; 

public class Login {
	

//	@BeforeStep
//	public void beforeEachStep()
//	{
//		System.out.println("Before every step hook");
//	}
//	
//	@AfterStep
//	public void afterEachStep()
//	{
//		System.out.println("After every step hook");
//	}
	
	

	
	@Given("User open the Application url")
	public void user_open_the_application_url() {
		System.out.println("User got navigated to login page");
	}
	
	/*@When("^User enters email address <string>")
	public void user_enters_email_address(String emailaddresstext) {
		System.out.println("User enters email address:" +emailaddresstext);*/

	@When("^User enters email address (.+)$")
	public void user_enters_email_address(String email) {
		System.out.println("User enters email address:" +email);
	 }
	
	/*@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String emailaddresstext) {
		System.out.println("User enters invalid email address:" +emailaddresstext);
	 }*/
	
	//regular expression
	
	@When("^User enters invalid email address (.+)$") 
	public void user_enters_invalid_email_address(String invaliemail) {
		System.out.println("User enters invalid email address:" +invaliemail);
	 }

	/*@And("Enters valid password {string}")
	public void enters_valid_password(String passwordtext) {
	System.out.println("User enters valid password:" +passwordtext);
	}*/
	
	@And("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
	System.out.println("User enters valid password:" +password);
	}
	
	@And("Enters invalid password {string}")
	public void enters_invalid_password(String passwordtext) {
	System.out.println("User enters invalid password:" +passwordtext);
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
	System.out.println("User Clicks on Login button");  
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("User should login successfully");
	   }
	
	@Then("User should get prompt warning message")
	public void User_should_get_prompt_warning_message() {
		System.out.println("Invalid credentails");
	   }
}
