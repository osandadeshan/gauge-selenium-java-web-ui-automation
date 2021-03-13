package com.maxsoft.webautomation.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.maxsoft.webautomation.common.Constants.TIMEOUT_ELEMENT_CLICKABLE;
import static com.maxsoft.webautomation.common.Constants.TIMEOUT_ELEMENT_VISIBLE;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class SeleniumWrapper {

    public final WebDriver driver;

    public SeleniumWrapper(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitUntilElementIsClickable(WebElement element) {
        new WebDriverWait(driver, TIMEOUT_ELEMENT_CLICKABLE).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitUntilElementIsVisible(WebElement element) {
        new WebDriverWait(driver, TIMEOUT_ELEMENT_VISIBLE).until(ExpectedConditions.visibilityOf(element));
    }

    protected void inputText(WebElement element, String text) {
        waitUntilElementIsClickable(element);
        element.sendKeys(text);
    }

    protected void clickElement(WebElement element) {
        waitUntilElementIsClickable(element);
        element.click();
    }

    protected void clickElementByJavascriptExecutor(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click()", element);
    }

    protected void clickLink(WebElement element) {
        waitUntilElementIsVisible(element);
        element.click();
    }

    protected String getText(WebElement element) {
        waitUntilElementIsVisible(element);
        return element.getText();
    }
}
