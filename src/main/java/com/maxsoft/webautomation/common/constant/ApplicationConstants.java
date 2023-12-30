package com.maxsoft.webautomation.common.constant;

import java.time.Duration;

/**
 * Project Name    : web-cross-browser-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 3/13/2021
 * Time            : 6:42 PM
 * Description     :
 **/

public class ApplicationConstants {
    public static final String APPLICATION_URL = System.getenv("application_endpoint");
    public static final Duration EXPLICIT_WAIT_IN_SECONDS = Duration.ofSeconds(30);
    public static final Duration IMPLICIT_WAIT_IN_SECONDS = Duration.ofSeconds(30);
}
