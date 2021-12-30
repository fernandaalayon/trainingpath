package com.epam.seleniun.training.home.stepdefinitions;

import com.epam.seleniun.training.common.BasePageObject;
import com.epam.seleniun.training.configuration.BrowserHook;
import com.epam.seleniun.training.configuration.ConfigurationConstants;
import com.epam.seleniun.training.home.pageobject.HomePageObject;
import io.cucumber.java.en.Given;

public class HomeStepDefinitions {

    private HomePageObject homePageObject;

    public HomeStepDefinitions(HomePageObject homePageObject){
        this.homePageObject = homePageObject;
    }

    @Given("the user is in the main page")
    public void isMainPageVisible() {
        homePageObject.navigateTo(ConfigurationConstants.getBaseUrl());
    }
}
