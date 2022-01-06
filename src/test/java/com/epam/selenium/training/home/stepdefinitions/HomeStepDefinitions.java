package com.epam.selenium.training.home.stepdefinitions;

import com.epam.selenium.training.configuration.BrowserHook;
import com.epam.selenium.training.home.pageobject.HomePageObject;
import com.epam.selenium.training.configuration.ConfigurationConstants;
import io.cucumber.java.en.Given;

import static com.epam.selenium.training.configuration.BrowserHook.navigateTo;

public class HomeStepDefinitions {

    public static HomePageObject homePageObject;

//    public HomeStepDefinitions(HomePageObject homePageObject){
//        this.homePageObject = homePageObject;
//    }

    @Given("the user is in the main page")
    public void isMainPageVisible() {
        navigateTo(ConfigurationConstants.getBaseUrl());
        homePageObject = BrowserHook.loadingHomePage();
    }
}
