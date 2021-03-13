package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.SeleniumWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class NavigationBar extends SeleniumWrapper {

    @FindBy(xpath = "//a[@title='Log me out']")
    private WebElement LINK_SIGN_OUT;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void signOut() {
        clickElement(LINK_SIGN_OUT);
    }
}
