package com.commerce;

import com.commerce.pages.PDPage;
import com.commerce.pages.SearchPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {

    SearchPage searchPage;

    @BeforeClass
    public void beforeClass() {
        searchPage = new SearchPage();
    }

    @Test
    public void searchProduct() {
        searchPage
                .clickOnSearch()
                .enterSearchTerm();
    }


}
