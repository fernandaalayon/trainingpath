package com.epam.seleniun.training.login.stepdefinitions;

import com.epam.seleniun.training.configuration.ConfigurationConstants;
import com.epam.seleniun.training.login.pageobject.LoginPageObject;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDefinition {

    private LoginPageObject loginPageObject;

    public LoginStepDefinition(LoginPageObject loginPageObject){
        this.loginPageObject = loginPageObject;
    }

    @Then("the user should see the login form")
    public void isLoginFormVisible() {
        assertTrue(loginPageObject.isLoginFormVisible(), "There is not login form");
        assertEquals(ConfigurationConstants.getLoginUrl(), loginPageObject.getCurrentURL() , "URLs are different");
    }
}
