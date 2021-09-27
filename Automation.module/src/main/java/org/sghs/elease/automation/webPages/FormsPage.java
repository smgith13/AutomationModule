//package org.sghs.elease.automation.webPages;
//
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//
//import org.sghs.elease.automation.utiities.GlobalFunctions;
//
//public class FormsPage {
//	Properties formsPagelocators;
//	WebDriver driver;
//	String practiseFormClick;
//	String firstName;
//	String lastName;
//	String userNumber;
//	String userEmail;
//	String gender;
//	private GlobalFunctions gbObj;
//
//	{
//		Properties formsPagelocators = GlobalFunctions.FileLoader("formsPagelocators");
//		practiseFormClick = formsPagelocators.getProperty("practiseFormClick");
//		firstName = formsPagelocators.getProperty("firstName");
//		lastName = formsPagelocators.getProperty("lastName");
//		userNumber = formsPagelocators.getProperty("userNumber");
//		userEmail = formsPagelocators.getProperty("userEmail");
//		gender = formsPagelocators.getProperty("gender");
//	}
//
//	public FormsPage(WebDriver driver, GlobalFunctions gbObj) {
//		this.driver = driver;
//		this.gbObj = gbObj;
//	}
//
//	public void sidePractiseForm() {
//		gbObj.scroll();
//		gbObj.clickElement(practiseFormClick);
//	}
//
//	public void sendfirstName() {
//		gbObj.sendText(firstName, "Monisha");
//
//	}
//
//	public void sendLastName() {
//		gbObj.sendText(lastName, "Mathias");
//
//	}
//
//	public void senduserNumber() {
//		gbObj.sendText(userNumber, "9442452488");
//
//	}
//
//	public void senduserEmail() {
//		gbObj.sendText(userEmail, "monishajanorees@gmail.com");
//
//	}
//
//	public void clickgender() {
//		gbObj.jseClick(gender);
//
//	}
//}