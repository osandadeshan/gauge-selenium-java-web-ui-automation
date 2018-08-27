package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.FlightFinderPage;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/


public class FlightFinderPageStepImpl {

    private WebDriver driver = Driver.driver;
    private FlightFinderPage flightFinderPagePage = PageFactory.initElements(driver, FlightFinderPage.class);

    @Step("Page title is <pageTitle>")
    public void isPageTitleEquals(String pageTitle) {
        Assert.assertEquals("Page title differs!\n", pageTitle, flightFinderPagePage.getPageTitle());
    }

    @Step("Sign out from the application")
    public void signOut(){
        flightFinderPagePage.signOut();
    }


}
