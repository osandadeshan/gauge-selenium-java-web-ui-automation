package com.maxsoft.webautomation.util.driver;

import java.security.InvalidParameterException;

import static com.maxsoft.webautomation.common.constant.BrowserConstants.*;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class WebDriverFactory {
    private static final String BROWSER_NAME = System.getenv("browser");

    public WebDriverService getDriverService() {
        WebDriverService driver;

        switch (BROWSER_NAME) {
            case CHROME:
                driver = new ChromeDriverServiceImpl();
                break;
            case HEADLESS_CHROME:
                driver = new HeadlessChromeDriverServiceImpl();
                break;
            case FIREFOX:
                driver = new FirefoxDriverServiceImpl();
                break;
            case HEADLESS_FIREFOX:
                driver = new HeadlessFirefoxDriverServiceImpl();
                break;
            case EDGE:
                driver = new EdgeDriverServiceImpl();
                break;
            case IE:
                driver = new InternetExplorerDriverServiceImpl();
                break;
            case SAFARI:
                driver = new SafariDriverServiceImpl();
                break;

            default:
                throw new InvalidParameterException("'" + BROWSER_NAME + "' browser is not implemented");
        }

        return driver;
    }
}
