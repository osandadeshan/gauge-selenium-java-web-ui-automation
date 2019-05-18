package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.Base;
import com.maxsoft.webautomation.util.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/


public class FlightFinderPage extends Base {

    private WebDriver driver = Driver.driver;

    @FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
    private WebElement LINK_SIGN_OUT;


    public FlightFinderPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void signOut(){
        clickElement(LINK_SIGN_OUT);
    }


}
