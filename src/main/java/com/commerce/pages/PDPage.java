package com.commerce.pages;

import org.openqa.selenium.By;

public class PDPage extends BasePage {

    private static final By PRODUCT_TITLE = By.xpath("//h1[@class='product-single__title']");
    private static final By PRODUCT_PRICE = By.xpath("//span[@class='price-item price-item--regular']");
    private static final By COLOR_TEXT = By.xpath("//label[contains(text(),'Color')]");
    private static final By SIZE_TEXT = By.xpath("//label[contains(text(),'Size')]");
    private static final By COLOR_DROP_DOWN = By.xpath("//select[@id='SingleOptionSelector-0']");
    private static final By SIZE_DROP_DOWN = By.xpath("//select[@id='SingleOptionSelector-1']");
    private static final By ADD_TO_CART = By.xpath("//span[contains(text(),'Add to cart')]");
    private static final By BUY_IT_NOW = By.xpath("//button[text()='Buy it now']");
    private static final By CART_ICON = By.xpath("//a[@class='site-header__icon site-header__cart']");
    private static final By CART_POP_UP = By.xpath("//div[@class='cart-popup']");
    private static final By CART_POP_UP_PRODUCT_TITLE = By.xpath("//div[@class='cart-popup-item__title']");
    private static final By CART_HEADING = By.id("CartPopupHeading");
    private static final By CART_DISMISS_POP_UP_BUTTON = By.className("cart-popup__dismiss-button text-link text-link--accent");
    private static final By VIEW_CART_BUTTON = By.className("cart-popup__cta-link btn btn--secondary-accent");


}
