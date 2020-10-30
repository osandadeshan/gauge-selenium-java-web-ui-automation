package com.maxsoft.webautomation.common;

import com.maxsoft.webautomation.util.driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public abstract class Base {

    protected static String URL = System.getenv("application_endpoint");
    private final WebDriver driver = Driver.driver;

    public Base() {
        PageFactory.initElements(driver, this);
    }

    protected void waitUntilElementIsClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void inputText(WebElement element, String text){
        waitUntilElementIsClickable(element);
        element.sendKeys(text);
    }

    protected void clickElement(WebElement element){
        waitUntilElementIsClickable(element);
        element.click();
    }

    protected void clickElementByJavascriptExecutor(String xpath){
        WebElement element=driver.findElement(By.xpath(xpath));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", element);
    }

    protected void clickLink(WebElement element){
        waitUntilElementIsVisible(element);
        element.click();
    }

    protected String getText(WebElement element){
        waitUntilElementIsVisible(element);
        return element.getText();
    }

    protected void freeze(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
