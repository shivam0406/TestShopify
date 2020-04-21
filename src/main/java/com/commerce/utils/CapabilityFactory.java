package com.commerce.utils;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    Capabilities capabilities;

public Capabilities getCapabilities (String browser) {
        if (browser.equals("firefox"))
        capabilities = OptionsManger.getFirefoxOptions();
        else
        capabilities = OptionsManger.getChromeOptions();
        return capabilities;
        }
        }