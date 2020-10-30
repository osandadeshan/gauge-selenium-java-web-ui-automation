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

public class NavigationBar extends Base {

    @FindBy(xpath = "//a[@title='Log me out']")
    private WebElement LINK_SIGN_OUT;

    public NavigationBar() {
        WebDriver driver = Driver.driver;
        PageFactory.initElements(driver, this);
    }

    public void signOut(){
        clickElement(LINK_SIGN_OUT);
    }
}
