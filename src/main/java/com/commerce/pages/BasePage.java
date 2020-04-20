package com.commerce.pages;

import com.commerce.BaseTest;
import com.commerce.utils.TestUtils;
import exception.PageNotCurrentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage  extends BaseTest {

    final int DEFAULT_WAIT_TIME_FOR_ELEMENT = 30;

    public void assertCurrentPage(By pageIdentifier) {
        try {
            waitForPresence(pageIdentifier);
        } catch (Exception e) {
            throw new PageNotCurrentException(TestUtils.getCallerClassNameFromThread() + " is not the current app", e);
        }
    }

    public void waitForPresence(By locator) {
        waitForPresence(locator, DEFAULT_WAIT_TIME_FOR_ELEMENT);
    }

    public void waitForPresence(By locator, int waitTimeInSec) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    public void waitForNotPresence(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }


    public void enterText(By locator, String values) {
         driver.findElement(locator).sendKeys(values);

    }


}
