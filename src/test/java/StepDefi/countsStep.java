package StepDefi;

import PageObjects.LanguageLearning;
import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class countsStep {
	LanguageLearning l;
	
	@Given("navigate to the coursera home page")
	public void navigate_to_the_coursera_home_page() {
	    l=new LanguageLearning(BaseClass.getDriver());
	}

	@When("the user clicks on show more")
	public void the_user_clicks_on_show_more() throws Exception {
	    l.keyActions();
	    l.clickShowMore();
	    BaseClass.getlogger().info("***The user successfully clicked show more***");
	}

	@Then("get the languages and their count")
	public void get_the_languages_and_their_count() throws Exception {
		l.getLanguages();
		l.clickCloseButton();
		l.scroll1();
		BaseClass.getlogger().info("***Successfully displayed the languages***");
	}

	@Then("get the levels and their count")
	public void get_the_levels_and_their_count() throws Exception {
	     l.getLevel();
	     BaseClass.getlogger().info("***Successfully displayed the level***");
	}

}
