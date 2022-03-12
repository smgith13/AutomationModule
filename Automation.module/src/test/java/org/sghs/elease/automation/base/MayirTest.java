/**package org.sghs.elease.automation.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.sghs.elease.automation.utiities.GlobalFunctions;
//import org.sghs.elease.automation.utiities.APITesting.InitializeAPIClasses;
import org.sghs.elease.automation.utiities.InitializePages;

public class MayirTest extends GlobalFunctions {

	@BeforeSuite
	public void initialize() throws Exception {
		extent = startReport("testTryMax");
		initializeDriver("chrome");
	}

	@AfterSuite
	public void clear() throws Exception {

		flushTest();
	}

}
*/