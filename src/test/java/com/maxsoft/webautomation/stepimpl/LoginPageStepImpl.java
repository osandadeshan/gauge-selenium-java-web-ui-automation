package com.maxsoft.webautomation.stepimpl;

import com.thoughtworks.gauge.Step;

import static com.maxsoft.webautomation.common.constant.NavigationBarOption.LOG_IN;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class LoginPageStepImpl extends BaseStepImpl {
    @Step("On login page")
    public void navigateToLoginPage() {
        pages().getNavigationBar()
                .clickOnNavOption(LOG_IN);
    }

    @Step("Login to the application using the username as <username> and password as <password>")
    public void login(String username, String password) {
        pages().getLoginPage()
                .login(username, password);
    }

    @Step("Logged-in username should be <username>")
    public void checkLoggedInUsername(String username) {
        assertEquals(
                "Welcome " + username,
                pages().getNavigationBar()
                        .getGreetingMessage()
        );
    }

    @Step("Wrong password error alert should be visible")
    public void checkInvalidPasswordErrorMessage() {
        assertEquals(
                "Wrong password.",
                uiComponents().getAlertComponent().switchToAlert().getText()
        );
    }
}