package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    HomePage homePage = new HomePage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatTheProductAddedToSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']")), "Cell phones");
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();

        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnProductNameNokiaLumiaLink();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Nokia Lumia 1020']")), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@id='price-value-20']")), "$349.00");
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantityTo2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickAddToCartTab();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(getTextFromElement(By.xpath("//p[@class='content']")), "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        nokiaLumia1020Page.afterThatCloseTheBarClickingOnTheCrossButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.moseHoverOnShoppingCartAndClickOnGoToCartButton();
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
        //2.13 Verify the quantity is 2
       // Assert.assertEquals(getTextFromElement(By.xpath("(//tbody//td[@class='quantity']//input[@id='itemquantity11236']")), "2");
        //2.14 Verify the Total $698.00
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]")), "$698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckboxIAgreeWithTheTermsOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButtonAfterAddingNokiaLumia();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")), "Welcome, Please Sign In!");
        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterTab();
        //2.19 Verify the text “Register”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Register']")), "Register");
        //2.20 Fill the mandatory fields
        registerPage.fillTheMandatoryFieldsForRegistration();
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "Your registration completed");
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTabOnRegisterPage();




    }
}
