package com.epam.selenium.training.configuration;

import com.epam.selenium.training.home.pageobject.HomePageObject;
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
import org.openqa.selenium.opera.OperaDriver;

public class BrowserHook {

   public static WebDriver driver;

    @Before
    public void setUpDriver(){
        switch (ConfigurationConstants.getBrowser()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = (new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = (new FirefoxDriver());
                break;
            default:
                WebDriverManager.operadriver().setup();
                driver = (new OperaDriver());
                break;
        }
//        if(ConfigurationConstants.getBrowser().equals("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = (new ChromeDriver());
//        }else {
//            WebDriverManager.iedriver().setup();
//            driver = (new InternetExplorerDriver());
//        }
//            LoggingPreferences logPrefs = new LoggingPreferences();
//            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
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

    public static HomePageObject loadingHomePage() {
        return new HomePageObject(driver);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}
