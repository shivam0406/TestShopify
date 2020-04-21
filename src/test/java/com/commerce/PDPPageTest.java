package com.commerce;

import com.commerce.pages.HomePage;
import com.commerce.pages.PDPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PDPPageTest extends BaseTest {

    PDPage pdPage;

    @BeforeClass
    public void beforeClass() {
        pdPage = new PDPage();
    }

    @Test(threadPoolSize = 2)
    public void doATC() throws InterruptedException {
        pdPage
                .getProductName()
                .getProductPrice()
                .checkElementOnPDP()
                .checkProductSelectedColor()
                .checkProductSelectedSize()
                .addProductToCart()
                .checkProductInfoInPopup()
                .moveToCartPage();

    }
}