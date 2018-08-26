package com.maxsoft.webautomation.util.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String IE = "ie";
    private static final String EDGE = "edge";
    private static final String SAFARI = "safari";

    private static WebDriver driver;

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required BROWSER can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html

    public static WebDriver getDriver() {
        if (BROWSER == null) {
            ChromeDriverManager.getInstance().setup();
            return new ChromeDriver();
        }
        switch (BROWSER.toLowerCase())
        {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                return new ChromeDriver();
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                return new FirefoxDriver();
            case IE:
                InternetExplorerDriverManager.getInstance().setup();
                return new InternetExplorerDriver();
            case EDGE:
                EdgeDriverManager.getInstance().setup();
                return new EdgeDriver();
            case SAFARI:
                driver = new SafariDriver();
                return new SafariDriver();
            default:
                ChromeDriverManager.getInstance().setup();
                return new ChromeDriver();
        }
    }


}
