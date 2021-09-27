package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.utiities.GlobalFunctions;
import org.sghs.elease.automation.utiities.Reporter;
import org.sghs.elease.automation.webPages.LandingPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	GlobalFunctions gbObj;
	LandingPage lpObj;

	@BeforeSuite(alwaysRun=true)
	public void globalFuctions() {
		gbObj = new GlobalFunctions();
		gbObj.launchDriver();
		gbObj.getApplicationUrl();
		Reporter.loadReport();
		//Reporter.startReport();
		//Reporter.passReport();
		
	}
@BeforeTest(alwaysRun=true)
	public void landingPage() {
		lpObj = new LandingPage(gbObj.getDriver(), gbObj);
		
	}


	@AfterSuite(alwaysRun=true)
	public void teardown() {
		gbObj.tearDown();
		Reporter.flushReport();
	}
}
