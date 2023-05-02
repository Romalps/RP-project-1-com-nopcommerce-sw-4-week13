package com.nopcommerce.testsuite;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildYourOwnComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        // 2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktopFromComputerMenuTab();
        // 2.3 Select Sort By position "Name: A to Z" and
        desktopPage.selectSortByPositionNameAToZ();
        //  2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCArtButton();
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Build your own computer']")), "Build your own computer");
        buildYourOwnComputerPage.buildYourOwnComputer();


        // 2.11 Verify the price "$1,475.00"
        //Assert.assertEquals(getTextFromElement(By.id("price-value-1")), "$1475.00");
        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCartButton();

        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(getTextFromElement(By.className("content")), "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.closeTheBarClickingOnTheCrossButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverOnShoppingCartAndClickOnGoTOCartButton();


    }

}
