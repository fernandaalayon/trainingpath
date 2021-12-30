package com.epam.seleniun.training.common;

import com.epam.seleniun.training.configuration.BrowserHook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePageObject {

    private WebDriver driver;
    protected WebDriverWait wait;
    protected static final Logger LOG = LoggerFactory.getLogger(BrowserHook.class);


    public BasePageObject(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void navigateTo(String url){
        driver.get(url);
    }



}
