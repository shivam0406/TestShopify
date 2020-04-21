package com.commerce.pages;

import com.commerce.BaseTest;
import com.commerce.utils.TestUtils;
import exception.PageNotCurrentException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;

import static org.testng.Assert.*;

public class BasePage  extends BaseTest {

    final int DEFAULT_WAIT_TIME_FOR_ELEMENT = 30;
    WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME_FOR_ELEMENT);
    LinkedHashMap<String, String> product = new LinkedHashMap<String, String>();
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
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).click();
    }


    public void setText(By locator, String values) {
        driver.findElement(locator).sendKeys(values);

    }

    public void setCount(By locator, int values) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys("2", Keys.TAB);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public String getPlaceHolderText(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public void clickFirstProductOfList() {
        List<WebElement> pclass = driver.findElements(By.xpath("//ul[@class='grid grid--uniform grid--view-items']/child::li/child::div/child::a"));
        pclass.get(1).click();
    }


    public String getSelectedOptionFromDropDown (By locator) {
        Select select =new Select(driver.findElement(locator));
        return select.getFirstSelectedOption().getText();
    }

    public void productTotal(By locator1, By locator2, By locator3) {
        float price =   getPrice(locator1);
        int count =  getCount(locator2);
        float TotalPrice = price * count;
        System.out.println("Our Total Price is" + TotalPrice);
        float finalCartPrice = getPrice(locator3);
        Assert.assertEquals(finalCartPrice, TotalPrice);
    }

    public float getPrice(By locator) {
        String[] text = driver.findElement(locator).getText().split(" ");
        return  Float.parseFloat(text[1].replace(",", ""));
    }

    public int getCount(By locator) {
        String count = getPlaceHolderText(locator, "value");
        System.out.println("count is" + count);
        int pcount = Integer.parseInt(count);
        return pcount;
    }

    public void changeCount(By locator, int count) {
        setCount(locator, count);

    }

}
