package com.epam.seleniun.training.login.pageobject;

import com.epam.seleniun.training.common.BasePageObject;
import com.epam.seleniun.training.configuration.ConfigurationConstants;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageObject extends BasePageObject {

    public LoginPageObject(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(className = "login")
    private WebElement loginForm;

    @FindBy(id = "username")
    private  WebElement username;

    @FindBy(id= "password")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(id = "rememberme")
    private WebElement rememberMeCheckbox;

    public WebElement getLoginForm() {
        return loginForm;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    public boolean isLoginFormVisible(){
        try {
            this.wait.until(ExpectedConditions.and(
                    ExpectedConditions.titleIs(ConfigurationConstants.getLoginTabTitle()),
                    ExpectedConditions.visibilityOf(getLoginForm())));
            return true;
        }catch (TimeoutException e){
            LOG.error(e.getMessage());
            return false;
        }
    }

    public void inputUsername(String username){
        try {
            this.getUsername().sendKeys(username);
        }catch (NotFoundException e){
            LOG.error(e.getMessage());
        }
    }

    public void inputPassword(String password){
        try {
            this.getPassword().sendKeys(password);
        }catch (NotFoundException e){
            LOG.error(e.getMessage());
        }
    }

    public void clickLoginButton(){
        this.click(this.getLoginButton());
    }

}
