package StepDefi;

import PageObjects.WebDevelopment;
import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class courseStep {
	WebDevelopment w;
	
	@Given("Navigate to the coursera home page")
	public void navigate_to_the_coursera_home_page() {
		w = new WebDevelopment(BaseClass.getDriver()); 
	}

	@When("the user clicks on the inputBox")
	public void the_user_clicks_on_the_input_box() throws Exception {
	   w.inputBox();
	   w.searchButton();
	   BaseClass.getlogger().info("***The user clicked on the search button***");
	}

	@When("the user selects the checkBox")
	public void the_user_selects_the_check_box() {
	   w.clickEnglish();
	   w.clickBeginner();
	   w.scrollToTop();
	   BaseClass.getlogger().info("***The user clicked on the english and begginer***");
	}

	@Then("verify the details of the first course")
	public void verify_the_details_of_the_first_course() throws Exception {
	    w.course1();
	    w.childPage();
	    w.courseDetails1();
	    w.parentPage();
	    BaseClass.getlogger().info("***The details of first course is printed***");
	}

	@Then("verify the details of the second course")
	public void verify_the_details_of_the_second_course() throws Exception {
		w.course2();
	    w.childPage();
	    w.courseDetails2();
	    w.parentPage();
	    BaseClass.getlogger().info("***The details of the second course is printed***");
	}
	
	

}
