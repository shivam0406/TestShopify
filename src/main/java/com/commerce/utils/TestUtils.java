package com.commerce.utils;

import com.commerce.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestUtils extends BaseTest {


    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICIT_WAIT = 10;

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }

    public static String getCallerClassNameFromThread() {

        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        return stackTraceElement.getClassName();
    }
}
