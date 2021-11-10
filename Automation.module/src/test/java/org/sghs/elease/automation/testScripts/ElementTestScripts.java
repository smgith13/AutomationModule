package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.webPages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import java.io.IOException;

import org.sghs.elease.automation.utiities.GlobalFunctions;
import org.sghs.elease.automation.utiities.Reporter;

public class ElementTestScripts extends BaseTest {

	private ElementsPage EpObj;

	@BeforeClass(alwaysRun=true)
	public void goToElementsTab() {
		extTest=reportCreateTestCase("goToElementsTab");
		lpObj.goToElementsTab(extTest);
	}

	@BeforeMethod(alwaysRun=true)
	public void ElementsPage() {
		extTest=reportCreateTestCase("ElementsPage");
		EpObj = new ElementsPage(driver, gbObj);
	}

	@Test(priority=1,groups="Regression")
	public void clicktextBox() {
		extTest=reportCreateTestCase("clicktextBox");
		EpObj.clicktextBox(extTest);
	}

	@Test(priority=1,groups="sendActions")
	public void sendFullName() {
		extTest=reportCreateTestCase("sendFullName");
		EpObj.sendFullName(extTest);
	}

	@Test(priority=2,groups="sendActions")
	public void sendEmail() {
		extTest=reportCreateTestCase("sendEmail");
		EpObj.sendEmail(extTest);
	}

	@Test(priority=3,groups="sendActions")
	public void sendCurrentAddress() {
		extTest=reportCreateTestCase("sendCurrentAddress");
		EpObj.sendCurrentAddress(extTest);
	}

	@Test(priority=4,groups="sendActions")
	public void sendPermanentAddress() {
		extTest=reportCreateTestCase("sendPermanentAddress");
		EpObj.sendPermanentAddress(extTest);
	}

	@Test(priority=5,groups="Regression")
	public void clickSubmit() {
		extTest=reportCreateTestCase("clickSubmit");
		EpObj.clickSubmit(extTest);
	}

	@Test(priority=6,groups="Regression")
	public void clickcheckBox() {
		extTest=reportCreateTestCase("clickcheckBox");
		EpObj.clickcheckBox(extTest);
	}

	@Test(priority=7,groups="Regression")
	public void clickExpand() {
		extTest=reportCreateTestCase("clickExpand");
		EpObj.clickExpand(extTest);
	}

	@Test(priority=8,groups="Regression")
	public void clickPublicCheck() {
		extTest=reportCreateTestCase("clickPublicCheck");
		EpObj.clickPublicCheck(extTest);
	}

	@Test(priority=9,groups="Regression")
	public void clickCollapseBox() {
		extTest=reportCreateTestCase("clickCollapseBox");
		EpObj.clickCollapseBox(extTest);
	}

	// EpObj.clickRadioButton();
	// EpObj.clickImpressivebutton();
	// EpObj.getRadioButtonText();
	@Test(priority=10,groups="Regression")
	public void clickWebTables() {
		extTest=reportCreateTestCase("clickWebTables");
		EpObj.clickWebTables(extTest);
		Assert.assertEquals(true, false);
	}
	@Test(priority=11,dependsOnMethods="clickWebTables",groups="Regression")
	public void clickAddButton() {
		extTest=reportCreateTestCase("clickAddButton");
		EpObj.clickAddButton(extTest);
	}

