package com.commerce.pages;

import com.commerce.BaseTest;
import org.openqa.selenium.By;

public class LoggedInPage  extends BaseTest {

    private static final By SITE_HEADER_LOGO = By.xpath("//a[@class='site-header__logo-link']");
    private static final By CATALOG = By.xpath("//span[@class='site-nav__label'][contains(text(),'Catalog')]");
    private static final By FEATURED_COLLECTION = By.xpath("//h2[contains(text(),'Featured collection')]");
    private static final By FEATURED_COLLECTION_LIST = By.className("grid grid--uniform grid--view-items");

}
