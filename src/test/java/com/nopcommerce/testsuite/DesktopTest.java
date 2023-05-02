package com.nopcommerce.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {


    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        // 1.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu();
        //1.2 Click on Desktop
        homePage.clickOnDesktopFromComputerMenuTab();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.selectSortByPositionNameZToA();
        // 1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(getTextFromElement(By.xpath("//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")), "Lenovo IdeaCentre 600 All-in-One PC");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully(){

        // 2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktopFromComputerMenuTab();
        // 2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectSortByPositionNameAToZ();
        //  2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCArtButton();



    }

}
