package org.sghs.elease.automation.webPages;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

import com.aventstack.extentreports.ExtentTest;

public class ElementsPage {
	
	
	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	//Page Factory method
	
	
	//@FindBy(how=How.TAG_NAME,using="a")
	//List<WebElement> links1;
	
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
	
	@FindBy(xpath="(//*[@class='rct-checkbox'][11])")
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
	
	@FindBy(xpath="(//*[@id='linkWrapper']/descendant::a)[1]")
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
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li)[7]")
	private WebElement brokenLinksAndImage;
	
	//Broken link validation
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::a)")
	private List<WebElement> brokenLinks;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li[8])")
	private WebElement uploadAnddownload;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::div/div/a)")
	private WebElement download;
	
	@FindBy(xpath="(//*[@class='form-file']/descendant::input")
	private WebElement chooseFile;
	
	@FindBy(xpath="(//*[@id='uploadFile'])")
	private WebElement upload;
	
	
	@FindBy(xpath="(//*[@id='linkResponse'])")
	private WebElement linkResponse;
	
	
	@FindBy(xpath="(//*[@id='doubleClickMessage'])")
	private WebElement doubleClickMessage;
	
	@FindBy(xpath="(//*[@id='rightClickMessage'])")
	private WebElement rightClickMessage;
	
	@FindBy(xpath="(//*[@id='dynamicClickMessage'])")
	private WebElement dynamicClickMessage;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[1]")
	private WebElement enableAfter;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[2]")
	private WebElement colourChange;
	
	@FindBy(xpath="(//*[@class='col-12 mt-4 col-md-6']/descendant::button)[3]")
	private WebElement visibleAfter5sec;
	
	@FindBy(xpath="(//*[@class='element-group']/descendant::li[9])")
	private WebElement dynamicProperties;
	
	

	public ElementsPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void clicktextBox(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(textBoxClick, ext ,"TextBox");
	}
	public void sendFullName(ExtentTest ext) {
		gbObj.sendText(fullName,"Monisha Mathias", ext, "sendFullName");
	}
	public void sendEmail(ExtentTest ext) {
		gbObj.sendText(email,"MonishaJanorees@yahoo.com", ext, "sendEmail");
	}
	public void sendCurrentAddress(ExtentTest ext) {
		gbObj.sendText(currentAddress,"231 Nayakkar street,vallioor,Tamil Nadu", ext, "sendCurrentAddress");
	}
	public void sendPermanentAddress(ExtentTest ext) {
		gbObj.sendText(permanentAddress,"6 Megan Avenue scarborough", ext, "sendPermanentAddress");
	}
	public void clickSubmit(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(submit,ext ,"submit");
	}
	public void clickcheckBox(ExtentTest ext) {
		gbObj.clickElement(checkBox, ext ,"clickcheckBox");
	}
	public void clickExpand(ExtentTest ext) {
		gbObj.clickElement(expandBox, ext ,"clickExpand");
	}
	public void clickPublicCheck(ExtentTest ext) {
		gbObj.clickElement(publicCheck, ext ,"clickPublicCheck");
	}
	public void clickCollapseBox(ExtentTest ext) {
		gbObj.clickElement(CollapseBox, ext ,"clickCollapseBox");
	}
	public void clickRadioButton(ExtentTest ext) {
		gbObj.clickElement(radioButton, ext ,"clickRadioButton");
	}
	public void clickImpressivebutton(ExtentTest ext) {
		gbObj.clickElement(impressivebutton, ext ,"clickImpressivebutton");
	}
	public void getRadioButtonText(ExtentTest ext) {
		gbObj.getText(getText, ext ,"getRadioButtonText");
	}
	public void clickWebTables(ExtentTest ext) {
		gbObj.clickElement(webTables, ext ,"clickWebTables");
		gbObj.takeScreenshot();
	}
	public void clickAddButton(ExtentTest ext) {
		gbObj.clickElement(addButton, ext ,"clickAddButton");
	}
	public void sendFirstName(ExtentTest ext) {
		gbObj.sendText(firstName,"Monisha", ext, "sendFirstName");
	}
	public void sendLastName(ExtentTest ext) {
		gbObj.sendText(lastName,"Jano", ext, "sendLastName");
	}
	public void sendEmailTable(ExtentTest ext) {
		gbObj.sendText(emailTable,"MonishaJanorees@yahoo.com", ext, "sendEmailTable");
	}
	public void sendage(ExtentTest ext) {
		gbObj.sendText(age,"22", ext, "sendage");
	}
	public void sendSalary(ExtentTest ext) {
		gbObj.sendText(salary,"1000", ext, "sendSalary");
	}
	public void sendDepartment(ExtentTest ext) {
		gbObj.sendText(department,"ECE", ext, "sendDepartment");
	}
	public void clicksubmitTable(ExtentTest ext) {
		gbObj.clickElement(submitTable, ext ,"clicksubmitTable");
	}
	public void clickbuttons(ExtentTest ext) {
		gbObj.clickElement(buttons, ext ,"clickbuttons");
	}
	public void clickdoubleClickMe(ExtentTest ext) {
		gbObj.doubleClick(doubleClickMe, ext ,"clickdoubleClickMe");
		gbObj.getText(doubleClickMessage, ext ,"doubleClickMessage");

	}
	public void clickrightclickMe(ExtentTest ext) {
		gbObj.rightclick(rightclickMe, ext ,"clickrightclickMe");
		gbObj.getText(rightClickMessage, ext ,"rightClickMessage");
	}
	public void clickClickMe(ExtentTest ext) {
		gbObj.clickElement(ClickMe, ext ,"clickClickMe");
		gbObj.getText(dynamicClickMessage, ext ,"dynamicClickMessage");
	}
	public void clicklinks(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(links, ext ,"clicklinks");
	}
	
	public void clickHome(ExtentTest ext) {
		gbObj.clickElement(home, ext ,"clickHome");
		gbObj.switchToChildWindow();
		gbObj.getPageTitle(ext, "clickHome");
		gbObj.switchToMainWindow();
	}
	public void clickHome8icZX(ExtentTest ext) {
		gbObj.clickElement(hometG1Kc, ext ,"clickHome8icZX");
		gbObj.getText(hometG1Kc, ext ,"hometG1Kc");
	}
	public void clickCreated(ExtentTest ext) {
		gbObj.clickElement(created, ext ,"clickCreated");
		gbObj.sleep();
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void clickNoContent(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(noContent, ext ,"clickNoContent");
		gbObj.sleep();
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void clickMoved(ExtentTest ext) {
		gbObj.clickElement(moved, ext ,"clickMoved");
		gbObj.sleep();
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void clickBadRequest(ExtentTest ext) {
		gbObj.clickElement(badRequest, ext ,"clickBadRequest");
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void clickUnauthorized(ExtentTest ext) {
		gbObj.clickElement(unauthorized, ext ,"clickUnauthorized");
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void Forbidden(ExtentTest ext) {
		gbObj.clickElement(forbidden, ext ,"Forbidden");
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void NotFound(ExtentTest ext) {
		gbObj.clickElement(notFound, ext ,"NotFound");
		gbObj.getText(linkResponse, ext ,"linkResponse");
	}
	public void brokenLinksAndImage(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(brokenLinksAndImage, ext ,"brokenLinksAndImage");
	}
	public void validLink(ExtentTest ext) throws IOException, Throwable {
		gbObj.brokenlist(brokenLinks);
		
	}
	public void uploadAnddownload(ExtentTest ext) {
		gbObj.scroll();
		gbObj.clickElement(uploadAnddownload, ext ,"uploadAnddownload");
		
	}
	public void download(ExtentTest ext) throws IOException, Throwable {
		gbObj.clickElement(download, ext ,"download");
		System.out.println("File is download Successfully");

	}
	public void upload(ExtentTest ext) throws Throwable {
		gbObj.clickElement(upload, ext ,"upload");
		Runtime.getRuntime().exec("C:\\Users\\aa\\Desktop\\Java Workspace\\Downloads\\fileUpload.exe");
		//gbObj.sendText(upload, "C:\\fakepath\\sampleFile (3).jpeg", ext, "upload");
		System.out.println("File is Uploaded Successfully");
	}
	public void dynamicProperties(ExtentTest ext) {
		gbObj.scroll();
		gbObj.findIframe();
		gbObj.waitForElementToBeClickable(driver, dynamicProperties);
		gbObj.clickElement(dynamicProperties, ext ,"dynamicProperties");
	}
	public void enableAfter(ExtentTest ext) {
	
		System.out.println("Element in Grey: " + gbObj.jseExecutor(enableAfter, ext, "enableAfter"));
		String colour=colourChange.getCssValue("color");
		System.out.println("colour is: "+colour);
		System.out.println("Element is Visible: "+gbObj.isEnabled(visibleAfter5sec, ext, "visibleAfter5sec"));
		gbObj.pause(5000);
		
}
	public void visibleAfter5sec(ExtentTest ext) {
		System.out.println("Element in Grey " + gbObj.jseExecutor(enableAfter, ext, "enableAfter"));
		String colour=colourChange.getCssValue("color");
		System.out.println("colour is: "+colour);
		System.out.println("Element is Visible: "+gbObj.isEnabled(visibleAfter5sec, ext, "visibleAfter5sec"));
	}		
}
