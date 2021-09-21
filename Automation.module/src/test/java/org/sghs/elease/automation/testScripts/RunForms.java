package org.sghs.elease.automation.testScripts;

import org.sghs.elease.automation.webPages.FormsPage;
import org.sghs.elease.automation.webPages.LandingPage;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class RunForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalFunctions gbObj=new GlobalFunctions();
		gbObj.launchDriver();
		gbObj.getApplicationUrl();
		LandingPage lpObj=new LandingPage(gbObj.getDriver(), gbObj);
		lpObj.goToFormsTab();
		FormsPage fpObj=new FormsPage(gbObj.getDriver(),gbObj);
		fpObj.sidePractiseForm();
		fpObj.sendfirstName();
		fpObj.sendLastName();
		fpObj.senduserNumber();
		fpObj.senduserEmail();
		fpObj.clickgender();
	}

}
