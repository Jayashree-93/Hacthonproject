package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.ExcelUtils;

public class LanguageLearning extends BasePage {
	
	public LanguageLearning(WebDriver driver)
	{
		super(driver);
	}
	
	Actions ac =new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//input[@class='react-autosuggest__input']")
	WebElement inputBox;
	
	@FindBy(xpath="(//div[@class='magnifier-wrapper'])[2]")
	WebElement searchButton;
	
	@FindBy(xpath="(//span[text()='Show more'])[2]")
	WebElement showMore;
	
	@FindBy(xpath="(//span[text()='English'])[3]")
	WebElement english;
	
	//@FindBy(xpath="//div[starts-with(@class,'css-1vfy')]//div/span/span")
	@FindBy(xpath="//div[starts-with(@class,'css-14j')]//div/span/span")
	List<WebElement> languages;
	
	@FindBy(xpath="(//span[text()='Close'])[2]")
	WebElement closeButton;
	
	@FindBy(xpath="//span[text()='Graduate Certificates']")
	WebElement scroll1;
	
	@FindBy(xpath="//div[@data-testid='search-filter-group-Level']//div/span/span[text()]")
	List<WebElement> level;
	
//	public void clickInput()
//	{
//		inputBox.click();
//	}
	public void keyActions() throws Exception
	{
		inputBox.click();
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ac.sendKeys(Keys.BACK_SPACE).perform();
		String[] inputData = ExcelUtils.readExcelData("Sheet1",0);
		ac.sendKeys(inputData[1]);
		ac.sendKeys(Keys.ENTER).perform();
	}

	public void clickShowMore()
	{
		showMore.click();
	}
	public void clickenglish()
	{
		english.click();
	}
	public void getLanguages() throws Exception
	{
		int count=0,i=3;
		for(WebElement lan : languages)
		{
			count = languages.size();
			String data = lan.getText();
			System.out.println(data);
			Thread.sleep(2000);
			ExcelUtils.writeExcelData("Sheet2", i, 0, data);
			i++;
		}
		System.out.println("The count of Languages :"+count);
	}
	public void clickCloseButton()
	{
		closeButton.click();
	}
	public void scroll1()
	{
		js.executeScript("arguments[0].scrollIntoView();", scroll1);
	}
	public void getLevel() throws Exception
	{
		int levelCount=0,i=3;
		for(WebElement lev : level) {
			levelCount=level.size();
			String data = lev.getText();
			System.out.println(data);
			Thread.sleep(2000);
			ExcelUtils.writeExcelData("Sheet2", i, 1, data);
			i++;
		}
		System.out.println("The count of Level :"+levelCount);
	}	
}
