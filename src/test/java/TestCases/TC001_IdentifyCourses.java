package TestCases;

import org.testng.annotations.Test;

import PageObjects.WebDevelopment;
import TestBase.BaseClass;

public class TC001_IdentifyCourses extends BaseClass{
	
	@Test(priority=1,groups= {"smoke"})
	public void verifyInputBox() throws Exception
	{
		WebDevelopment wd = new WebDevelopment(driver);
		wd.inputBox();
		wd.searchButton();
		BaseClass.getlogger().info("-----The search button is clicked successfully-----");
	}
	@Test(priority=2,groups= {"regression"})
	public void VerifySelection() throws InterruptedException
	{
		WebDevelopment wd = new WebDevelopment(driver);
		wd.clickBeginner();
		wd.clickEnglish();
		wd.scrollToTop();
		Thread.sleep(2000);
		BaseClass.getlogger().info("-----Successfully scrolled to the top page-----");
	}
	@Test(priority=3,groups= {"regression"})
	public void verifyCourse() throws Exception
	{
		WebDevelopment wd = new WebDevelopment(driver);
		wd.course1();
		wd.childPage();
		wd.courseDetails1();
		captureScreen("Course1");
		wd.parentPage();
		BaseClass.getlogger().info("-----Successfully captured the details of the first Course-----");
		//WebDevelopment wd = new WebDevelopment(driver);
		wd.course2();
		wd.childPage();
		wd.courseDetails2();
		captureScreen("Course2");
		wd.parentPage();
		BaseClass.getlogger().info("-----Successfully captured the details of the second Course-----");
	}
}
