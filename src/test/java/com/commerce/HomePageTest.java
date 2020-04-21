package com.commerce;

import com.commerce.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeClass
    public void beforeClass() {
         homePage = new HomePage();
    }

    @Test
    public void validateLandingOfHomePage() {
        homePage
                .checkLOGOText()
                .checkHomePageElement()
                .emailAddressInputText()
                .clickOnLoginUsingPassword();

    }
}
