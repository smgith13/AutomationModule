package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.sghs.elease.automation.utiities.GlobalFunctions;

public class ElementsPage {
	
	
	private WebDriver driver;
	private GlobalFunctions gbObj;
	String textBoxClick;
	String fullName;
	String email;
	String currentAddress;
	String permanentAddress;
	String submit;
	String checkBox;
	String radioButton;
	String webTables;
	String expandBox;
	String CollapseBox;
	String publicCheck;
	String impressivebutton;
	String getText;
	String addButton;
	String firstName;
	String lastName;
	String emailTable;
	String age;
	String salary;
	String department;
	String submitTable;
	
	{
		Properties elementPagelocators = GlobalFunctions.FileLoader("elementpagelocators");
		 textBoxClick = elementPagelocators.getProperty("textBox");
		 fullName = elementPagelocators.getProperty("fullName");
		 email = elementPagelocators.getProperty("email");
		 currentAddress = elementPagelocators.getProperty("currentAddress");
		 permanentAddress = elementPagelocators.getProperty("permanentAddress");
		 submit = elementPagelocators.getProperty("submit");
		 checkBox = elementPagelocators.getProperty("checkBox");
		 expandBox = elementPagelocators.getProperty("expandBox");
		 CollapseBox = elementPagelocators.getProperty("CollapseBox");
		 publicCheck = elementPagelocators.getProperty("publicCheck");
		 radioButton = elementPagelocators.getProperty("radioButton");
		 impressivebutton = elementPagelocators.getProperty("impressivebutton");
		 getText = elementPagelocators.getProperty("getText");
		 webTables = elementPagelocators.getProperty("webTables");
		 addButton = elementPagelocators.getProperty("addButton");
		 firstName = elementPagelocators.getProperty("firstName");
		 lastName = elementPagelocators.getProperty("lastName");
		 emailTable = elementPagelocators.getProperty("emailTable");
		 age = elementPagelocators.getProperty("age");
		 salary = elementPagelocators.getProperty("salary");
		 department = elementPagelocators.getProperty("department");
		 submitTable = elementPagelocators.getProperty("submitTable");
		 
	}

	public ElementsPage(WebDriver driver, GlobalFunctions gbObj) {
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void clicktextBox() {
		gbObj.scroll();
		gbObj.clickElement(textBoxClick);
	}
	public void sendFullName() {
		gbObj.sendText(fullName,"Monisha Mathias");
	}
	public void sendEmail() {
		gbObj.sendText(email,"MonishaJanorees@yahoo.com");
	}
	public void sendCurrentAddress() {
		gbObj.sendText(currentAddress,"231 Nayakkar street,vallioor,Tamil Nadu");
	}
	public void sendPermanentAddress() {
		gbObj.sendText(permanentAddress,"6 Megan Avenue scarborough");
	}
	public void clickSubmit() {
		gbObj.scroll();
		gbObj.clickElement(submit);
	}
	public void clickcheckBox() {
		gbObj.clickElement(checkBox);
	}
	public void clickExpand() {
		gbObj.clickElement(expandBox);
	}
	public void clickPublicCheck() {
		gbObj.clickElement(publicCheck);
	}
	public void clickCollapseBox() {
		gbObj.clickElement(CollapseBox);
	}
	public void clickRadioButton() {
		gbObj.clickElement(radioButton);
	}
	public void clickImpressivebutton() {
		gbObj.clickElement(impressivebutton);
	}
	public void getRadioButtonText() {
		gbObj.getText(getText);
	}
	public void clickWebTables() {
		gbObj.clickElement(webTables);
		gbObj.takeScreenshot();
	}
	public void clickAddButton() {
		gbObj.clickElement(addButton);
	}
	public void sendFirstName() {
		gbObj.sendText(firstName,"Monisha");
	}
	public void sendLastName() {
		gbObj.sendText(lastName,"Jano");
	}
	public void sendEmailTable() {
		gbObj.sendText(emailTable,"MonishaJanorees@yahoo.com");
	}
	public void sendage() {
		gbObj.sendText(age,"22");
	}
	public void sendSalary() {
		gbObj.sendText(salary,"1000");
	}
	public void sendDepartment() {
		gbObj.sendText(department,"ECE");
	}
	public void clicksubmitTable() {
		gbObj.clickElement(submitTable);
	}
}
