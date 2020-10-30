package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.NavigationBar;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
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

public class NavigationBarStepImpl {

    private final WebDriver driver = Driver.driver;
    private final NavigationBar navigationBar = PageFactory.initElements(driver, NavigationBar.class);

    @Step("Sign out from the application")
    public void signOut(){
        navigationBar.signOut();
    }
}
