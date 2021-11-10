package org.sghs.elease.automation.utiities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class GlobalFunctions extends BrowserFactory {

	static String userdir = System.getProperty("user.dir") + "//testConfigResources";
	String name = "janor";
	static FileInputStream fileInput;
	static Properties prop;
	static Properties prop1;
	static String TestProperties;
	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions options;
	Screenshot screenshot;
	Actions actions;
	String parentWindow;
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
		String path = userdir + "//pageElementLocators//" + TestProperties + ".properties";
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

	public WebDriver launchDriver(String runOn) {
		String key = prop1.getProperty("driverKey");
		System.setProperty(key, System.getProperty("user.dir") + "\\driver" + "\\chromedriver.exe");
		// System.setProperty("driverKey",userdir+"chromedriver.exe");

		if (runOn.equalsIgnoreCase("driverManager")) {
			WebDriverManager.chromedriver().setup();
			options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
		} else if (runOn.equalsIgnoreCase("grid")) {
			System.out.println("selecting grid");
			String Node = "http://192.168.0.54:8060/wd/hub";
			DesiredCapabilities cap = new DesiredCapabilities();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}

	public String getApplicationUrl() {
		String url = prop1.getProperty("alertLinkUrl");
		driver.get(url);
		// getDriver().get(url);
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the AmazonProp.properties file.");

	}

	public void getPageTitle(ExtentTest ext, String strElementDesc) {
		try {
			driver.getTitle();
			System.out.println("Page title : " + driver.getTitle());
			reportPassStep(ext, strElementDesc + "  PageTitle reached ");
		} catch (Exception e) {
			reportFailStep(ext, strElementDesc + "  PageTitle reached  " + e.getMessage());
		}

	}

	public void clickElement(WebElement locator, ExtentTest ext, String strElementDesc) {
		try {
			locator.click();
			reportPassStep(ext, strElementDesc + "  Clicked on element ");
		} catch (Exception e) {
			reportFailStep(ext, strElementDesc + "  Clicked on element " + e.getMessage());
		}
	}

	public boolean isEnabled(WebElement locator, ExtentTest ext, String strElementDesc) {
		try {
			locator.isEnabled();
			reportPassStep(ext, strElementDesc + "  Clicked on element ");

		} catch (Exception e) {
			reportFailStep(ext, strElementDesc + "  Failed to Click on element " + e.getMessage());
			return false;
		}
		return true;
	}

	public boolean isDisplayed(WebElement locator, ExtentTest ext, String strElementDesc) {
		try {
			locator.isDisplayed();
			reportPassStep(ext, strElementDesc + "  Clicked on element ");

		} catch (Exception e) {
			reportFailStep(ext, strElementDesc + "  Failed to Click on element " + e.getMessage());
			return false;
		}
		return true;
	}

	public void waitForElement(WebDriver driver, WebElement text) {
		try {
			wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.presenceOfElementLocated((By) text));
		} catch (Exception e) {
		}

	}

	public void waitForElementToBeClickable(WebDriver driver, WebElement text) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(text));

	}

	public void pause(Integer milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToBeVisible(WebDriver driver, WebElement text) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(text));

	}

	public void findIframe() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of Iframe : " + size);
	}

	public void scroll() {
		System.out.println("Printed here : " + name);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
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

	public void getText(WebElement locator, ExtentTest ext, String strElementDesc) {

		System.out.println("getText: " + locator.getText());
	}

	public void sendText(WebElement locator, String value, ExtentTest ext, String strElementDesc) {

		locator.sendKeys(value);
	}

	public void tearDown() {
		driver.close();
	}

	public void jseClick(WebElement locator, ExtentTest ext, String strElementDesc) {

		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", locator);
	}
	
	public void framejseClick(WebElement locator, ExtentTest ext, String strElementDesc) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",locator);
	}

	public boolean jseExecutor(WebElement locator, ExtentTest ext, String strElementDesc) {

		boolean obj = (boolean) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].hasAttribute(\"disabled\");", locator);
		return obj;
	}

	public void takeScreenshot() {
		try {
			screenshot = new AShot().takeScreenshot(driver);
			screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
			String dateAsString = simpleDateFormat.format(new Date());
			ImageIO.write(screenshot.getImage(), "jpg",
					new File(System.getProperty("user.dir") + "\\AutomationUpdate\\" + dateAsString + ".jpg"));
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}

	}

	// mouse click funtions
	public void doubleClick(WebElement locator, ExtentTest ext, String strElementDesc) {
		actions = new Actions(driver);
		actions.doubleClick(locator).perform();
	}

	public void rightclick(WebElement locator, ExtentTest ext, String strElementDesc) {
		actions = new Actions(driver);
		actions.contextClick(locator).perform();
	}

	public void switchToChildWindow() {
		String catchChildWindow = null;
		parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		Iterator<String> itr = childWindow.iterator();
		while (itr.hasNext()) {

			catchChildWindow = itr.next();
		}
		if (!parentWindow.equals(catchChildWindow)) {
			driver.switchTo().window(catchChildWindow);
		}

	}

	public void closeNewOpenWindow() {

		driver.close();
		switchToMainWindow();
	}
	
	public void switchframe(WebElement locator, ExtentTest ext, String strElementDesc) throws InterruptedException {
		driver.switchTo().frame(locator);
	}
	
	public void switchback() {
		driver.switchTo().parentFrame();
	}

	public void switchToMainWindow() {

		if (parentWindow != null) {
			driver.switchTo().window(parentWindow);
		}
	}

//	//synchronized is related to multi threading
//	programming in java basically the thread tried to wait or 
//	to notify other threads 
//	waiting on that monitor causing it to failed.
	public synchronized void sleep() {
		try {
			driver.wait(7000);
			// Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void brokenlist(List<WebElement> brokenLinks2) throws Throwable, IOException {

		List<WebElement> activeLinks = new ArrayList<WebElement>();
		System.out.println("size " + brokenLinks2.size());
		for (int i = 0; i < brokenLinks2.size(); i++) {
			System.out.println(
					"*****************printing href*****************::" + brokenLinks2.get(i).getAttribute("href"));
			System.out.println(
					"*****************printing src*****************::" + brokenLinks2.get(i).getAttribute("src"));
			if (brokenLinks2.get(i).getAttribute("href") != null
					&& (!brokenLinks2.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(brokenLinks2.get(i));
			}
		}

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + response);

		}
	}

//	public void uploadfile()
//	

}
