package org.sghs.elease.automation.utiities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter {

	static ExtentReports extReport;
	static ExtentTest extTest;
	public static void loadReport() {
		extReport=new ExtentReports("C:\\Users\\aa\\git\\AutomationUpdate\\html.html");
		
		extReport.loadConfig(new File("C:\\Users\\aa\\git\\AutomationUpdate\\loadcongif.xml"));
	}
	public static void startReport(String description) {
		extTest=extReport.startTest(description);
	}
	public static void passReport() {
		extTest.log(LogStatus.PASS, "Success I married you");
	}
	public static void flushReport() {
		extReport.flush();
	}
	public static void failReport() {
		extTest.log(LogStatus.FAIL, "Dayum");
	}
}
