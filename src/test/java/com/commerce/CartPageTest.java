package com.commerce;

import com.commerce.pages.CartPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    CartPage cartPage;

    @BeforeClass
    public void beforeClass() {
        cartPage = new CartPage();
    }

    @Test(threadPoolSize = 2)
    public void cartTest() {
        cartPage
                .verifyProductTotal();
    }


    @Test(threadPoolSize = 2)
    public void test2() {
        cartPage
                .changeCountAndGetProductTotal();
    }
}
