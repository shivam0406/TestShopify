package com.commerce.pages;

import org.openqa.selenium.By;

public class SearchPage extends BasePage {
    private static final By SEARCH_BUTTON = By.xpath("//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']");
    private static final By SEARCH_BOX_INPUT = By.name("q");
    private static final By SEARCH_BUTTON_CLICK = By.xpath("//button[@class='search-bar__submit search-form__submit']");
    private static final By SEARCH_RESULT_PRODUCT_LIST = By.className("page-width list-view-items");

    public SearchPage() {
        assertCurrentPage(SEARCH_BUTTON);
    }

    public SearchPage clickOnSearch() {
        clickElement(SEARCH_BUTTON);
        return this;
    }

}
