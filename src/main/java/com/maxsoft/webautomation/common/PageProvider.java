package com.maxsoft.webautomation.common;

import com.maxsoft.webautomation.page.BasePage;
import com.maxsoft.webautomation.page.LoginPage;
import com.maxsoft.webautomation.page.NavigationBar;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : gauge-java-web-ui-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 29/12/23
 * Time            : 10:22 PM
 * Description     :
 **/

public class PageProvider extends BasePage {
    public PageProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver);
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }
}
