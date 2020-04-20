package com.commerce.pages;

import com.commerce.BaseTest;
import org.openqa.selenium.By;

public class PLPPage extends BaseTest {

    private static final By PRODUCT_COUNT = By.xpath("//span[@class='filters-toolbar__product-count']");
    private static final By PRODUCT_SORT_BY = By.xpath("//label[@class='filters-toolbar__label select-label']");
    private static final By SORT_BY_DROP_DOWN = By.xpath("//select[@id='SortBy']");
    private static final By ALL_PRODUCT_LIST = By.xpath("//ul[@class='grid grid--uniform grid--view-items']");
}
