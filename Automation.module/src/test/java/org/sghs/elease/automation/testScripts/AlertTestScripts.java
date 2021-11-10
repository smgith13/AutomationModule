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

	@BeforeClass(alwaysRun=true)
	public void goToalertPage() {
		extTest=reportCreateTestCase("goToalertPage");
		lpObj.goToalertTab(extTest);
	}

	@BeforeMethod(alwaysRun=true)
	public void alertPage() {
		alertObj = new AlertPage(driver, gbObj);
 	}
	@Test(priority=1,groups="Regression2")
	public void sidebrowserWindow() {
		extTest=reportCreateTestCase("sidebrowserWindow");
		alertObj.sideBrowserwindow(extTest);
	}
	@Test(priority=2,groups="Regression2")
	public void newtab() {
		extTest=reportCreateTestCase("newtab");
		alertObj.newtab(extTest);
	}
	@Test(priority=3,groups="Regression2")
	public void newWindow() {
		extTest=reportCreateTestCase("newWindow");
		alertObj.newWindow(extTest);
	}
	
	@Test(priority=4,groups="Regression2")
	public void newWindowMessage() {
		extTest=reportCreateTestCase("newWindowMessage");
		alertObj.newWindowMessage(extTest);
	}
	@Test(priority=5,groups="Regression2")
	public void sideAlertClick() {
		extTest=reportCreateTestCase("sideAlertClick");
		alertObj.sideAlertClick(extTest);
	}
	@Test(priority=6,groups="Regression2")
	public void clickButtonToSeeAlert() {
		extTest=reportCreateTestCase("clickButtonToSeeAlert");
		alertObj.clickButtonToSeeAlert(extTest);
	}
	@Test(priority=7,groups="Regression2")
	public void promtButton() {
		// alertObj.timerAlertButton();
		extTest=reportCreateTestCase("promtButton");
		alertObj.promtButton(extTest);
	}
	@Test(priority=8,groups="Regression2")
	public void confirmButton() {
		extTest=reportCreateTestCase("confirmButton");
		alertObj.confirmButton(extTest);
	}
	@Test(priority=9,groups="Regression2")
	public void frameClick() {
		extTest=reportCreateTestCase("confirmButton");
		alertObj.frameClick(extTest);
	}
	@Test(priority=10,groups="Regression2")
	public void frame1() throws Throwable {
		extTest=reportCreateTestCase("confirmButton");
		alertObj.frame1(extTest);
	}
	@Test(priority=11,groups="Regression2")
	public void frame2() throws Throwable {
		extTest=reportCreateTestCase("confirmButton");
		alertObj.frame2(extTest);
	}

}
