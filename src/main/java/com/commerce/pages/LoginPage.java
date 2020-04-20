package com.commerce.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By ENTER_STORE_USING_PASSWORD_TEXT = By.xpath("//h2");
    private static final By PASSWORD_INPUT = By.xpath("//input[@id='Password']");
    private static final By ENTER_BUTTON= By.xpath("//button[contains(text(),'Enter')]");
    private static final By CLOSE_BUTTON = By.xpath("//button[@class='modal__close js-modal-close text-link']");
    private static final By HOME_TEXT = By.xpath("//span[@class='site-nav__label'][contains(text(),'Home')]");


    public LoginPage() {
        assertCurrentPage(ENTER_STORE_USING_PASSWORD_TEXT);
    }

    public LoginPage checkLoginPageElement() {
        checkElementPresence(ENTER_BUTTON);
        checkElementPresence(CLOSE_BUTTON);
        return this;
    }

    public LoginPage enterPassword() {
        checkPlaceHolderText(PASSWORD_INPUT, "Your password", "placeholder");
        setText(PASSWORD_INPUT, "idgad");
        clickElement(ENTER_BUTTON);
        checkElementPresence(HOME_TEXT);
        return this;
    }



}
