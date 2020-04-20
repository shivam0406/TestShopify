package com.commerce.pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private static final By CART_PRODDUCT_TITLE = By.className("cart__product-title");
    private static final By CART_PRODUCT_INFO = By.xpath("//div[@class='cart__product-information']//div//ul[@class='product-details']");
    private static final By CART_PRODUCT_PRICE = By.xpath("//dd[contains(text(),'Rs.')]");
    private static final By CART_PRODUCT_COUNT = By.xpath("//div[@class='cart__qty']//child::input");
    private static final By FINAL_PRICE_CART = By.xpath("//td[@class='cart__final-price text-right small--hide']//div//span");
    private static final By FINAL_SUB_TOTAL = By.xpath("//span[@class='cart-subtotal__price']");
    private static final By CART_HEADER = By.className("cart-header__title");
}
