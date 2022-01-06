package com.epam.selenium.training.login.stepdefinitions;

import com.epam.selenium.training.configuration.ConfigurationConstants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static com.epam.selenium.training.header.stepdefinitions.HeaderStepDefinitions.loginPageObject;

public class LoginStepDefinition {

    //private LoginPageObject loginPageObject;

//    public LoginStepDefinition(LoginPageObject loginPageObject){
//        this.loginPageObject = loginPageObject;
//    }

    @Then("the user should see the login form")
    public void isLoginFormVisible() {
        assertTrue(loginPageObject.isLoginFormVisible(), "There is not login form");
        assertEquals(ConfigurationConstants.getLoginUrl(), loginPageObject.getCurrentURL() , "URLs are different");
    }

    @When("the user inputs the login data validUser")
    public void inputUserData() {
        assertTrue(loginPageObject.isLoginFormVisible(), "There is not login form");
        assertEquals(ConfigurationConstants.getLoginUrl(), loginPageObject.getCurrentURL() , "URLs are different");
    }
}
