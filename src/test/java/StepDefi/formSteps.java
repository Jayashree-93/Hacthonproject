package StepDefi;

import PageObjects.ForEnterprise;
import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formSteps {
	
	ForEnterprise f;
	@Given("navigate to the Coursera home page")
	public void navigate_to_the_coursera_home_page() {
	    f=new ForEnterprise(BaseClass.getDriver());
	}
	
	@When("the user clicks on For Enterprises")
	public void the_user_clicks_on_for_enterprises() {
	    f.homePage();
	    f.scrollToCoursera();
	    f.enterpriseClick();
	    BaseClass.getlogger().info("***The user clicked on the Enterprise Click***");
	}

	@When("the user clicks on Coursera for campus")
	public void the_user_clicks_on_coursera_for_campus() {
	    f.solutionsClick();
	    f.campusClick();
	    BaseClass.getlogger().info("***The user clicked on the Campus Click***");
	}

	@When("scroll to the form")
	public void scroll_to_the_form() {
	   f.scrollToForm(); 
	   BaseClass.getlogger().info("***Successfully scrolled***");
	}

	@Then("enter the details in the form")
	public void enter_the_details_in_the_form() throws Exception {
	   f.firstName();
	   f.lastName();
	   f.emailAddress();
	   f.phoneNumber();
	   f.institutionType();
	   f.institutionName();
	   f.jobRole();
	   f.depatment();
	   f.selectNeeds();
	   f.country();
	   f.checkBox();
	   f.submitButton();
	   BaseClass.getlogger().info("***Successfully entered the details in the form***");
	}

	@Then("verify the error message")
	public void verify_the_error_message() throws Exception {
	    f.captureMessage();
	    BaseClass.getlogger().info("***Successfully printed the error message***");
	}




}
