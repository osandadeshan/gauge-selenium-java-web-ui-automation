package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : web-cross-browser-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 3/13/2020
 * Time            : 6:28 AM
 * Description     :
 **/


public class CommonStepImpl {

    private WebDriver driver = Driver.driver;

    @Step("Page title is <pageTitle>")
    public void isPageTitleEquals(String pageTitle) {
        Assert.assertEquals("Expected page title is not equal to the actual page title!\n", pageTitle, driver.getTitle());
    }


}
