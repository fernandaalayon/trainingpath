package com.epam.seleniun.training.header.pageobject;

import com.epam.seleniun.training.common.BasePageObject;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPageObject extends BasePageObject {

    public HeaderPageObject(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(id = "header")
    private WebElement headerMenu;

    @FindBy(id= "site-logo")
    private WebElement siteLogo;

    @FindBy(id = "searchform")
    private WebElement headerSearchForm;

    @FindBy(id = "menu-item-40")
    private WebElement shopButton;

    @FindBy(id = "menu-item-50")
    private WebElement myAccountButton;

    @FindBy(id = "menu-item-224")
    private WebElement testCasesButton;

    @FindBy(id = "menu-item-244")
    private WebElement aTSiteButton;

    @FindBy(id = "menu-item-251")
    private WebElement demoSiteButton;

    @FindBy(id = "wpmenucartli")
    private WebElement cart;

    @FindBy(className = "cartcontents")
    private WebElement cartContent;

    @FindBy(className = "amount")
    private WebElement cartAmount;

    public WebElement getHeaderMenu() {
        return headerMenu;
    }

    public WebElement getSiteLogo() {
        return siteLogo;
    }

    public WebElement getHeaderSearchForm() {
        return headerSearchForm;
    }

    public WebElement getShopButton() {
        return shopButton;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getTestCasesButton() {
        return testCasesButton;
    }

    public WebElement getaTSiteButton() {
        return aTSiteButton;
    }

    public WebElement getDemoSiteButton() {
        return demoSiteButton;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getCartContent() {
        return cartContent;
    }

    public WebElement getCartAmount() {
        return cartAmount;
    }

    public boolean isHeaderMenuVisible() {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(getHeaderMenu()));
            return true;
        }catch (TimeoutException e){
            LOG.error(e.getMessage());
            return false;
        }
    }

    public void clickMyAccountButton(){
        try{
            this.click(getMyAccountButton());
        }catch (TimeoutException e){
            LOG.error(e.getMessage());
        }
    }
}