	@Test(priority=12,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendFirstName() {
		extTest=reportCreateTestCase("sendFirstName");
		EpObj.sendFirstName(extTest);
	}

	@Test(priority=13,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendLastName() {
		extTest=reportCreateTestCase("sendLastName");
		EpObj.sendLastName(extTest);
	}

	@Test(priority=14,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendage() {
		extTest=reportCreateTestCase("sendage");
		EpObj.sendage(extTest);
	}

	@Test(priority=15,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendSalary() {
		extTest=reportCreateTestCase("sendSalary");
		EpObj.sendSalary(extTest);
	}

	@Test(priority=16,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendDepartment() {
		extTest=reportCreateTestCase("sendDepartment");
		EpObj.sendDepartment(extTest);
	}

	@Test(priority=17,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendEmailTable() {
		extTest=reportCreateTestCase("sendEmailTable");
		EpObj.sendEmailTable(extTest);
	}

	@Test(priority=18,dependsOnMethods="clickWebTables",groups="Regression")
	public void clicksubmitTable() {
		extTest=reportCreateTestCase("clicksubmitTable");
		EpObj.clicksubmitTable(extTest);
	}
	@Test(priority=19,groups="Regression")
	public void clickbuttons() {
		extTest=reportCreateTestCase("clickbuttons");
		EpObj.clickbuttons(extTest);
	}
	@Test(priority=20,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickdoubleClickMe() {
		extTest=reportCreateTestCase("clickdoubleClickMe");
		EpObj.clickdoubleClickMe(extTest);

	}
	@Test(priority=21,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickrightclickMe() {
		extTest=reportCreateTestCase("clickrightclickMe");
		EpObj.clickrightclickMe(extTest);
	}
	@Test(priority=22,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickClickMe() {
		extTest=reportCreateTestCase("clickClickMe");
		EpObj.clickClickMe(extTest);
	}
	@Test(priority=23,groups="Regression")
	public void clicklinks() {
		extTest=reportCreateTestCase("clicklinks");
		EpObj.clicklinks(extTest);
	}
//	@Test(priority=24,dependsOnMethods="clicklinks",groups="Regression")
//	public void clickHome() {
//		Reporter.startReport("clickHome");
//		EpObj.clickHome();
//	}
//	@Test(priority=25,dependsOnMethods="clicklinks",groups="Regression")
//	public void clickHome8icZX() {
//		Reporter.startReport("clickHome8icZX");
//		EpObj.clickHome8icZX();
//	}
	@Test(priority=26,dependsOnMethods="clicklinks",groups="Regression")
	public void clickCreated() {
		extTest=reportCreateTestCase("clickCreated");
		EpObj.clickCreated(extTest);
	}
	@Test(priority=27,dependsOnMethods="clicklinks",groups="Regression")
	public void clickNoContent() {
		extTest=reportCreateTestCase("clickNoContent");
		EpObj.clickNoContent(extTest);
	}
	@Test(priority=28,dependsOnMethods="clicklinks",groups="Regression")
	public void clickMoved() {
		extTest=reportCreateTestCase("clickMoved");
		EpObj.clickMoved(extTest);
	}
	@Test(priority=29,dependsOnMethods="clicklinks",groups="Regression")
	public void clickBadRequest() {
		extTest=reportCreateTestCase("clickBadRequest");
		EpObj.clickBadRequest(extTest);
	}
	@Test(priority=30,dependsOnMethods="clicklinks",groups="Regression")
	public void clickUnauthorized() {
		extTest=reportCreateTestCase("clickUnauthorized");
		EpObj.clickUnauthorized(extTest);
	}
	@Test(priority=31,dependsOnMethods="clicklinks",groups="Regression")
	public void forbidden() {
		extTest=reportCreateTestCase("Forbidden");
		EpObj.Forbidden(extTest);
	}
	@Test(priority=32,dependsOnMethods="clicklinks",groups="Regression")
	public void notFound() {
		extTest=reportCreateTestCase("NotFound");
		EpObj.NotFound(extTest);
	}
	@Test(priority=33,groups="Regression")
	public void brokenLinksAndImage() throws IOException, Throwable {
		extTest=reportCreateTestCase("brokenLinksAndImage");
		EpObj.brokenLinksAndImage(extTest);
	}
	
	@Test(priority=34,groups="Regression")
	public void validLink() throws IOException, Throwable {
		extTest=reportCreateTestCase("ValidLinks");
		EpObj.validLink(extTest);
	}
	
	@Test(priority=35,groups="Regression")
	public void uploadAnddownload() {
		extTest=reportCreateTestCase("uploadAnddownload");
		EpObj.uploadAnddownload(extTest);
	}
	@Test(priority=36,groups="Regression")
	public void download() throws IOException, Throwable {
		extTest=reportCreateTestCase("download");
		EpObj.download(extTest);
	}
	@Test(priority=37,groups="Regression")
	public void upload() throws Throwable {
		extTest=reportCreateTestCase("upload");
		EpObj.upload(extTest);
	}
	
	@Test(priority=38,groups="Regression")
	public void dynamicProperties() {
		extTest=reportCreateTestCase("dynamicProperties");
		EpObj.dynamicProperties(extTest);
	}
	@Test(priority=39,groups="Regression")
	public void Enabled() {
		extTest=reportCreateTestCase("upload");
		EpObj.enableAfter(extTest);
	}
	@Test(priority=40,groups="Regression")
	public void visibleAfter5sec() {
		extTest=reportCreateTestCase("visibleAfter5sec");
		EpObj.visibleAfter5sec(extTest);
	}
}
