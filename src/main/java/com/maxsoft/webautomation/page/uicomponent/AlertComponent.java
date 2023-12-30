package com.maxsoft.webautomation.page.uicomponent;

import com.maxsoft.webautomation.page.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class AlertComponent extends BasePage {
    public AlertComponent(WebDriver driver) {
        super(driver);
    }

    public Alert switchToAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }
}
