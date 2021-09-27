package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.webPages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.sghs.elease.automation.utiities.GlobalFunctions;
import org.sghs.elease.automation.utiities.Reporter;

public class ElementTestScripts extends BaseTest {

	private ElementsPage EpObj;

	@BeforeClass(alwaysRun=true)
	public void goToElementsTab() {
		lpObj.goToElementsTab();
	}

	@BeforeMethod(alwaysRun=true)
	public void ElementsPage() {
		EpObj = new ElementsPage(gbObj.getDriver(), gbObj);
		System.out.println("beforemethod on elementTextpage");
	}

	@Test(priority=1,groups="Regression")
	public void clicktextBox() {
		Reporter.startReport("clicktextBox");
		Reporter.passReport();
		EpObj.clicktextBox();
	}

	@Test(priority=1,groups="sendActions")
	public void sendFullName() {
		EpObj.sendFullName();
	}

	@Test(priority=2,groups="sendActions")
	public void sendEmail() {
		EpObj.sendEmail();
	}

	@Test(priority=3,groups="sendActions")
	public void sendCurrentAddress() {
		EpObj.sendCurrentAddress();
	}

	@Test(priority=4,groups="sendActions")
	public void sendPermanentAddress() {
		EpObj.sendPermanentAddress();
	}

	@Test(priority=5,groups="Regression")
	public void clickSubmit() {
		Reporter.startReport("clickSubmit");
		Reporter.failReport();
		EpObj.clickSubmit();
	}

	@Test(priority=6,groups="Regression")
	public void clickcheckBox() {
		Reporter.startReport("clickcheckBox");
		Reporter.passReport();
		EpObj.clickcheckBox();
	}

	@Test(priority=7,groups="Regression")
	public void clickExpand() {
		Reporter.startReport("clickExpand");
		Reporter.passReport();
		EpObj.clickExpand();
	}

	@Test(priority=8,groups="Regression")
	public void clickPublicCheck() {
		Reporter.startReport("clickPublicCheck");
		EpObj.clickPublicCheck();
	}

	@Test(priority=9,groups="Regression")
	public void clickCollapseBox() {
		Reporter.startReport("clickCollapseBox");
		EpObj.clickCollapseBox();
	}

	// EpObj.clickRadioButton();
	// EpObj.clickImpressivebutton();
	// EpObj.getRadioButtonText();
	@Test(priority=10,groups="Regression")
	public void clickWebTables() {
		Reporter.startReport("clickWebTables");
		EpObj.clickWebTables();
		Assert.assertEquals(true, false);
	}
	@Test(priority=11,dependsOnMethods="clickWebTables",groups="Regression")
	public void clickAddButton() {
		Reporter.startReport("clickAddButton");
		EpObj.clickAddButton();
	}

	@Test(priority=12,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendFirstName() {
		EpObj.sendFirstName();
	}

	@Test(priority=13,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendLastName() {
		EpObj.sendLastName();
	}

	@Test(priority=14,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendage() {
		EpObj.sendage();
	}

	@Test(priority=15,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendSalary() {
		EpObj.sendSalary();
	}

	@Test(priority=16,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendDepartment() {
		EpObj.sendDepartment();
	}

	@Test(priority=17,dependsOnMethods="clickWebTables",groups="sendActions")
	public void sendEmailTable() {
		EpObj.sendEmailTable();
	}

	@Test(priority=18,dependsOnMethods="clickWebTables",groups="Regression")
	public void clicksubmitTable() {
		Reporter.startReport("clicksubmitTable");
		EpObj.clicksubmitTable();
	}
	@Test(priority=19,groups="Regression")
	public void clickbuttons() {
		Reporter.startReport("clickbuttons");
		EpObj.clickbuttons();
	}
	@Test(priority=20,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickdoubleClickMe() {
		Reporter.startReport("clickdoubleClickMe");
		EpObj.clickdoubleClickMe();

	}
	@Test(priority=21,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickrightclickMe() {
		Reporter.startReport("clickdoubleClickMe");
		EpObj.clickrightclickMe();
	}
	@Test(priority=22,dependsOnMethods="clickbuttons",groups="Regression")
	public void clickClickMe() {
		Reporter.startReport("clickClickMe");
		EpObj.clickClickMe();
	}
	@Test(priority=23,groups="Regression")
	public void clicklinks() {
		Reporter.startReport("clicklinks");
		EpObj.clicklinks();
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
		Reporter.startReport("clickCreated");
		EpObj.clickCreated();
	}
	@Test(priority=27,dependsOnMethods="clicklinks",groups="Regression")
	public void clickNoContent() {
		Reporter.startReport("clickNoContent");
		EpObj.clickNoContent();
	}
	@Test(priority=28,dependsOnMethods="clicklinks",groups="Regression")
	public void clickMoved() {
		Reporter.startReport("clickMoved");
		EpObj.clickMoved();
	}
	@Test(priority=29,dependsOnMethods="clicklinks",groups="Regression")
	public void clickBadRequest() {
		Reporter.startReport("clickBadRequest");
		EpObj.clickBadRequest();
	}
	@Test(priority=30,dependsOnMethods="clicklinks",groups="Regression")
	public void clickUnauthorized() {
		Reporter.startReport("clickUnauthorized");
		EpObj.clickUnauthorized();
	}
	@Test(priority=31,dependsOnMethods="clicklinks",groups="Regression")
	public void Forbidden() {
		Reporter.startReport("Forbidden");
		EpObj.Forbidden();
	}
	@Test(priority=32,dependsOnMethods="clicklinks",groups="Regression")
	public void NotFound() {
		Reporter.startReport("NotFound");
		EpObj.NotFound();
	}
	
}
