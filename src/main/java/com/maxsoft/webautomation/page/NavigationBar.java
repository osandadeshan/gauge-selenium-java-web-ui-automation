package com.maxsoft.webautomation.page;

import com.maxsoft.webautomation.common.constant.NavigationBarOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class NavigationBar extends BasePage {
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public WebElement getNavigationOptionElement(String navigationBarOption) {
        return getElement(
                By.xpath(
                        "//a[@class='nav-link'][contains(.,'" + navigationBarOption + "')]"
                )
        );
    }

    public void clickOnNavOption(NavigationBarOption navigationBarOption) {
        getNavigationOptionElement(navigationBarOption.getName()).click();
    }

    public String getGreetingMessage() {
        return getText(By.id("nameofuser"));
    }
}
