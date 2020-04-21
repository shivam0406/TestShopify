package com.commerce;

import com.commerce.utils.TestUtils;
import com.commerce.utils.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    public static void initialization(String myBrowser) {
//        String browserName = prop.getProperty("browser");

        if (myBrowser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/shivamgupta/Desktop/chromedriver");
            driver = new ChromeDriver();
//            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments()
        } else if (myBrowser.equalsIgnoreCase("FF")) {
            System.setProperty("webdriver.gecko.driver", "/Users/shivamgupta/Desktop/geckodriver");
            driver = new FirefoxDriver();
        }


        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
    //    driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
     //   driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);


        driver.get(prop.getProperty("url"));
    }


    @Parameters("myBrowser")
    @BeforeTest
    public void beforeTest(String myBrowser) {
        System.out.println("In Before Suite");
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/commerce"
                    + "/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        initialization(myBrowser);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("In After Test");

    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
        driver.quit();
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("We are in before Method");
    }


    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TestUtils.takeScreenshotAtEndOfTest();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

