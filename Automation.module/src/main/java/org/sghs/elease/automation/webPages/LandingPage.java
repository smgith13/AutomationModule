package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

import com.aventstack.extentreports.ExtentTest;

public class LandingPage  {

	Properties landpageprop;
    WebDriver driver=null;
	@FindBy(xpath="//*[text()='Alerts, Frame & Windows']")
	private WebElement frameAlertTab;
	
	@FindBy(xpath="//*[text()='Forms']")
	private WebElement FormsTab;
	
	@FindBy(xpath="//*[text()='Elements']")
	WebElement ElementsTab;
	
	GlobalFunctions gbObj;

	/**This is landingpage consturtor
	 * @param driver - this is coming from BeforeSuite after launch driver
	 * @param gbObj - To use web interactions
	 */
	public LandingPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj=gbObj;
	}

	public void goToalertTab(ExtentTest ext) {
		
		gbObj.scroll();
		gbObj.findIframe();
		gbObj.waitForElementToBeClickable(driver, frameAlertTab);
		gbObj.clickElement(frameAlertTab,ext,"frameAlertTab");
	}
	public void goToFormsTab(ExtentTest ext) {
		gbObj.scroll();
		gbObj.waitForElementToBeClickable(driver, FormsTab);
		gbObj.clickElement(FormsTab,ext,"FormsTab");
	}
	public void goToElementsTab(ExtentTest ext) {
		gbObj.getPageTitle(ext," Element tab page title ");
		gbObj.scroll();
		gbObj.clickElement(ElementsTab,ext," Element Tab ");
	}
}
