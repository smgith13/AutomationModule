package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.webPages.AlertPage;
import org.sghs.elease.automation.webPages.FormsPage;
import org.sghs.elease.automation.webPages.LandingPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class RunForms extends BaseTest {

	   private FormsPage fpObj;
	    
	   @BeforeClass(alwaysRun=true)
		public void goToFormsTab() {
		extTest=reportCreateTestCase("goToFormsTab");
		lpObj.goToFormsTab(extTest);
		}
	   @BeforeMethod(alwaysRun=true)
		public void FormsPage() {
		   extTest=reportCreateTestCase("FormsPage");
			fpObj = new FormsPage(driver, gbObj);
		}
	   @Test(priority=1,groups="Regression1")
		public void sidePractiseForm() {
			extTest=reportCreateTestCase("sidePractiseForm");
			fpObj.sidePractiseForm(extTest);
			}
	   @Test(priority=2,groups="Regression1")
		public void sendfirstName() {
			extTest=reportCreateTestCase("sendfirstName");
			fpObj.sendfirstName(extTest);
			}
	   @Test(priority=2,groups="Regression1")
		public void sendLastName() {
			extTest=reportCreateTestCase("sendLastName");
			fpObj.sendLastName(extTest);
			}
	   @Test(priority=3,groups="Regression1")
		public void senduserNumber() {
			extTest=reportCreateTestCase("senduserNumber");
			fpObj.senduserNumber(extTest);
			}
	   @Test(priority=4,groups="Regression1")
		public void senduserEmail() {
			extTest=reportCreateTestCase("senduserEmail");
			fpObj.senduserEmail(extTest);
			}
	   @Test(priority=5,groups="Regression1")
		public void clickgender() {
			extTest=reportCreateTestCase("clickgender");
			fpObj.clickgender(extTest);
			}
		
		
	
	}


