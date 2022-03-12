package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

import com.aventstack.extentreports.ExtentTest;

public class AlertPage {


	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	//Webpage elements Page factory element.
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[1]")
	private WebElement sidebrowserWindow;
	//*[@class='element-list collapse show']/descendant::li
	
	@FindBy(xpath="(//*[@id='tabButton'])")
	private WebElement newtab;
	
	@FindBy(xpath="(//*[@id='sampleHeading'])")
	private WebElement newtabChildText;
	
	//*[@id='sampleHeading']
	@FindBy(xpath="(//*[@id='windowButton'])")
	private WebElement newWindow;
	
	@FindBy(xpath="(//*[@id='messageWindowButton'])")
	private WebElement newWindowMessage;
	
	
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[2]")
	private WebElement alertClick;
	
	@FindBy(xpath="(//*[@id='alertButton'])")
	private WebElement clickButtonToseeAlert;
	
	@FindBy(xpath="(//*[@id='timerAlertButton'])")
	private WebElement timerAlertButton;
	
	@FindBy(xpath="(//*[@id='confirmButton'])")
	private WebElement confirmButton;
	
	@FindBy(xpath="(//*[@id='promtButton'])")
	private WebElement promtButton;
	
	@FindBy(xpath="(//*[@id='confirmResult'])")
	private WebElement confirmResult;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[3]")
	private WebElement frameClick;
	
	@FindBy(xpath="(//*[@id='frame1'])")
	private WebElement frame1;
	
	@FindBy(xpath="(//*[@id='frame2'])")
	private WebElement frame2;

	@FindBy(xpath="(//*[@id='sampleHeading'])")
	private WebElement frame1Text;
	
	@FindBy(xpath="(//*[@id='sampleHeading'])")
	private WebElement frame2Text;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[5]")
	private WebElement modalClick;
	
	@FindBy(xpath="(//*[@id='showSmallModal'])")
	private WebElement smallModal;
	
	@FindBy(xpath="(//*[@id='showLargeModal'])")
	private WebElement largeModal;
	


	public AlertPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void sideBrowserwindow(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(sidebrowserWindow,ext,"sidebrowserWindow");
	}
	
	
    public void newtab(ExtentTest ext) {
		
		gbObj.clickElement(newtab,ext,"newtab");
		gbObj.switchToChildWindow();
		gbObj.getText(newtabChildText, ext, "newtabChildText"); 
		gbObj.closeNewOpenWindow();
		
	}
	
 public void newWindow(ExtentTest ext) {
		gbObj.clickElement(newWindow,ext,"newWindow");
		gbObj.switchToChildWindow();
		gbObj.getText(newtabChildText, ext, "newtabChildText"); 
		gbObj.closeNewOpenWindow();
		gbObj.switchToMainWindow();
		
		
	}
 
 public void newWindowMessage(ExtentTest ext) {
		
		gbObj.clickElement(newWindowMessage,ext,"newWindowMessage");
		gbObj.switchToChildWindow();
		gbObj.closeNewOpenWindow();
		gbObj.switchToMainWindow();
		
	}
	
	public void sideAlertClick(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(alertClick,ext,"sideAlertClick");
	}
	public void clickButtonToSeeAlert(ExtentTest ext) {
		
		gbObj.clickElement(clickButtonToseeAlert,ext,"clickButtonToSeeAlert");
		gbObj.alertAccept();
	}
	public void timerAlertButton(ExtentTest ext) {
		
		gbObj.clickElement(timerAlertButton,ext,"timerAlertButton");
		try {
		gbObj.wait(500);
		}catch(InterruptedException e) {
			e.getMessage();
		}
		gbObj.alertAccept();
	}
	public void confirmButton(ExtentTest ext) {
		
		gbObj.clickElement(confirmButton,ext,"confirmButton");
		gbObj.alertDismiss();
		gbObj.getText(confirmResult,ext,"confirmResult");
	}
	public void promtButton(ExtentTest ext) {
		gbObj.clickElement(promtButton,ext,"promtButton");
		gbObj.alertsendKeys();
		gbObj.alertAccept();
	
	}
	public void frameClick(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(frameClick,ext,"frameClick");
	}
	
	public void frame1(ExtentTest ext) throws Throwable {
		gbObj.switchframe(frame1,ext,"frame1");
		gbObj.getText(frame1Text,ext,"frame1Text");
		gbObj.switchback();
	}
	public void frame2(ExtentTest ext) throws Throwable  {
		//gbObj.framejseClick(frame2, ext, "frame2");
		gbObj.switchframe(frame2,ext,"frame2");
		gbObj.scroll();
		gbObj.getText(frame2Text,ext,"frame2Text");
	}
	
}
