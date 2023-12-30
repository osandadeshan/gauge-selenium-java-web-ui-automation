package com.maxsoft.webautomation.common.constant;

/**
 * Project Name : Web-Cross-Browser-Automation-Demo
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/25/2018
 * Time         : 2:37 PM
 * Description  :
 **/

public enum NavigationBarOption {
    HOME("Home"),
    CONTACT("Contact"),
    ABOUT_US("About us"),
    CART("Cart"),
    LOG_IN("Log in"),
    SIGN_UP("Sign up");

    private final String navBarItemName;

    NavigationBarOption(String navBarItemName) {
        this.navBarItemName = navBarItemName;
    }

    public String getName() {
        return navBarItemName;
    }
}
