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

    @Test
    public void cartTest() {
        cartPage
                .verifyProductTotal();
    }


    @Test
    public void verifyCartOnQuantity() {
        cartPage
                .changeCountAndGetProductTotal();
    }

    @Test
    public void clearCart() {
        cartPage
                .removeProductFromCart();
    }
}
