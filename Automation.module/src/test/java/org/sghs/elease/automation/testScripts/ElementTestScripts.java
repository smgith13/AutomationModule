package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.webPages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class ElementTestScripts extends BaseTest {

	ElementsPage EpObj;

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
		EpObj.clickSubmit();
	}

	@Test(priority=6,groups="Regression")
	public void clickcheckBox() {
		EpObj.clickcheckBox();
	}

	@Test(priority=7,groups="Regression")
	public void clickExpand() {
		EpObj.clickExpand();
	}

	@Test(priority=8,groups="Regression")
	public void clickPublicCheck() {
		EpObj.clickPublicCheck();
	}

	@Test(priority=9,groups="Regression")
	public void clickCollapseBox() {
		EpObj.clickCollapseBox();
	}

	// EpObj.clickRadioButton();
	// EpObj.clickImpressivebutton();
	// EpObj.getRadioButtonText();
	@Test(priority=10,groups="Regression")
	public void clickWebTables() {
		EpObj.clickWebTables();
		Assert.assertEquals(true, false);
	}
	@Test(priority=11,dependsOnMethods="clickWebTables",groups="Regression")
	public void clickAddButton() {
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
		EpObj.clicksubmitTable();

	}
}
