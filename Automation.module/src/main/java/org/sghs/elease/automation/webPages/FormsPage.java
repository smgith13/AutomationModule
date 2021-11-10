package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

import com.aventstack.extentreports.ExtentTest;

public class FormsPage {
	Properties formsPagelocators;
	WebDriver driver;
	@FindBy(xpath="(//*[@id='item-0'])[2]")
	private WebElement practiseFormClick;
	
	@FindBy(xpath="(//*[@id='firstName'])")
	private WebElement firstName;
	
	@FindBy(xpath="(//*[@id='lastName'])")
	private WebElement lastName;
	
	@FindBy(xpath="(//*[@id='userNumber'])")
	private WebElement userNumber;
	
	@FindBy(xpath="(//*[@id='userEmail'])")
	private WebElement userEmail;
	
	@FindBy(xpath="(//input[@value='Male'])")
	private WebElement gender;
	
	private GlobalFunctions gbObj;

	{
		Properties formsPagelocators = GlobalFunctions.FileLoader("formsPagelocators");
	}

	public FormsPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj = gbObj;
	}

	public void sidePractiseForm(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(practiseFormClick,ext,"practiseFormClick");
	}

	public void sendfirstName(ExtentTest ext) {
		gbObj.sendText(firstName, "Monisha",ext,"sendfirstName");

	}

	public void sendLastName(ExtentTest ext) {
		gbObj.sendText(lastName, "Mathias",ext,"sendLastName");

	}

	public void senduserNumber(ExtentTest ext) {
		gbObj.sendText(userNumber, "9442452488",ext,"senduserNumber");

	}

	public void senduserEmail(ExtentTest ext) {
		gbObj.sendText(userEmail, "monishajanorees@gmail.com",ext,"senduserEmail");

	}

	public void clickgender(ExtentTest ext) {
		gbObj.jseClick(gender,ext,"practiseFormClick");

	}
}