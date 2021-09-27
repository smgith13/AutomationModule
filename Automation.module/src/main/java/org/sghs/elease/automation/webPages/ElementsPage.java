package org.sghs.elease.automation.webPages;

import java.awt.Desktop.Action;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

public class ElementsPage {
	
	
	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	//Page Factory method
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[1]")
	private WebElement textBoxClick;
	
	@FindBy(xpath="(//*[@id='userName'])")
	private WebElement fullName;
	
	@FindBy(xpath="(//*[@id='userEmail'])")
	private WebElement email;
	
	@FindBy(xpath="(//*[@id='currentAddress'])")
	private WebElement currentAddress;
	
	@FindBy(xpath="(//*[@id='permanentAddress'])")
	private WebElement permanentAddress;
	
	@FindBy(xpath="(//*[@id='submit'])")
	private WebElement submit;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[2]")
	private WebElement checkBox;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[3]")
	private WebElement radioButton;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[4]")
	private WebElement webTables;
	
	@FindBy(xpath="(//*[@title='Expand all'])")
	private WebElement expandBox;
	
	@FindBy(xpath="(//*[@title='Collapse all'])")
	private WebElement CollapseBox;
	
	@FindBy(xpath="(//*[@class='rct-checkbox'])[11]")
	private WebElement publicCheck;
	
	@FindBy(xpath="(//*[@id='impressiveRadio'])")
	private WebElement impressivebutton;
	
	@FindBy(xpath="(//*[@class='mt-3'])")
	private WebElement getText;
	
	@FindBy(xpath="(//*[@id='addNewRecordButton'])")
	private WebElement addButton;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[1]")
	private WebElement firstName;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[2]")
	private WebElement lastName;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[3]")
	private WebElement emailTable;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[4]")
	private WebElement age;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[5]")
	private WebElement salary;
	
	@FindBy(xpath="(//*[@id='userForm']/descendant::input)[6]")
	private WebElement department;
	
