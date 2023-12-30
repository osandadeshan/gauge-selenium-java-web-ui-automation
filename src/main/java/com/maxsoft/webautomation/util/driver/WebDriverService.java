package com.maxsoft.webautomation.util.driver;

import org.openqa.selenium.WebDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public interface WebDriverService {
    void spinUpDriver();

    void closeDriver();

    WebDriver getDriver();
}
