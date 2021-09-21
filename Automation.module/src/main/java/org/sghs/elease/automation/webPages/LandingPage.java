package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.sghs.elease.automation.utiities.GlobalFunctions;

public class LandingPage {

	Properties landpageprop;
	WebDriver driver;
	String frameAlertTab;
	String FormsTab;
	String ElementsTab;
	GlobalFunctions gbObj;
	
	{
		landpageprop = GlobalFunctions.FileLoader("landinglocators");
		frameAlertTab = landpageprop.getProperty("frameAlertTab");
		FormsTab=landpageprop.getProperty("FormsTab");
		ElementsTab=landpageprop.getProperty("ElementsTab");
	}

	public LandingPage(WebDriver driver, GlobalFunctions gbObj) {
		this.driver = driver;
		this.gbObj = gbObj;
	}

	public void goToalertTab() {
		gbObj.scroll();
		gbObj.findIframe();
		gbObj.waitForElementToBeClickable(driver, frameAlertTab);
		gbObj.clickElement(frameAlertTab);
	}
	public void goToFormsTab() {
		gbObj.scroll();
		//gbObj.waitForElementToBeClickable(driver, FormsTab);
		gbObj.clickElement(FormsTab);
	}
	public void goToElementsTab() {
		gbObj.scroll();
		//gbObj.waitForElementToBeClickable(driver, FormsTab);
		gbObj.clickElement(ElementsTab);
	}
}
