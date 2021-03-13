package com.maxsoft.webautomation.util.driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class DriverHolder {

    // Holds the WebDriver instance
    public static WebDriver driver;

    // Initialize a driver instance of required browser
    @BeforeScenario
    public void initializeDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    // Close the driver instance
    @AfterScenario
    public void closeDriver() {
        driver.quit();
    }
}
