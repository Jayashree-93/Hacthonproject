package PageObjects;
 
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utilities.ExcelUtils;
 
public class ForEnterprise extends BasePage{
	
	public ForEnterprise(WebDriver driver)
	{
		super(driver);
	}
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	Actions ac = new Actions(driver);
	
	@FindBy(xpath="//img[@alt='Coursera']")
	WebElement home;
	
	@FindBy(xpath = "//p[text() ='Coursera']")
	WebElement scroll1;
	
	@FindBy(xpath = "//a[text()='For Enterprise']")
	WebElement enterprise;
	
	@FindBy(xpath = "//a[text()='Solutions']")
	WebElement solutions;
	
	@FindBy(xpath = "//p[text()='Coursera for Campus']")
	WebElement campus;
	
	@FindBy(xpath = "//h2[text()='Here’s how innovative universities are using Coursera for Campus']")
	WebElement scroll2;
	
    //First Name
	@FindBy(name = "FirstName")
	WebElement fName;
 
    //Last Name
	@FindBy(name = "LastName")
	WebElement lName;
  
    //Work Email Address
	@FindBy(name = "Email")
	WebElement email;
 
    //Phone Number
	@FindBy(name = "Phone")
	WebElement phone;
    
    //Institution Type
	@FindBy(name = "Institution_Type__c")
	WebElement iType;
 
    //Institution Name
	@FindBy(name = "Company")
	WebElement iName;
    
    //Job Role
	@FindBy(name = "Title")
	WebElement job;
 
    //Department
	@FindBy(name = "Department")
	WebElement dept;
    
    //Describes your needs
	@FindBy(name ="What_the_lead_asked_for_on_the_website__c")
	WebElement needs;
    
    //Country
	@FindBy(name = "Country")
	WebElement countries;
	
	// Terms and condition
	@FindBy(name="Express_Consent__c")
	WebElement box;
    
    //Submit Button
	@FindBy(xpath ="//button[text()='Submit']")
	WebElement submit;
	
	//Error Message
	@FindBy(xpath = "//div[@id='ValidMsgEmail']/span")
	WebElement Error_message;
	
	public void homePage()
	{
		home.click();
	}
 
	public void scrollToCoursera()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll1);
	}
	
	public void enterpriseClick()
	{
		enterprise.click();
	}
	
	public void solutionsClick()
	{
		solutions.click();
	}
	
	public void campusClick()
	{
		campus.click();
	}
	
	public void scrollToForm()
	{
		
		js.executeScript("arguments[0].scrollIntoView();",scroll2);
	}
	
	public void firstName () throws IOException
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		fName.sendKeys(inputData[2]);
	}
	
	public void lastName () throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		lName.sendKeys(inputData[3]);
	}
	
	public void emailAddress () throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		email.sendKeys(inputData[4]);
	}
	
	public void phoneNumber () throws IOException
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		phone.sendKeys(inputData[5]);
	}
    
	public void institutionType() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		Select institutionType = new Select(iType);
		institutionType.selectByValue(inputData[6]);
	}
	
	public void institutionName() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		iName.sendKeys(inputData[7]);
	}
	
	public void jobRole() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		Select jobRole = new Select(job);
		jobRole.selectByValue(inputData[8]);
	}
	
	public void depatment() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		Select department = new Select(dept);
		department.selectByValue(inputData[9]);
	}
	
	public void selectNeeds() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		Select selectNeeds = new Select(needs);
		selectNeeds.selectByValue(inputData[10]);
	}
	
	public void country() throws Exception
	{
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		Select country = new Select(countries);
		country.selectByValue(inputData[11]);
	}
	
	public void checkBox()
	{
		box.click();
	}
	
	public void submitButton()
	{
		//submit.click();
		//ac.moveToElement(submit).click().perform();
		js.executeScript("arguments[0].click();",submit);
	}
	public void captureMessage() throws Exception
	{
		//submit.click();
		
		js.executeScript("arguments[0].scrollIntoView();",fName);
		String data = Error_message.getText();
		System.out.println(data);
		ExcelUtils.writeExcelData("Sheet2", 0, 3, data);
	}
}
