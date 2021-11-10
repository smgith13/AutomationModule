package org.sghs.elease.automation.utiities;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserFactory extends CreateGrid {

	//protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	WebDriver driver=null;
	public static String URL = null;
	private static String runOn = prop.getProperty("runOn");
	public static final String localhubURL = prop.getProperty("localhubURL");

	public WebDriver initializeDriver(String browser) {

		URL hub = null;
		try {
			hub = new URL(getURL());
		} catch (MalformedURLException e) {
			System.out.println("Error while forming url, check stack trace : " + e.getMessage());
			e.printStackTrace();
		}

		driver=new RemoteWebDriver(hub, getCapability(browser));
//		driver.set(new RemoteWebDriver(hub, getCapability(browser)));
		return driver;
	}

//	public WebDriver getDriver() {
//
//		return driver.get();
//
//	}

	public static Capabilities getCapability(String browser) {

		Capabilities capabilities = null;

		if (runOn.equalsIgnoreCase("grid")) {
			if (browser.equalsIgnoreCase("IE")) {
				capabilities = getIEOptions();
			} else if (browser.equalsIgnoreCase("chrome")) {
				capabilities = getChromeOptions();
			} else {

				capabilities = new EdgeOptions();

			}

		} else if (runOn.equalsIgnoreCase("browserstack")) {
			if (browser.equalsIgnoreCase("IE")) {
				// capabilities = getIECapabilities();
			} else if (browser.equalsIgnoreCase("chrome")) {
				// capabilities = getChromeCapabilities();

			}

		}

		return capabilities;

	}

	public String getURL() {

		System.out.println(
				"*****************************************************************************************************");
		if (runOn.equalsIgnoreCase("grid")) {
			URL = localhubURL;
		} else if (runOn.equalsIgnoreCase("browserstack")) {

			// startBSLocal();

			// URL = BSHubURL;

		}
		return URL;

	}

	public static InternetExplorerOptions getIEOptions() {
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();

		return options;

	}

	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		if (prop.getProperty("Headless").equalsIgnoreCase("Yes")) {
			options.addArguments("--no-sandbox");
			options.addArguments("--headless");
			options.addArguments("disable-gpu");

		} else {

			options.addArguments("--start-maximized");
			// options.addArguments("--ignore-certificate-errors");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");

		}

		return options;

	}

}