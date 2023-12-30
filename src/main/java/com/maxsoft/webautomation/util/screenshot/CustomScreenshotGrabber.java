package com.maxsoft.webautomation.util.screenshot;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.screenshot.CustomScreenshotWriter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import static com.maxsoft.webautomation.util.driver.WebDriverHolder.getDriver;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public class CustomScreenshotGrabber implements CustomScreenshotWriter {
    @Override
    public String takeScreenshot() {
        TakesScreenshot driver = (TakesScreenshot) getDriver();
        String screenshotFileName = String.format("screenshot-%s.png", UUID.randomUUID());
        try {
            Files.write(Path.of(System.getenv("gauge_screenshots_dir"), screenshotFileName),
                    driver.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            Logger.error("Failed to save the screenshot.");
            Logger.error(e.getMessage());
        }
        return screenshotFileName;
    }
}
