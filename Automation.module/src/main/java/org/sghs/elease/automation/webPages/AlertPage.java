package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class AlertPage {

	Properties alertPageLocators;
	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	//Webpage elements Page factory element.
	@FindBy(xpath="(//*[@id='item-1'])[2]")
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
	

	{
		alertPageLocators = GlobalFunctions.FileLoader("alertPagelocators");

//		clickButtonToseeAlert = alertPageLocators.getProperty("clickButtonToseeAlert");
//		timerAlertButton = alertPageLocators.getProperty("timerAlertButton");
//		confirmButton = alertPageLocators.getProperty("confirmButton");
//		promtButton = alertPageLocators.getProperty("promtButton");
//		confirmResult = alertPageLocators.getProperty("confirmResult");
	}

	public AlertPage(WebDriver driver, GlobalFunctions gbObj) {
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void sideAlertClick() {
		gbObj.scroll();
		gbObj.clickElement(alertClick);
	}
	public void clickButtonToSeeAlert() {
		
		gbObj.clickElement(clickButtonToseeAlert);
		gbObj.alertAccept();
	}
	public void timerAlertButton() {
		
		gbObj.clickElement(timerAlertButton);
		try {
		gbObj.wait(500);
		}catch(InterruptedException e) {
			e.getMessage();
		}
		gbObj.alertAccept();
	}
	public void confirmButton() {
		
		gbObj.clickElement(confirmButton);
		gbObj.alertDismiss();
		gbObj.getText(confirmResult);
	}
	public void promtButton() {
		gbObj.clickElement(promtButton);
		gbObj.alertsendKeys();
		gbObj.alertAccept();
	
	}
	
}
