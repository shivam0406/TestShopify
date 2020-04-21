package com.commerce;

import com.commerce.pages.LoggedInPage;
import com.commerce.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggedInPageTest extends BaseTest {

    LoggedInPage loggedInPage;

    @BeforeClass
    public void beforeClass() {
        loggedInPage = new LoggedInPage();
    }

    @Test
    public void doLogin() throws InterruptedException {
        loggedInPage
                .checkLoggedInPageElement()
                .getProduct();
    }
}
