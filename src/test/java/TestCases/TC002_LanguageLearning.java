package TestCases;

import org.testng.annotations.Test;

import PageObjects.LanguageLearning;
import TestBase.BaseClass;

public class TC002_LanguageLearning extends BaseClass{
	
	@Test(priority=1,groups= {"smoke"})
	public void keyActions() throws Exception
	{
		LanguageLearning lan=new LanguageLearning(driver);
		lan.keyActions();
		Thread.sleep(3000);
		BaseClass.getlogger().info("-----Successfully entered the text-----");
	}
	@Test(priority=2,groups= {"regression"})
	public void getLanguages() throws Exception
	{
		LanguageLearning lan=new LanguageLearning(driver);
		lan.clickShowMore();
		//lan.clickenglish();
		lan.getLanguages();
		BaseClass.getlogger().info("-----Successfully displayed the language details-----");
	}
	@Test(priority=3,groups= {"smoke"})
	public void closeButton()
	{
		LanguageLearning lan=new LanguageLearning(driver);
		lan.clickCloseButton();
		BaseClass.getlogger().info("-----Successfully clicked on the close button-----");
	}
	@Test(priority=4,groups= {"regression"})
	public void getLevel() throws Exception
	{
		LanguageLearning lan=new LanguageLearning(driver);
		lan.scroll1();
		lan.getLevel();
		BaseClass.getlogger().info("-----Successfully displayed the level details-----");
	}

}
