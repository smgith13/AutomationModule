package org.sghs.elease.automation.testScripts;

import org.openqa.selenium.WebDriver;
import org.sghs.elease.automation.utiities.GlobalFunctions;
import org.sghs.elease.automation.utiities.Reporter;
import org.sghs.elease.automation.webPages.LandingPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest extends GlobalFunctions {
	GlobalFunctions gbObj;
	protected LandingPage lpObj;
	Reporter Reporter;
	public ExtentTest extTest;
	ExtentReports extent;


	@BeforeSuite(alwaysRun = true)
	public void globalFuctions() {
		gbObj = new GlobalFunctions();
		extent = Reporter.startReport("Jano");
		driver = gbObj.launchDriver("grid");
		gbObj.getApplicationUrl();
	}

	@BeforeTest(alwaysRun = true)
	public void landingPage() {
		lpObj = new LandingPage(driver, gbObj);

	}

	@AfterSuite(alwaysRun = true)
	public void teardown() {

		gbObj.tearDown();
		Reporter.flushTest();
	}
}
