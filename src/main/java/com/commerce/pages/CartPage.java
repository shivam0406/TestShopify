package com.commerce.pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private static final By CART_PRODUCT_TITLE = By.xpath("//a[@class='cart__product-title']");
    private static final By CART_PRODUCT_INFO = By.xpath("//div[@class='cart__product-information']//div//ul[@class='product-details']");
    private static final By CART_PRODUCT_PRICE = By.xpath("//dd[contains(text(),'Rs.')]");
    private static final By CART_PRODUCT_COUNT = By.xpath("//div[@class='cart__qty']//child::input");
    private static final By FINAL_PRICE_CART = By.xpath("//td[@class='cart__final-price text-right small--hide']//div//span");
    private static final By FINAL_SUB_TOTAL = By.xpath("//span[@class='cart-subtotal__price']");
    private static final By CART_HEADER = By.xpath("//h1[@class='cart-header__title']");
    private static final By VIEW_CART_BUTTON = By.xpath("//a[@class='cart-popup__cta-link btn btn--secondary-accent']");
    private static final By CART_ICON = By.xpath("//a[@class='site-header__icon site-header__cart']");
    private static final By REMOVE_BUTTON = By.xpath("//a[contains(text(),'Remove')]");
    private static final By CART_REMOVE_MESSAGE = By.xpath("//p[@class='cart--empty-message']");




    public CartPage() {
        assertCurrentPage(CART_HEADER);
    }

    public CartPage changeTheProductCount() {

        return this;
    }

    public CartPage verifyProductTotal() {
        productTotal(CART_PRODUCT_PRICE, CART_PRODUCT_COUNT, FINAL_PRICE_CART);
        return this;
    }

    public CartPage changeCountAndGetProductTotal() {
        changeCount(CART_PRODUCT_COUNT,2);
        productTotal(CART_PRODUCT_PRICE, CART_PRODUCT_COUNT, FINAL_PRICE_CART);
        return this;
    }

    public CartPage removeProductFromCart() {
        clickElement(REMOVE_BUTTON);
        waitForPresence(CART_REMOVE_MESSAGE,10);
        return this;
    }











}
