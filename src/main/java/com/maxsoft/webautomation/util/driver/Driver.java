package com.maxsoft.webautomation.util.driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/


public class Driver {

    // Holds the WebDriver instance
    public static WebDriver driver;

    // Initialize a driver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the driver
    @BeforeSuite
    public void initializeDriver(){
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    // Close the driver instance
    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }


}
