package com.crm.qa.pages;

import com.crm.qa.base.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    // Page Factory / Object Repository (OR)
    @FindBy(xpath = "//a[text()='Sign Up']")
    WebElement signUpLink;

    @FindBy(xpath = "//a[text()='About']")
    WebElement aboutLink;

    @FindBy(xpath = "//a[text()='CRM']")
    WebElement crmDropDown;

    @FindBy(xpath = "//a[text()='Compare']")
    WebElement compareLink;

    @FindBy(xpath = "//a[text()='Pricing']")
    WebElement pricingLink;

    @FindBy(xpath = "//a[text()='Support']")
    WebElement supportLink;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
    WebElement LoginButton;

    @FindBy(xpath = "//a[@class='brand-name']")
    WebElement crmLogo;

    //Initializing the Page Objects:
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Methods:
    public String validateLoginPageTitle(){
        return Driver.getDriver().getTitle();
    }

    public boolean validateCRMImage(){
        return crmLogo.isDisplayed();
    }
}
