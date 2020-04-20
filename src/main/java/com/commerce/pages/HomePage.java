package com.commerce.pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {


    private static final By ENTER_USING_PASSWORD = By.xpath("//a[@aria-haspopup='dialog']");
    private static final By LOGO = By.xpath("//span[@class='logo']");
    private static final By NOTIFY_ME = By.xpath("//span[contains(text(),'Notify me')]");
    private static final By EMAIL_FIELD_INPUT  = By.id("PasswordNewsletterForm-email");


    public HomePage() {
        assertCurrentPage(LOGO);
    }

    public HomePage checkLOGOText() {
        validateText(LOGO, "ecom.optimus");
        return this;
    }

    public HomePage checkHomePageElement() {
        checkElementPresence(NOTIFY_ME);
        return this;
    }

    public HomePage emailAddressInputText() {
        checkPlaceHolderText(EMAIL_FIELD_INPUT, "Email address", "placeholder");
        return this;
    }

    public HomePage clickOnLoginUsingPassword() {
        clickElement(ENTER_USING_PASSWORD);
        return this;
    }



}
