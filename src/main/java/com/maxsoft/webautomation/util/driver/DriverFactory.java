package com.maxsoft.webautomation.util.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class DriverFactory {

    private static final String BROWSER = System.getenv("browser");
    private static final String WINDOW_WIDTH = System.getenv("window_width");
    private static final String WINDOW_HEIGHT = System.getenv("window_height");
    private static final String HEADLESS_CHROME = "headless-chrome";
    private static final String FIREFOX = "firefox";
    private static final String HEADLESS_FIREFOX = "headless-firefox";
    private static final String IE = "ie";
    private static final String EDGE = "edge";
    private static final String SAFARI = "safari";
    private static final String WINDOW_SIZE = "--window-size=" + WINDOW_WIDTH + "x" + WINDOW_HEIGHT;

    public static WebDriver getDriver() {
        if (BROWSER == null) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        switch (BROWSER.toLowerCase()) {
            case HEADLESS_CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("start-maximized"); // Open Browser in maximized mode
                chromeOptions.addArguments("disable-infobars"); // Disabling info bars
                chromeOptions.addArguments("--disable-extensions"); // Disabling extensions
                chromeOptions.addArguments("--disable-gpu"); // Applicable to windows os only
                chromeOptions.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
                chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case HEADLESS_FIREFOX:
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                firefoxBinary.addCommandLineOptions(WINDOW_SIZE);
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver(firefoxOptions);
            case IE:
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }
}
