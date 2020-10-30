package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.LoginPage;
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

public class LoginPageStepImpl {

    private final WebDriver driver = Driver.driver;
    private final LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Step("On login page")
    public void navigateToLogin(){
        loginPage.navigateToLogin();
    }

    @Step("Login to the application using the email as <email> and password as <password>")
    public void login(String email, String password){
        loginPage.login(email, password);
    }
}