package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();


    @Test
    public void verifyPageNavigation() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(getTextFromElement(By.linkText("Computers")), "Computers");
    }
    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){

        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu(); //1.1 Click on Computer Menu.
        homePage.clickOnDesktopFromComputerMenuTab(); // 1.2 Click on Desktop

    }

}
