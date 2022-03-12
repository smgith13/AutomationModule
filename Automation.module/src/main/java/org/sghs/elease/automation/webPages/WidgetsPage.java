package org.sghs.elease.automation.webPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sghs.elease.automation.utiities.GlobalFunctions;

import com.aventstack.extentreports.ExtentTest;

public class WidgetsPage {
	
	
	private WebDriver driver;
	private GlobalFunctions gbObj;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[2]")
	private WebElement autoComplete;
	
	@FindBy(xpath="(//*[@id='autoCompleteMultiple']/descendant::div)[3]")
	private WebElement multipleColournames;
	
	@FindBy(xpath="(//*[@class='auto-complete__value-container css-1hwfws3'])")
	private WebElement singleColournames;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[3]")
	private WebElement datePicker;
	
	@FindBy(xpath="(//*[@class='datePickerMonthYearInput'])")
	private WebElement monthYearInput;
	
	@FindBy(xpath="(//*[@class='react-datepicker__month-select'])")
	private WebElement monthInput;
	
	@FindBy(xpath="(//*[@class='react-datepicker__year-select '])")
	private WebElement YearInput;
	
	@FindBy(xpath="(//*[@class='react-datepicker__month']/div[text()='13'])")
	private WebElement dateInput;
	
	@FindBy(xpath="(//*[@class='react-datepicker__time-container ']/li[text()='15:00'])")
	private WebElement timeInput;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[4]")
	private WebElement slider;
	
	@FindBy(xpath="(//*[@id='sliderContainer']/div[text()='55'])")
	private WebElement stopAtslider;
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[5]")
	private WebElement progressBar;
	
	@FindBy(xpath="(//*[@id='startStopButton'])")
	private WebElement startButton;
	
	@FindBy(xpath="(//*[@id='startStopButton'])")
	private WebElement stopButton;
	
	
	@FindBy(xpath="(//*[@class='element-list collapse show']/descendant::li)[7]")
	private WebElement toolsTip;
	
	@FindBy(xpath="(//*[@id='toolTipButton'])")
	private WebElement toolTipButton;
	
	@FindBy(xpath="(//*[@id='toolTipTextField'])")
	private WebElement toolTipTextField;
	
	
	
	public WidgetsPage(WebDriver driver, GlobalFunctions gbObj) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.gbObj = gbObj;
	}
	public void clicktextBox(ExtentTest ext) {
		gbObj.scroll();
		gbObj.dropdownSelection(multipleColournames, "Red",ext,"clicklinks");
		gbObj.dropdownSelection(multipleColournames, "yellow",ext,"clicklinks");
}
}
