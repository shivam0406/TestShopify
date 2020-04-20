package com.commerce;

import com.commerce.pages.HomePage;
import com.commerce.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage();
    }

    @Test
    public void doLogin() throws InterruptedException {
        loginPage
                .checkLoginPageElement()
                .enterPassword();
        Thread.sleep(10000);
    }
}
