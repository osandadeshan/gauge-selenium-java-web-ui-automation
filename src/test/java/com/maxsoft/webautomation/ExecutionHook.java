package com.maxsoft.webautomation;

import com.maxsoft.webautomation.util.driver.WebDriverFactory;
import com.maxsoft.webautomation.util.driver.WebDriverService;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;

import static com.maxsoft.webautomation.common.constant.ApplicationConstants.APPLICATION_URL;
import static com.maxsoft.webautomation.common.constant.ApplicationConstants.IMPLICIT_WAIT_IN_SECONDS;
import static com.maxsoft.webautomation.util.driver.WebDriverHolder.getDriver;
import static com.maxsoft.webautomation.util.driver.WebDriverHolder.setDriver;

/**
 * Project Name    : gauge-java-web-ui-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 29/12/23
 * Time            : 10:00 PM
 * Description     :
 **/

public class ExecutionHook {
    private final WebDriverService driverService = new WebDriverFactory().getDriverService();

    @BeforeScenario
    public void beforeScenario() {
        driverService.spinUpDriver();
        setDriver(driverService.getDriver());
        getDriver().manage().timeouts().implicitlyWait(IMPLICIT_WAIT_IN_SECONDS);
        getDriver().manage().window().maximize();
        getDriver().get(APPLICATION_URL);
    }

    @AfterScenario
    public void afterScenario() {
        driverService.closeDriver();
    }
}
