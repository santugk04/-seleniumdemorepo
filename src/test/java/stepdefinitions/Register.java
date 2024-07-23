package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*; 
public class Register {

	
//	@Before(order=0)
//	public void setupOne()
//	{
//		System.out.println("++ setup one before hook method got executed");
//	}
//	
//	@Before(order=1)
//	public void setupTwo()
//	{
//		System.out.println("++ setup two before hook method got executed");
//	}
//	
//	@Before(order=2)
//	public void setupThree()
//	{
//		System.out.println("++ setup three before hook method got executed");
//	}
	
	@Given("User navigate to  Register account page")
	public void User_navigate_to_Register_account_page() {
		System.out.println("User got navigate to  Register account page");
	}
	
	@When("User enters below details into the fields")
	public void User_enters_below_details_into_the_fields(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		System.out.println("User has entered the firstname as "+map.get("firstname"));
		System.out.println("User has entered the lastname as "+map.get("lastname"));
		System.out.println("User has entered the email address as "+map.get("Emailaddress"));
		System.out.println("User has entered the password as "+map.get("password"));
	    System.out.println("User has entered the confirmpassword as "+map.get("confirmpassword"));		 
	}
	

	
	@Then("Select Yes for NewsLetter")
	public void Select_Yes_for_NewsLetter() {
	System.out.println("User Select Yes for NewsLetter");   
	}
	
	@And("Selects Privacy policy field")
	public void Selects_Privacy_policy_field() {
	System.out.println("User has selected privacy policy field");   
	}
	
	@And("Clicks on continue button")
	public void Clicks_on_continue_button() {
	System.out.println("User Clicks on continue button");   
	}
	
	@Then("Account should get successfully created")
	public void Account_should_get_successfully_created() {
	System.out.println("User Account should get successfully created");   
	}
	
	

}
