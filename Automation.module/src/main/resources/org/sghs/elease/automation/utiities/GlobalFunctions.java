package org.sghs.elease.automation.utiities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalFunctions {

	static String userdir = System.getProperty("user.dir") + "//testConfigResources";
	static FileInputStream fileInput;
	static Properties prop;
	static Properties prop1;
	static String TestProperties;
	protected WebDriver driver;
	WebDriverWait wait;
	ChromeOptions options;
	private final String propertyfilepath = userdir + "//Config.properties";

	public GlobalFunctions() {
		File file;
		try {
			fileInput = new FileInputStream(file = new File(propertyfilepath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop1 = new Properties();
		try {
			prop1.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Properties FileLoader(String TestProperties) {
		File file;
		String path = userdir + "//pageElementLocators//"+ TestProperties + ".properties";
		try {
			fileInput = new FileInputStream(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}

	public void launchDriver() {
		String key = prop1.getProperty("driverKey");
		System.setProperty(key, System.getProperty("user.dir")+"\\driver" + "\\chromedriver.exe");
		//System.setProperty("driverKey",userdir+"chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		
	}

	// public String getDriverPath(){
	// String driverPath = prop.getProperty("driverPath");
	// if(driverPath!= null) return driverPath;
	// else throw new RuntimeException("driverPath not specified in the
	// AmazonProp.properties file.");
	// }
	public String getApplicationUrl() {
		String url = prop1.getProperty("alertLinkUrl");
		driver.get(url);
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the AmazonProp.properties file.");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void clickElement(String locator) {
		driver.findElement(By.xpath(locator)).click();

	}

	public void waitForElement(WebDriver driver, String text) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(text)));

	}

	public void waitForElementToBeClickable(WebDriver driver, String text) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(text)));

	}

	public void findIframe() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of Iframe : " + size);
	}

	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
	}

	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public void alertGetText() {
		driver.switchTo().alert().getText();
	}

	public void alertsendKeys() {
		driver.switchTo().alert().sendKeys("jano");
	}

	public void getText(String locator) {

		System.out.println(driver.findElement(By.xpath(locator)).getText());
	}
	public void sendText(String locator,String value) {

	driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	public void tearDown() {
		driver.close();
	}
	public void jseClick(String locator) {
	WebElement st_1 = driver.findElement(By.id(locator));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", st_1);
}
}