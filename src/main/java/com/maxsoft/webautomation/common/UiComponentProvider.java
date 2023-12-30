package com.maxsoft.webautomation.common;

import com.maxsoft.webautomation.page.BasePage;
import com.maxsoft.webautomation.page.uicomponent.AlertComponent;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : gauge-java-web-ui-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 29/12/23
 * Time            : 10:22 PM
 * Description     :
 **/

public class UiComponentProvider extends BasePage {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertComponent getAlertComponent() {
        return new AlertComponent(driver);
    }
}
