package com.crm.qa.pages;


import com.crm.qa.base.Driver;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    // Page Factory / Object Repository (OR)


    // Initializing the Page Objects:
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // Methods
}
