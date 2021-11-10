package org.sghs.elease.automation.utiities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter {


	public static ExtentReports extent;

	public static String reportName = null;

	public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	public static ExtentTest test1;

	// loading property files using ReadProperties- which is in the same package

	// and doesntneed initiatlization

	protected static Properties prop = ReadProperties.loadProperties("Config", "null");
	protected static Properties runtimeprop = ReadProperties.loadProperties("runtimeConfig", "null");
	public static final String ReportPath = System.getProperty("user.dir") + "//TestOutput//Execution-Report"

			+ new SimpleDateFormat("ddMMyyyyHHmm").format(new Date());

	/*
	 * 
	 * All methods of this class are defined below
	 * 
	 */

	public static synchronized ExtentReports startReport(String strClient) {

		reportName = strClient + "_Report.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter((ReportPath + "\\" + reportName));
		String extentConfig = System.getProperty("user.dir") + "//testConfigResources//loadcongif.xml";
		sparkReporter.loadXMLConfig(extentConfig);
		sparkReporter.config().setDocumentTitle(strClient + " Execution Report");
		extent = new ExtentReports();
		extent.setSystemInfo("Execution environment", runtimeprop.getProperty("env"));
		extent.setSystemInfo("Run Description", runtimeprop.getProperty("rundescription"));
		extent.attachReporter(sparkReporter);

		return extent;
	}
	public ExtentTest reportCreateTestCase(String msg) {
		ExtentTest createReport = extent.createTest(msg);
		return createReport;

	}

	public void reportInfoStep(ExtentTest createReport, String msg) {

		createReport.log(Status.INFO, msg);
		

	}

	public void reportPassStep(ExtentTest createReport, String msg) {

		createReport.pass(msg+": Success");

	}

	public void reportFailStep(ExtentTest createReport, String msg) {

		createReport.fail(msg+": Failed ");

	}

	public void createTest() {

		test1 = extent.createTest("test");

	}

	public void flushTest() {

		extent.flush();

	}

	// check https://www.youtube.com/watch?v=tovz1q5Unxs-

	// https://www.youtube.com/watch?v=CC_8mn91uKU

}
