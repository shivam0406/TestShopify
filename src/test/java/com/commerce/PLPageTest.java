package com.commerce;

import com.commerce.pages.PLPPage;
import com.commerce.pages.SearchPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PLPageTest extends BaseTest {

    PLPPage plpPage;

    @BeforeClass
    public void beforeClass() {
        plpPage = new PLPPage();
    }

    @Test
    public void landOnProductDescPage() {
        plpPage
                .landOnPDPForSearchPage();

}}

