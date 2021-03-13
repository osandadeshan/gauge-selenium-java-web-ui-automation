package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.LoginPage;
import com.maxsoft.webautomation.util.driver.DriverHolder;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class LoginPageStepImpl {

    private final LoginPage loginPage = PageFactory.initElements(DriverHolder.driver, LoginPage.class);

    @Step("On login page")
    public void navigateToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @Step("Login to the application using the email as <email> and password as <password>")
    public void login(String email, String password) {
        loginPage.login(email, password);
    }
}