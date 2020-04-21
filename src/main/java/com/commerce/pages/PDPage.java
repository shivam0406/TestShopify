package com.commerce.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PDPage extends BasePage {

    private static final By PRODUCT_TITLE = By.xpath("//h1[@class='product-single__title']");
    private static final By PRODUCT_PRICE = By.xpath("//span[@class='price-item price-item--regular']");
    private static final By COLOR_TEXT = By.xpath("//label[contains(text(),'Color')]");
    private static final By SIZE_TEXT = By.xpath("//label[contains(text(),'Size')]");
    private static final By COLOR_DROP_DOWN = By.xpath("//select[@id='SingleOptionSelector-0']");
    private static final By SIZE_DROP_DOWN = By.xpath("//select[@id='SingleOptionSelector-1']");
    private static final By ADD_TO_CART = By.xpath("//span[contains(text(),'Add to cart')]");
    private static final By BUY_IT_NOW = By.xpath("//button[text()='Buy it now']");
    private static final By CART_POP_UP = By.xpath("//div[@class='cart-popup']");
    private static final By CART_POP_UP_PRODUCT_TITLE = By.xpath("//div[@class='cart-popup-item__title']");
    private static final By CART_HEADING = By.xpath("//h2[@id='CartPopupHeading']");
    private static final By CART_DISMISS_POP_UP_BUTTON = By.xpath("//button[@class='cart-popup__dismiss-button text-link text-link--accent']");
    private static final By VIEW_CART_BUTTON = By.xpath("//div[@class='cart-popup-item']//following-sibling::a");


    public PDPage(){
        assertCurrentPage(ADD_TO_CART);
    }

    public PDPage getProductName() {
        product.put("productFeaturedName",getText(PRODUCT_TITLE));
        return this;
    }

    public PDPage getProductPrice() {
        product.put("productFeaturePrice", getText(PRODUCT_PRICE));
        return this;
    }

    public PDPage checkElementOnPDP() {
        checkElementPresence(COLOR_TEXT);
        checkElementPresence(SIZE_TEXT);
        checkElementPresence(BUY_IT_NOW);
        return this;
    }

    public PDPage checkProductSelectedColor() {
        product.put("productFeatureColor",getSelectedOptionFromDropDown(COLOR_DROP_DOWN));
        return this;
    }

    public PDPage checkProductSelectedSize() {
        product.put("productFeatureSize",getSelectedOptionFromDropDown(SIZE_DROP_DOWN));
        return this;
    }

    public PDPage addProductToCart() {
        clickElement(ADD_TO_CART);
        waitForPresence(CART_POP_UP);
        return this;
    }

    public PDPage checkProductInfoInPopup() {
        waitForPresence(CART_HEADING, 10);
       // Assert.assertTrue(getText(CART_POP_UP_PRODUCT_TITLE).equalsIgnoreCase(product.get("productFeaturedName")));
        waitForPresence(VIEW_CART_BUTTON);
        waitForPresence(CART_DISMISS_POP_UP_BUTTON);
        return this;
    }

    public PDPage moveToCartPage() throws InterruptedException {
        Thread.sleep(5000);
        clickElement(VIEW_CART_BUTTON);
        return this;
    }






}
