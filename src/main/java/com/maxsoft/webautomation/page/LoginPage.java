package com.maxsoft.webautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
    }

    private void inputUsername(String email) {
        sendKeys(By.id("loginusername"), email);
    }

    private void inputPassword(String password) {
        sendKeys(By.id("loginpassword"), password);
    }

    private void clickLoginButton() {
        click(By.xpath("//button[@onclick='logIn()']"));
    }
}
