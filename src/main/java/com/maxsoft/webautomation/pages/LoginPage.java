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


public class LoginPage extends Base {

    private static String LoginPageUrl = URL;
    private WebDriver driver = Driver.driver;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement TXT_USERNAME;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement TXT_PASSWORD;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement BTN_SIGN_IN;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToLogin(){
        driver.get(LoginPageUrl);
    }

    public void login(String username, String password){
        inputText(TXT_USERNAME, username);
        inputText(TXT_PASSWORD, password);
        clickElement(BTN_SIGN_IN);
    }


}
