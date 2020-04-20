package com.commerce.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    private static final By ENTER_USING_PASSWORD = By.xpath("//a[@aria-haspopup='dialog']");
    private static final By LOGO = By.xpath("//span[@class='logo']");
    private static final By NOTIFY_ME = By.xpath("//span[contains(text(),'Notify me')]");


}
