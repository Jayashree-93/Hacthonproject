package TestCases;

import org.testng.annotations.Test;

import PageObjects.ForEnterprise;
import TestBase.BaseClass;

public class TC003_ForEnterprise extends BaseClass{
	
	@Test(priority=1,groups= {"smoke"})
	public void homepage() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.homePage();
	}
	@Test(priority=2,groups= {"smoke"})
	public void clickEnterprise()
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.scrollToCoursera();
		form.enterpriseClick();
		BaseClass.getlogger().info("-----Scrolled to the For Enterprise-----");
	}
	@Test(priority=3,groups= {"regression"})
	public void clickCoursera() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.solutionsClick();
		form.campusClick();
		Thread.sleep(2000);
		BaseClass.getlogger().info("-----Clicked on the Coursera for campus-----");
	}
	@Test(priority=4,groups= {"smoke"})
	public void scrollToForm()
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.scrollToForm();
		BaseClass.getlogger().info("-----Scrolled to the form-----");
	}
	@Test(priority=5,groups= {"regression"})
	public void fillName() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.firstName();
		form.lastName();
		BaseClass.getlogger().info("-----Entered the value of the name-----");
	}
	@Test(priority=6,groups= {"regression"})
	public void personalDetails() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.emailAddress();
		form.phoneNumber();
		BaseClass.getlogger().info("-----Entered the value of email and Phone Number -----");
	}
	@Test(priority=7,groups= {"regression"})
	public void institution() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.institutionType();
		form.institutionName();
		BaseClass.getlogger().info("-----Entered the value for the institution-----");
	}
	@Test(priority=8,groups= {"regression"})
	public void jobDetails() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.jobRole();
		form.depatment();
		form.selectNeeds();
		BaseClass.getlogger().info("-----Entered the values for the job details-----");
	}
	@Test(priority=9,groups= {"regression"})
	public void countryDetails() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.country();
		form.checkBox();
		BaseClass.getlogger().info("-----Entered the value for country-----");
	}
	@Test(priority=10,groups= {"regression"})
	public void submitButton() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.submitButton();
		Thread.sleep(3000);
		BaseClass.getlogger().info("-----Clicked on the submit button-----");
	}
	@Test(priority=11,groups= {"smoke"})
	public void errorMessage() throws Exception
	{
		ForEnterprise form= new ForEnterprise(driver);
		form.captureMessage();
		BaseClass.getlogger().info("-----Successfully captured the Error Message-----");
	}
}
