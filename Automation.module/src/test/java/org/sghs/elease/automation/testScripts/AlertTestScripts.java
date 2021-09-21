package org.sghs.elease.automation.testScripts;

import org.openqa.selenium.WebDriver;

import org.sghs.elease.automation.webPages.AlertPage;
import org.sghs.elease.automation.webPages.FormsPage;
import org.sghs.elease.automation.webPages.LandingPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class AlertTestScripts extends BaseTest {
	AlertPage alertObj;

	@BeforeClass
	public void goToalertPage() {
		lpObj.goToalertTab();
	}

	@BeforeMethod
	public void alertPage() {
		alertObj = new AlertPage(gbObj.getDriver(), gbObj);
	}

	public void sideAlertClick() {
		alertObj.sideAlertClick();
	}

	public void clickButtonToSeeAlert() {
		alertObj.clickButtonToSeeAlert();
	}

	public void promtButton() {
		// alertObj.timerAlertButton();
		alertObj.promtButton();
	}

	public void confirmButton() {
		alertObj.confirmButton();
	}

}
