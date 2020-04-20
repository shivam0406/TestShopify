package com.commerce.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By ENTER_STORE_USING_PASSWORD_TEXT = By.xpath("//h2");
    private static final By PASSWORD_INPUT = By.xpath("//label[@id='PasswordLabel']");
    private static final By ENTER_BUTTON= By.xpath("//button[contains(text(),'Enter')]");
    private static final By CLOSE_BUTTON = By.xpath("//button[@class='modal__close js-modal-close text-link']");



}
