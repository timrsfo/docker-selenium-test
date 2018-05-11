package com.testautomationguru.container.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    
    @BeforeTest
    public void setUp() throws MalformedURLException {
        
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
        ChromeOptions co = new ChromeOptions();

//        if (System.getProperty("browser").equals("firefox"))
//            dc = DesiredCapabilities.firefox();

        String host = System.getProperty("seleniumHubHost");
//        driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), dc);
        System.out.println("selniumHubHost: " + host);
        driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), co);
        System.out.println("past remote web driver ...");
        
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
    }  
}
