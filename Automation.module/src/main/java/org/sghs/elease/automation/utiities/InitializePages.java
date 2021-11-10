package org.sghs.elease.automation.utiities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.sghs.elease.automation.webPages.LandingPage;

 

/**

* @author Author E-mail:

* @version Creation time: Aug 13, 2021 11:34:05 AM

* Class Description

* this is where all the UI pages are initialized

*/

public class InitializePages extends GlobalFunctions{

 public LandingPage landingPage;
 
 public InitializePages(ThreadLocal<RemoteWebDriver> driver) {
// landingPage=new LandingPage(driver);


 }

}

