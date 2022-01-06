package com.epam.selenium.training.header.stepdefinitions;

import com.epam.selenium.training.header.pageobject.HeaderPageObject;
import com.epam.selenium.training.login.pageobject.LoginPageObject;
import io.cucumber.java.en.When;

import static com.epam.selenium.training.home.stepdefinitions.HomeStepDefinitions.homePageObject;

public class HeaderStepDefinitions {

    public static HeaderPageObject headerPageObject;
    public static LoginPageObject loginPageObject;

//    public HeaderStepDefinitions(HeaderPageObject headerPageObject){
//        this.headerPageObject = headerPageObject;
//    }

    @When("the user presses the action link My Account")
    public void clickMyAccountButton() {
        headerPageObject = homePageObject.headerPresent();
//        assertTrue(headerPageObject.isHeaderMenuVisible(), "There is not header menu");
        loginPageObject = headerPageObject.clickMyAccountButton();
        //assertEquals(ConfigurationConstants.getLoginUrl(), headerPageObject.getCurrentURL() , "URLs are different");
        }
    }
