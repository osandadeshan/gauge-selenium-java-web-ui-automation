package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.util.driver.DriverHolder;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Project Name    : web-cross-browser-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 3/13/2020
 * Time            : 6:28 AM
 * Description     :
 **/

public class CommonStepImpl {

    private final WebDriver driver = DriverHolder.driver;

    @Step("Page title is <pageTitle>")
    public void checkPageTitle(String pageTitle) {
        assertEquals(pageTitle, driver.getTitle());
    }
}
