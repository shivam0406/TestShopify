package com.commerce.pages;

import com.commerce.BaseTest;
import com.commerce.utils.TestUtils;
import exception.PageNotCurrentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.*;

public class BasePage  extends BaseTest {

    final int DEFAULT_WAIT_TIME_FOR_ELEMENT = 30;
    WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME_FOR_ELEMENT);

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

    public void checkElementPresence(By locator) {
        assertTrue(driver.findElement(locator).isDisplayed());
    }


    public void waitForNotPresence(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }


    public void setText(By locator, String values) {
         driver.findElement(locator).sendKeys(values);

    }

    public String getText(By locator) {
       return driver.findElement(locator).getText();
    }


    public void validateText(By locator,String text) {
        assertEquals(getText(locator), text);
    }

    public void checkPlaceHolderText(By locator, String text, String attribute) {
        Assert.assertEquals(text, driver.findElement(locator).getAttribute(attribute));
    }


}