	@FindBy(xpath="(//*[@class='text-right col-md-2 col-sm-12'])")
	private WebElement submitTable;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[5]")
	private WebElement buttons;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[1]")
	private WebElement doubleClickMe;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[2]")
	private WebElement rightclickMe;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[3]")
	private WebElement ClickMe;

	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[6]")
	private WebElement links;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::h5)[1]")
	private WebElement linksOpenNewTab;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[1])")
	private WebElement home;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[2]")
	private WebElement hometG1Kc;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::h5)[2]")
	private WebElement linksSendApiCall;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[3]")
	private WebElement created;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[4]")
	private WebElement noContent;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[5]")
	private WebElement moved;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[6]")
	private WebElement badRequest;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[7]")
	private WebElement unauthorized;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[8]")
	private WebElement forbidden;
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[9]")
	private WebElement notFound;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[8]")
	private WebElement uploadAnddownload;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::a)")
	private WebElement download;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::input)")
	private WebElement chooseFile;
	
	
	@FindBy(xpath="(//*[@id='linkResponse'])")
	private WebElement linkResponse;
	
	
	@FindBy(xpath="(//*[@id='doubleClickMessage'])")
	private WebElement doubleClickMessage;
	
	@FindBy(xpath="(//*[@id='rightClickMessage'])")
	private WebElement rightClickMessage;
	
	@FindBy(xpath="(//*[@id='dynamicClickMessage'])")
	private WebElement dynamicClickMessage;
	{
		Properties elementPagelocators = GlobalFunctions.FileLoader("elementpagelocators");
//		 textBoxClick = elementPagelocators.getProperty("textBox");
//		 fullName = elementPagelocators.getProperty("fullName");
//		 email = elementPagelocators.getProperty("email");

	}

	public ElementsPage(WebDriver driver, GlobalFunctions gbObj) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.gbObj = gbObj;
	}
	public void clicktextBox() {
		gbObj.scroll();
		gbObj.clickElement(textBoxClick);
	}
	public void sendFullName() {
		gbObj.sendText(fullName,"Monisha Mathias");
	}
	public void sendEmail() {
		gbObj.sendText(email,"MonishaJanorees@yahoo.com");
	}
	public void sendCurrentAddress() {
		gbObj.sendText(currentAddress,"231 Nayakkar street,vallioor,Tamil Nadu");
	}
	public void sendPermanentAddress() {
		gbObj.sendText(permanentAddress,"6 Megan Avenue scarborough");
	}
	public void clickSubmit() {
		gbObj.scroll();
		gbObj.clickElement(submit);
	}
	public void clickcheckBox() {
		gbObj.clickElement(checkBox);
	}
	public void clickExpand() {
		gbObj.clickElement(expandBox);
	}
	public void clickPublicCheck() {
		gbObj.clickElement(publicCheck);
	}
	public void clickCollapseBox() {
		gbObj.clickElement(CollapseBox);
	}
	public void clickRadioButton() {
		gbObj.clickElement(radioButton);
	}
	public void clickImpressivebutton() {
		gbObj.clickElement(impressivebutton);
	}
	public void getRadioButtonText() {
		gbObj.getText(getText);
	}
	public void clickWebTables() {
		gbObj.clickElement(webTables);
		gbObj.takeScreenshot();
	}
	public void clickAddButton() {
		gbObj.clickElement(addButton);
	}
	public void sendFirstName() {
		gbObj.sendText(firstName,"Monisha");
	}
	public void sendLastName() {
		gbObj.sendText(lastName,"Jano");
	}
	public void sendEmailTable() {
		gbObj.sendText(emailTable,"MonishaJanorees@yahoo.com");
	}
	public void sendage() {
		gbObj.sendText(age,"22");
	}
	public void sendSalary() {
		gbObj.sendText(salary,"1000");
	}
	public void sendDepartment() {
		gbObj.sendText(department,"ECE");
	}
	public void clicksubmitTable() {
		gbObj.clickElement(submitTable);
	}
	public void clickbuttons() {
		gbObj.clickElement(buttons);
	}
	public void clickdoubleClickMe() {
		gbObj.doubleClick(doubleClickMe);
		gbObj.getText(doubleClickMessage);

	}
	public void clickrightclickMe() {
		gbObj.rightclick(rightclickMe);
		gbObj.getText(rightClickMessage);
	}
	public void clickClickMe() {
		gbObj.clickElement(ClickMe);
		gbObj.getText(dynamicClickMessage);
	}
	public void clicklinks() {
		gbObj.scroll();
		gbObj.clickElement(links);
	}
	
	public void clickHome() {
		gbObj.clickElement(home);
		gbObj.switchToChildWindow();
		gbObj.getPageTitle();
		gbObj.switchToMainWindow();
	}
	public void clickHome8icZX() {
		gbObj.clickElement(hometG1Kc);
		gbObj.getText(hometG1Kc);
	}
	public void clickCreated() {
		gbObj.clickElement(created);
		gbObj.sleep();
		gbObj.getText(linkResponse);
	}
	public void clickNoContent() {
		gbObj.scroll();
		gbObj.clickElement(noContent);
		gbObj.sleep();
		gbObj.getText(linkResponse);
	}
	public void clickMoved() {
		gbObj.clickElement(moved);
		gbObj.sleep();
		gbObj.getText(linkResponse);
	}
	public void clickBadRequest() {
		gbObj.clickElement(badRequest);
		gbObj.getText(linkResponse);
	}
	public void clickUnauthorized() {
		gbObj.clickElement(unauthorized);
		gbObj.getText(linkResponse);
	}
	public void Forbidden() {
		gbObj.clickElement(forbidden);
		gbObj.getText(linkResponse);
	}
	public void NotFound() {
		gbObj.clickElement(notFound);
		gbObj.getText(linkResponse);
	}
	
	
}
