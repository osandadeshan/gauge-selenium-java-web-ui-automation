package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.common.PageProvider;
import com.maxsoft.webautomation.common.UiComponentProvider;

import static com.maxsoft.webautomation.util.driver.WebDriverHolder.getDriver;

/**
 * Project Name    : gauge-java-web-ui-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 29/12/23
 * Time            : 10:22 PM
 * Description     :
 **/

public class BaseStepImpl {
    public PageProvider pages() {
        return new PageProvider(getDriver());
    }

    public UiComponentProvider uiComponents() {
        return new UiComponentProvider(getDriver());
    }
}
