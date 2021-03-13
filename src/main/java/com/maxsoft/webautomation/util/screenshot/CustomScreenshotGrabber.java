package com.maxsoft.webautomation.util.screenshot;

import com.maxsoft.webautomation.util.driver.DriverHolder;
import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class CustomScreenshotGrabber implements ICustomScreenshotGrabber {

    public CustomScreenshotGrabber() {
    }

    // Return a screenshot byte array
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverHolder.driver).getScreenshotAs(OutputType.BYTES);
    }
}
