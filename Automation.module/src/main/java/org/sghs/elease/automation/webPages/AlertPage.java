package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.sghs.elease.automation.utiities.GlobalFunctions;

public class AlertPage {

	Properties alertPageLocators;
	private WebDriver driver;
	private GlobalFunctions gbObj;
	String alertclick;
	String clickButtonToseeAlert;
	String timerAlertButton;
	String confirmButton;
	String promtButton;
	String confirmResult;
	{
		alertPageLocators = GlobalFunctions.FileLoader("alertPagelocators");
		alertclick = alertPageLocators.getProperty("alertclick");
		clickButtonToseeAlert = alertPageLocators.getProperty("clickButtonToseeAlert");
		timerAlertButton = alertPageLocators.getProperty("timerAlertButton");
		confirmButton = alertPageLocators.getProperty("confirmButton");
		promtButton = alertPageLocators.getProperty("promtButton");
		confirmResult = alertPageLocators.getProperty("confirmResult");
	}

	public AlertPage(WebDriver driver, GlobalFunctions gbObj) {
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void sideAlertClick() {
		gbObj.scroll();
		gbObj.clickElement(alertclick);
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
