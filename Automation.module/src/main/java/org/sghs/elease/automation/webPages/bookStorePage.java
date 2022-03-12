package org.sghs.elease.automation.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class bookStorePage {
	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[1]")
	private WebElement textBoxClick;
	
	
	public void ElementsPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj = gbObj;
	}
}
