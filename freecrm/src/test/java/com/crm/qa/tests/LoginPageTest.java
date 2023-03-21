package com.crm.qa.tests;


import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginPageTitleTest(){
        String expectedTitle = "#1 Free CRM Software for every business";
        assertEquals(expectedTitle,loginPage.validateLoginPageTitle());
    }
    @Test
    public void crmLogoImageTest() {
        boolean flag = loginPage.validateCRMImage();
        assertTrue(flag);
    }


}
