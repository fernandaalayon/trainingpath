package com.epam.seleniun.training.configuration;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class BrowserHook {

   public static WebDriver driver;

    @Before
    public void setUpDriver(){
        if(ConfigurationConstants.getDriverName().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = (new ChromeDriver());
        }else {
            WebDriverManager.firefoxdriver().setup();
            driver = (new FirefoxDriver());
        }
            LoggingPreferences logPrefs = new LoggingPreferences();
            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
    }

    @After(order = 0)
    public void closeDriver(){
        driver.quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }
}
