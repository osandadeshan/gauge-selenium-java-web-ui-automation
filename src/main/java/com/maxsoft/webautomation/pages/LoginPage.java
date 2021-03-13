package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.SeleniumWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.maxsoft.webautomation.common.Constants.APP_URL;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class LoginPage extends SeleniumWrapper {

    @FindBy(id = "email")
    private WebElement TXT_EMAIL;

    @FindBy(id = "passwd")
    private WebElement TXT_PASSWORD;

    @FindBy(id = "SubmitLogin")
    private WebElement BTN_SIGN_IN;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToLoginPage() {
        driver.get(APP_URL);
    }

    public void login(String email, String password) {
        inputText(TXT_EMAIL, email);
        inputText(TXT_PASSWORD, password);
        clickElement(BTN_SIGN_IN);
    }
}
