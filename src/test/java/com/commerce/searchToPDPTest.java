package com.commerce;

import com.commerce.pages.CartPage;
import com.commerce.pages.PDPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class searchToPDPTest extends BaseTest {

    PDPage pdPage;

    @BeforeClass
    public void beforeClass() {
        pdPage = new PDPage();
    }

    @Test
    public void changeProductVariant() {
        pdPage
                .selectSomeOtherColor()
                .selectSomeOtherSize()
                .addProductToCart()
                .checkProductInfoInPopup()
                .moveToCartPage();
    }


}
