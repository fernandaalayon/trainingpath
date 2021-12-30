package com.epam.seleniun.training.header.stepdefinitions;

import com.epam.seleniun.training.configuration.ConfigurationConstants;
import com.epam.seleniun.training.header.pageobject.HeaderPageObject;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaderStepDefinitions {

    private HeaderPageObject headerPageObject;

    public HeaderStepDefinitions(HeaderPageObject headerPageObject){
        this.headerPageObject = headerPageObject;
    }

    @When("the user presses the action link My Account")
    public void clickMyAccountButton() {
        assertTrue(headerPageObject.isHeaderMenuVisible(), "There is not header menu");
        assertEquals(ConfigurationConstants.getLoginUrl(), headerPageObject.getCurrentURL() , "URLs are different");
        }
    }
