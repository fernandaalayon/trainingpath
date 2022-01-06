package com.epam.selenium.training.home.pageobject;

import com.epam.selenium.training.common.BasePageObject;
import com.epam.selenium.training.header.pageobject.HeaderPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageObject extends BasePageObject {



    @FindBy(css = "#menu-item-50")
    private WebElement myAccountButton;

    public HomePageObject(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public HeaderPageObject headerPresent(){
        myAccountButton.isDisplayed();
        return new HeaderPageObject(getDriver());
    }
}
