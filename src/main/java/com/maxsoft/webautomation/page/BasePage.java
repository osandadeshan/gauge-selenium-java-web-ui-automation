package com.maxsoft.webautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.maxsoft.webautomation.common.constant.ApplicationConstants.EXPLICIT_WAIT_IN_SECONDS;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class BasePage {
    public static WebDriver driver;
    public final WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, EXPLICIT_WAIT_IN_SECONDS);
    }

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilElementClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(By by) {
        waitUntilElementClickable(by);
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }

    public String getText(By by) {
        waitUntilElementVisible(by);
        return driver.findElement(by).getText();
    }

    public WebElement getElement(By by) {
        waitUntilElementVisible(by);
        return driver.findElement(by);
    }
}
